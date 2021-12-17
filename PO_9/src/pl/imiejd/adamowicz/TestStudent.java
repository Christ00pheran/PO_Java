package pl.imiajd.adamowicz;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Student("Kubica", LocalDate.parse("1982-12-01"),4.2));
        grupa.add(new Student("Wojtyła", LocalDate.parse("1965-09-03"), 3.3));
        grupa.add(new Student("Adamowicz", LocalDate.parse("1921-10-13"), 3.6));
        grupa.add(new Student("Verstappen", LocalDate.parse("1967-03-05"), 2.7));
        grupa.add(new Student("Hamilton", LocalDate.parse("1978-11-11"), 5));
        for(int i=0;i<grupa.size();i++){
            System.out.println(grupa.get(i));
        }
        Collections.sort(grupa);
        for(int i=0;i<grupa.size();i++){
            System.out.println(grupa.get(i));
        }
    }
}
