import java.util.Scanner;

public class Start {
    public static int silnia (int b){
        int suma = 1;
        for (int i = 1; i <= b; i++) {
            suma*=i;
        }
        return suma;

    }
    public static  void main(String[] args){

        //zad1.1a
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int sum=0;
//        for(int i=1; i<=n;i++){
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//            sum+=a;
//
//
//
//        }
//        System.out.println(sum);

        //zad1.1b
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int sum=1;
//        for(int i=1; i<=n;i++){
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//            sum*=a;
//
//
//
//        }
//        System.out.println(sum);

        //zad1.1c
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int sum=0;
//        for(int i=1; i<=n;i++) {
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//            if (a >= 0) {
//                sum += a;
//
//            }else if(a<0) {
//                sum+=-a;
//            }
//
//        }
//        System.out.println(sum);


        //zad1.1d
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int sum=0;
//        for(int i=1; i<=n;i++) {
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//            if (a >= 0) {
//                sum += Math.sqrt(a);
//
//            }else if(a<0) {
//                sum+=-Math.sqrt(a);
//            }
//
//        }
//        System.out.println(sum);

        //zad1.1e
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int sum=1;
//        for(int i=1; i<=n;i++) {
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//            if (a >= 0) {
//                sum *= a;
//
//            }else if(a<0) {
//                sum*=-a;
//            }
//
//        }
//        System.out.println(sum);
//            }
        //zad1.1f
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int sum=0;
//        for(int i=1; i<=n;i++) {
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//                sum += a*a;
//
//        }
//        System.out.println(sum);

        //zad1.1g
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int sum1=0;
//        int sum2=1;
//        for(int i=1; i<=n;i++) {
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//            sum1 += a;
//            sum2*=a;
//
//        }
//        System.out.println("Dodawanie"+sum1);
//        System.out.println("Mnozenie"+sum2);

        //zad1.1h
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int sum=0;
//        for(int i=1; i<=n;i++){
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//            if(i%2==0) {
//
//                sum+=-a;
//            }
//            else if(i%2!=0){
//                sum+=a;
//
//            }
//            }
//
//
//
//
//        System.out.println(sum);
        //zad1.1i


//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        float sum=0;
//        for(int i=1; i<=n;i++){
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//            if(i%2==0) {
//
//                sum+=a/silnia(i);
//            }
//            else if(i%2!=0){
//                sum+=-a/silnia(i);
//
//            }
//        }
//
//
//
//
//        System.out.println(sum);

        //zad1.2
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int[] arr;
//        arr=new int[n];
//        for(int i=1; i<=n;i++){
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            arr[i-1] = reader2.nextInt();
//
//        }
//        for(int j=1; j<n;j++){
//            System.out.println(arr[j]);
//
//        }
//        System.out.println(arr[0]);

        //zad2.2
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int sum=0;
//        for(int i=1; i<=n;i++){
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//            if(a>0) {
//                sum+=a;
//
//            }
//            }
//        System.out.println(sum*2);

        //zad2.3
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int sum=0;
//        int uj=0;
//        int dod=0;
//        int ze=0;
//        for(int i=1; i<=n;i++){
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            int a = reader2.nextInt();
//            if(a<0){
//                uj++;
//            }else if(a>0){
//                dod++;
//
//            }else if(a==0){
//                ze++;
//            }
//        }
//        System.out.println("ujemne: "+ uj+", dodatnie: "+dod+", zera: "+ze);

        //zad4***
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n = reader.nextInt();
//        int[] arr;
//        arr=new int[n];
//        int min=0;
//        int max=0;
//        for(int i=1; i<=n;i++){
//            Scanner reader2 = new Scanner(System.in);
//            System.out.println("Podaj a: ");
//            arr[i-1] = reader2.nextInt();
//
//        }
//
//
//        System.out.println();

        //zad5
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = reader.nextInt();
        int[] arr;
        arr=new int[n];
        for(int i=1; i<=n;i++){
            Scanner reader2 = new Scanner(System.in);
            System.out.println("Podaj a: ");
            arr[i-1] = reader2.nextInt();

        }
        for(int j=0;j<=n;j++){
            if(arr[j]>0&&arr[j+1]>0){
                System.out.println("("+arr[j]+","+arr[j+1]+")");
            }

        }

    }

}