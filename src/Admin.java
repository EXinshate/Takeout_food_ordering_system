import java.security.PrivateKey;

public class Admin {
    private String aID;
    private  String account;
    private String apwd;
    public Admin(){
    }

    public Admin(String aID, String account, String apwd) {
        this.aID = aID;
        this.account = account;
        this.apwd = apwd;
    }

    public String getaID() {
        return aID;
    }

    public void setaID(String aID) {
        this.aID = aID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public String toString(){
        return "Admin [aID = " + aID + " + "+ ", account=" + account + ",  apwd="  + apwd + ";]";
    }
}