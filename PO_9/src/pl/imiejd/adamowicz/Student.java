package pl.imiajd.adamowicz;
import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    private double sredniaOcen;

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public Student(String nazwisko,LocalDate dataUrodzenia,double sredniaOcen){
        super(nazwisko,dataUrodzenia);
        this.sredniaOcen=sredniaOcen;
    }

    public int compareTo(Osoba os){
        Student oso = (Student)os;
        if(super.compareTo(os)==0)
            if(this.sredniaOcen==oso.getSredniaOcen())
                return -4;
        return -5;
    }
    public String toString() {
        return  this.getNazwisko()+this.getDataUrodzenia()+this.sredniaOcen;
    }
}
