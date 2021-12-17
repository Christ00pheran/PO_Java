package pl.imiajd.adamowicz;
import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba> {
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String toString() {
        return "[" + nazwisko + "]" + dataUrodzenia;
    }

    public boolean equals(Object o) {
        Osoba os = (Osoba) o;
        if (os.getNazwisko() == this.nazwisko && os.getDataUrodzenia() == this.dataUrodzenia) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Osoba o) {
        return 0;
    }
}
