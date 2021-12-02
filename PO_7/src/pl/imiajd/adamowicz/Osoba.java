package pl.imiajd.adamowicz;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String n_nazwisko, int n_rokUrodzenia){
        this.nazwisko=n_nazwisko;
        this.rokUrodzenia=n_rokUrodzenia;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public int getRokUrodzenia() {
        return this.rokUrodzenia;
    }
}
