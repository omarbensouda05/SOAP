package ws;

//import java.util.Date;
public class Compte {
    private  int code;
    private  double solde;
    //private Date dateCreation;

    public int getCode() {
        return code;
    }

    public Compte() {
    }

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
       // this.dateCreation = dateCreation;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
