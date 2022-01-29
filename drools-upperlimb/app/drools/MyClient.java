package drools;
import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.*;
import play.libs.ws.*;
import java.util.concurrent.*;

import static play.mvc.Results.ok;

public class MyClient implements WSBodyReadables, WSBodyWritables{
    private final WSClient ws;

    @Inject
    public MyClient(WSClient ws) {
        this.ws = ws;
    }


    public CompletionStage<Result> indexSess(String userId, String sessionId) {
        String idUrl = "http://localhost:9000/patients/"+userId+"/sessions/" + sessionId;
        return ws.url(idUrl).get().thenApply(response ->
                ok(response.asJson())
        );}

    public CompletionStage<JsonNode> jsonNodeSess(String userId, String sessionId){
        String idUrl = "http://localhost:9000/patients/"+userId+"/sessions/" + sessionId;
        return ws.url(idUrl).get().thenApply(WSResponse::asJson);
    }





    public CompletionStage<Result> index() {
        return ws.url("http://localhost:9000/patients/id1").get().thenApply(response ->
                ok(response.asJson())
        );}

    public CompletionStage<JsonNode> jsonNode(){
        return ws.url("http://localhost:9000/patients/id1").get().thenApply(WSResponse::asJson);
    }
    public CompletionStage<Result> indexSessUser(String userId) {
        String idUrl = "http://localhost:9000/patients/"+userId+"/sessions/" ;
        return ws.url(idUrl).get().thenApply(response ->
                ok(response.asJson())
        );}

    public CompletionStage<JsonNode> jsonNodeSessUser(String userId){
        String idUrl = "http://localhost:9000/patients/"+userId+"/sessions/";
        return ws.url(idUrl).get().thenApply(WSResponse::asJson);
    }


}

