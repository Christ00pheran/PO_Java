package pl.imiajd.adamowicz;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String n_ulica, int n_numer_domu, int n_numer_mieszkania, String n_miasto, String n_kod_pocztowy){
        this.ulica=n_ulica;
        this.numer_domu=n_numer_domu;
        this.numer_mieszkania=n_numer_mieszkania;
        this.miasto=n_miasto;
        this.kod_pocztowy=n_kod_pocztowy;
    }
    public Adres(String n_ulica, int n_numer_domu, int n_numer_mieszkania, String n_miasto, String n_kod_pocztowy){
        this.ulica=n_ulica;
        this.numer_domu=n_numer_domu;
        this.miasto=n_miasto;
        this.kod_pocztowy=n_kod_pocztowy;
    }
    private void pokaz(){
        System.out.println(this.kod_pocztowy+" "+this.miasto+"\n");
        System.out.println(this.ulica+" "+this.numer_domu+" "+this.numer_mieszkania);
    }
    public boolean przed(String kodP){
        return kodP.equals(kod_pocztowy);
    }
}
