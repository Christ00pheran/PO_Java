package pl.imiajd.adamowicz;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Osoba("Kubica", LocalDate.parse("1982-12-01")));
        grupa.add(new Osoba("Wojtyła", LocalDate.parse("1965-09-03")));
        grupa.add(new Osoba("Adamowicz", LocalDate.parse("1921-10-13")));
        grupa.add(new Osoba("Verstappen", LocalDate.parse("1967-03-05")));
        grupa.add(new Osoba("Hamilton", LocalDate.parse("1978-11-11")));
        for(int i=0;i<grupa.size();i++){
            System.out.println(grupa.get(i));
        }
        Collections.sort(grupa);
        for(int i=0;i<grupa.size();i++){
            System.out.println(grupa.get(i));
        }
    }
}
