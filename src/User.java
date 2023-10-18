import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private String uID;
    private String uname;
    private String usex;
    private String upwd;
    private String uaddress;
    private String utel;
    private LocalDateTime uTime;

    public User() {
    }

    public User(String uID, String uname, String usex, String upwd, String uaddress, String utel, LocalDateTime uTime) {
        this.uID = uID;
        this.uname = uname;
        this.usex = usex;
        this.upwd = upwd;
        this.uaddress = uaddress;
        this.utel = utel;
        this.uTime = uTime;
    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public LocalDateTime getuTime() {
        return uTime;
    }

    public void setuTime(LocalDateTime uTime) {
        this.uTime = uTime;
    }
    public String toString(){
        return "User [uID=" + uID + ", uname=" + uname + ", usex=" + usex + ", upwd=" + upwd + ", uaddress=" + uaddress +
                ", utel=" + utel + ", utime" + uTime + "]";
    }
}
