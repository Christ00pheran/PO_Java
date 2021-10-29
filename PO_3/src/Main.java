import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj m: ");
        int m = reader.nextInt();
        System.out.println("Podaj n: ");
        int n = reader.nextInt();
        System.out.println("Podaj k: ");
        int k = reader.nextInt();
        if (m >= 1 && n >= 1 && k >= 1 && m <= 10 && n <= 10 && k <= 10) {
            int[][] a = new int[m][n];
            int[][] b = new int[n][k];
            generuj(a,10);
            System.out.println("Tablica a: \n");
            wypisz(a);
            System.out.println("\nTablica b: \n");
            generuj(b, 10);
            wypisz(b);
            System.out.println("\nTablica c: \n");

        }
    }
    public static void generuj(int[][] tab, int max){

            Random r = new Random();
            for(int i=0; i<tab.length;i++){
                for(int j=0; j<tab[i].length;j++) {
                    tab[i][j] = r.nextInt(max);
                }
            }
        }
    public static void wypisz(int[][] tab){
            for(int i=0; i<tab.length;i++){
                for(int j=0; j<tab[i].length;j++){
                    System.out.print(tab[i][j]+", ");
                }
                System.out.println(" ");
            }
        }




}
