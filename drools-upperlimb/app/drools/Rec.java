package drools;

public class Rec {

    public static final int INIT  = 0;
    public static final int DONE = 1;

    private String rec;
    private int status;

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
