package controllers;

import com.fasterxml.jackson.core.JsonParseException;
import drools.Rec;
import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.*;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import drools.Message;
import drools.MyClient;
import drools.DiagInfo;

import javax.inject.Inject;

import entities.Patient;
import entities.Sess;
import entities.SessDisplay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.libs.ws.WSClient;
import play.libs.ws.WSResponse;
import play.libs.ws.ahc.AhcCurlRequestLogger;
import play.mvc.Result;
import play.libs.Json;
import play.libs.ws.WSBodyReadables;

import play.shaded.ahc.org.asynchttpclient.*;
import play.libs.ws.*;
import play.libs.ws.ahc.*;

import views.html.showResult;
import views.html.message;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class DroolsController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     * 
     */
    private final Logger log = LoggerFactory.getLogger(DroolsController.class);
    public String url = "https://localhost:9000/patients/id2";
    private int port;
    @Inject
    WSClient ws;


    public Result simpleGet() throws Exception {

        MyClient client = new MyClient(ws);
        JsonNode jn = client.jsonNode().toCompletableFuture().get();
        JsonNode in = jn.get("response");
        System.out.println(in.get("userID").asText());
        Patient patient = Json.fromJson(in, Patient.class);

        //System.out.println(patient);
        //String userId = jn.get("userID").asText();
        //System.out.println(userId);

        String prettyString = jn.toPrettyString();
        System.out.println(prettyString);

        try {
            KieServices ks1 = KieServices.Factory.get();
            //GET O NEW?
            KieContainer kContainer1 = ks1.newKieClasspathContainer();
            //Get the session named kseesion-rule that we defined in kmodule.xml above.
            //Also by default the session returned is always stateful.
            KieSession kieSession1 = kContainer1.newKieSession("upperlimb-rules");

            final Message message = new Message();
            message.setMessage("hello, world");
            message.setStatus(Message.HELLO);
            kieSession1.insert(patient);
            kieSession1.insert(message);
            kieSession1.fireAllRules();

        } catch (Throwable t) {
            t.printStackTrace();
        }
        return client.index()
                    .toCompletableFuture()
                    .get();


    }

    public Result simpleGetSess(String userId, String sessionId, Float elastics, String diag, Boolean assist) throws Exception {

        Float muscComp1 = 0f;
        Float muscComp2 = 0f;


        MyClient client = new MyClient(ws);
        JsonNode jn = client.jsonNodeSess(userId, sessionId).toCompletableFuture().get();
        JsonNode in = jn.get("response");
        try{
            System.out.println(in.get("userID").asText());
        }catch (NullPointerException npe){
            return ok("SESSION NOT FOUND, check session or user ID");

        }

        Sess sess = Json.fromJson(in, Sess.class);


        if(diag.equalsIgnoreCase("BA")){
            if(assist==true) {
                muscComp1 = (-2.5755f * (elastics-0.5f)) + 46.968f;
                muscComp2 = (-2.5755f * (elastics+0.5f)) + 46.968f;
            }else{
                muscComp1 = (1.0088f*(elastics-0.5f)) + 46.97f;
                muscComp2 = (1.0088f*(elastics+0.5f)) + 46.97f;

            }
        }else{
            if(assist==true) {
                muscComp1 = (3.5938f * (elastics-0.5f) + 12.846f);
                muscComp2 = (3.5938f * (elastics+0.5f) + 12.846f);
            }else{
                muscComp1 = (-0.1827f *(elastics-0.5f) + 12.74f);
                muscComp2 = (-0.1827f *(elastics+0.5f) + 12.74f);

            }
        }
        //System.out.println(patient);
        //String userId = jn.get("userID").asText();
        //System.out.println(userId);

        String prettyString = jn.toPrettyString();
        System.out.println(prettyString);
        String res = new String();
        DiagInfo di = new DiagInfo();
        try {
            KieServices ks1 = KieServices.Factory.get();
            //GET O NEW?
            KieContainer kContainer1 = ks1.newKieClasspathContainer();
            //Get the session named kseesion-rule that we defined in kmodule.xml above.
            //Also by default the session returned is always stateful.
            KieSession kieSession1 = kContainer1.newKieSession("upperlimb-rules");

            final Rec rec= new Rec();
            final DiagInfo diagInfo = new DiagInfo();
            diagInfo.setDiag(diag);
            diagInfo.setMuscComp1(muscComp1);
            diagInfo.setMuscComp2(muscComp2);
            diagInfo.setAssist(assist);
            rec.setRec("hello, world");
            rec.setStatus(Rec.INIT);

            kieSession1.insert(sess);
            kieSession1.insert(diagInfo);
            kieSession1.insert(rec);
            kieSession1.fireAllRules();
            res = rec.getRec();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        SessDisplay sd=new SessDisplay(sess, res, elastics, diag, assist);
        /*return client.indexSess(userId, sessionId)
                .toCompletableFuture()
                .get();*/
        return ok(showResult.render(sd));


    }
    

    public Result index() {

        /*try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            //Get the session named kseesion-rule that we defined in kmodule.xml above.
            //Also by default the session returned is always stateful.
            KieSession kieSession = kContainer.newKieSession("upperlimb-rules");

            final Message message = new Message();
            message.setMessage("hello, world");
            message.setStatus(Message.HELLO);
            kieSession.insert(message);
            kieSession.fireAllRules();

        } catch (Throwable t) {
            t.printStackTrace();
        }*/


        return ok("rules are running... check the console.");
    }

}
