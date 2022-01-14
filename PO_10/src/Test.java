import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> listaPracownikow = new LinkedList<>();
        ListIterator<String> iterPracownikow = listaPracownikow.listIterator();
        iterPracownikow.add("Pracownik1");
        iterPracownikow.add("Pracownik2");
        iterPracownikow.add("Pracownik3");
        iterPracownikow.add("Pracownik4");
        iterPracownikow.add("Pracownik5");
        iterPracownikow.add("Pracownik6");
        System.out.print(listaPracownikow+"\n");
        Collections.redukuj(listaPracownikow,2);
        System.out.print(listaPracownikow);
        System.out.print(listaPracownikow+"\n");
        Collections.odwroc(listaPracownikow);
        System.out.print(listaPracownikow+"\n");
        Collections.zad6();

    }
}
