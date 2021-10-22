import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner reader = new Scanner(System.in);
        System.out.print("N value: ");
        int b = reader.nextInt();
        int[] a = new int[b];
        generuj(a, b, -100, 100);
        wypisz(a);
        System.out.println("Nieparzystych: "+ileNieparzystych(a));
        System.out.println("Parzystych: "+ileParzystych(a));
        System.out.println("Dodatnich: "+ileDodatnich(a));
        System.out.println("Ujemnych: "+ileUjemnych(a));
        System.out.println("Zerowych: "+ileZerowych(a));
        System.out.println("Dodatnich: "+sumaDodatnich(a));
        System.out.println("Ujemnych: "+sumaUjemnych(a));
        System.out.println("Maks ciag dodatnich: "+dlugoscMaksymalnegoCiaguDodatnich(a));
        signum(a);


    }


    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        if (n >= 1 && n <= 100) {
            if (minWartosc >= -999 && maxWartosc <= 999) {
                for (int i = 0; i < n; i++) {
                    tab[i] = r.nextInt(maxWartosc - minWartosc) + minWartosc;
                }
            } else {
                System.out.println("Min/max value not in range -999 - 999.");
            }
        } else {
            System.out.println("N not in range 1 - 100.");
        }
    }


    public static void wypisz(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);

        }

    }


    public static int ileNieparzystych(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                suma += 1;
            }

        }
        return suma;

    }

    public static int ileParzystych(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                suma += 1;
            }


        }
        return suma;
    }

    public static int ileDodatnich(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                suma += 1;
            }


        }
        return suma;

    }

    public static int ileUjemnych(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                suma += 1;
            }


        }
        return suma;

    }

    public static int ileZerowych(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                suma += 1;
            }


        }
        return suma;

    }
    public static int sumaDodatnich(int tab[]){
        int suma=0;
        for(int i = 0; i<tab.length;i++){
            if(tab[i]>0){
                suma+=tab[i];
            }
        }

        return suma;
    }
    public static int sumaUjemnych(int tab[]){
        int suma=0;
        for(int i = 0; i<tab.length;i++){
            if(tab[i]<0){
                suma+=tab[i];
            }
        }

        return suma;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]){
        int suma=0;
        for(int i = 0; i<tab.length;i++){
            if(tab[i]>0){
                suma+=1;
            }
            else{suma=0;}
        }

        return suma;
    }
    public static void signum(int tab[]){
        for(int i = 0; i<tab.length;i++){
            if(tab[i]>0){
                tab[i]=1;
            }
            else if(tab[i]<0){tab[i]=-1;}
        }

    }



}
