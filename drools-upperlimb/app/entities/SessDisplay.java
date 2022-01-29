package entities;

import drools.DiagInfo;

public class SessDisplay {
    private String diag;
    private Boolean as;
    private float elastics;
    private String message;
    private String userID;
    private String sessionID;
    private float muscAct1;
    private float muscAct2;
    private float muscAct3;
    private float muscAct4;
    private float RMS1;
    private float RMS2;
    private float RMS3;
    private float RMS4;
    private float MVC1;
    private float MVC2;
    private float MVC3;
    private float MVC4;



    public SessDisplay() {
        this.sessionID = "sesion_default";

    }

    public SessDisplay(entities.Sess sess,String message, float elastics, String diag, Boolean as) {
        this.as = as;
        this.diag = diag;
        this.elastics = elastics;
        this.userID = sess.getUserID();
        this.sessionID = sess.getSessionID();
        this.muscAct1 = sess.getMuscAct1();
        this.muscAct2 = sess.getMuscAct2();
        this.muscAct3 = sess.getMuscAct3();
        this.muscAct4 = sess.getMuscAct4();
        this.RMS1 = sess.getRMS1();
        this.RMS2 = sess.getRMS2();
        this.RMS3 = sess.getRMS3();
        this.RMS4 = sess.getRMS4();
        this.MVC1 = sess.getMVC1();
        this.MVC2 = sess.getMVC2();
        this.MVC3 = sess.getMVC3();
        this.MVC4 = sess.getMVC4();
        this.message = message;
    }

    public String getDiag() {
        return diag;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }

    public Boolean getAs() {
        return as;
    }

    public void setAs(Boolean as) {
        this.as = as;
    }

    public float getElastics() {
        return elastics;
    }

    public void setElastics(float elastics) {
        this.elastics = elastics;
    }

    public SessDisplay(String userID, String sessionID, float muscAct1, float muscAct2, float muscAct3, float muscAct4,
                       float RMS1, float RMS2, float RMS3, float RMS4, float MVC1, float MVC2, float MVC3, float MVC4) {
        this.userID = userID;
        this.sessionID = sessionID;
        this.muscAct1 = muscAct1;
        this.muscAct2 = muscAct2;
        this.muscAct3 = muscAct3;
        this.muscAct4 = muscAct4;
        this.RMS1 = RMS1;
        this.RMS2 = RMS2;
        this.RMS3 = RMS3;
        this.RMS4 = RMS4;
        this.MVC1 = MVC1;
        this.MVC2 = MVC2;
        this.MVC3 = MVC3;
        this.MVC4 = MVC4;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public float getMuscAct1() {
        return muscAct1;
    }

    public void setMuscAct1(float muscAct1) {
        this.muscAct1 = muscAct1;
    }

    public float getMuscAct2() {
        return muscAct2;
    }

    public void setMuscAct2(float muscAct2) {
        this.muscAct2 = muscAct2;
    }

    public float getMuscAct3() {
        return muscAct3;
    }

    public void setMuscAct3(float muscAct3) {
        this.muscAct3 = muscAct3;
    }

    public float getMuscAct4() {
        return muscAct4;
    }

    public void setMuscAct4(float muscAct4) {
        this.muscAct4 = muscAct4;
    }

    public float getRMS1() {
        return RMS1;
    }

    public void setRMS1(float RMS1) {
        this.RMS1 = RMS1;
    }

    public float getRMS2() {
        return RMS2;
    }

    public void setRMS2(float RMS2) {
        this.RMS2 = RMS2;
    }

    public float getRMS3() {
        return RMS3;
    }

    public void setRMS3(float RMS3) {
        this.RMS3 = RMS3;
    }

    public float getRMS4() {
        return RMS4;
    }

    public void setRMS4(float RMS4) {
        this.RMS4 = RMS4;
    }

    public float getMVC1() {
        return MVC1;
    }

    public void setMVC1(float MVC1) {
        this.MVC1 = MVC1;
    }

    public float getMVC2() {
        return MVC2;
    }

    public void setMVC2(float MVC2) {
        this.MVC2 = MVC2;
    }

    public float getMVC3() {
        return MVC3;
    }

    public void setMVC3(float MVC3) {
        this.MVC3 = MVC3;
    }

    public float getMVC4() {
        return MVC4;
    }

    public void setMVC4(float MVC4) {
        this.MVC4 = MVC4;
    }

    @Override
    public String toString() {
        return "Sess{" +
                "userID='" + userID + '\'' +
                ", sessionID='" + sessionID + '\'' +
                ", muscAct1=" + muscAct1 +
                ", muscAct2=" + muscAct2 +
                ", muscAct3=" + muscAct3 +
                ", muscAct4=" + muscAct4 +
                ", RMS1=" + RMS1 +
                ", RMS2=" + RMS2 +
                ", RMS3=" + RMS3 +
                ", RMS4=" + RMS4 +
                ", MVC1=" + MVC1 +
                ", MVC2=" + MVC2 +
                ", MVC3=" + MVC3 +
                ", MVC4=" + MVC4 +
                '}';
    }
    /*public Sess(){
        this.session_id=""+numSessions++;
        time+=60*1000;
        this.timestamp=new Date(time);
        for(int i=0; i<100;i++){
            this.imu_data.add(new ImuData(time+i));
            this.emg_data.add(new EmgData(time+i));
        }
    }*/


}

