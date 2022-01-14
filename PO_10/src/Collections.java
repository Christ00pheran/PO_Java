import java.util.*;

public class Collections {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n) {
        ListIterator<T> it = pracownicy.listIterator();
        int moves = 0;
        while (it.hasNext()) {
            while (moves != n && it.hasNext()) {
                moves++;
                it.next();
            }
            if (moves == n)
                it.remove();
            moves = 0;
        }
    }

    public static <T> void odwroc(LinkedList<T> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            T temp = lista.get(i);
            lista.set(i, lista.get(lista.size() - 1 - i));
            lista.set(lista.size() - i - 1, temp);
        }
    }

    public static void zad6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadź całkowita nieujemna liczbe: ");
        int podanaLiczba = -1;
        while (podanaLiczba < 0) {
            podanaLiczba = in.nextInt();
        }
        String result = Integer.toString(podanaLiczba);
        ArrayList<Integer> liczba = new ArrayList<>();
        for (int i = 0; i < (result.length()); i++) {
            char liczbaS = result.charAt(i);
            liczba.add(Character.getNumericValue(liczbaS));
        }
        for (Integer e : liczba) {
            System.out.print(e + " ");
        }
    }
}

