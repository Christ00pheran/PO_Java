import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        System.out.println("Liczba wystapien c: "+countChar("ccc", 'c'));
        System.out.println("Liczba wystąpień substringa: "+countSubStr("abcabcabc","abc"));
        Scanner reader=new Scanner(System.in);
        System.out.println("Podaj stringa (middle): ");
        String a = reader.next();
        System.out.println("Srodek: "+middle(a));
        System.out.println("Podaj stringa (repeat): ");
        String b = reader.next();
        System.out.println("Repeat: "+repeat(b, 3));
//    System.out.println("Where: "+where("abcabcabc", "a"));
        System.out.println("Change: "+change("aBc"));
        System.out.println(seeds(2));
        System.out.println(kapital(1000, 0.04,3));
        System.out.println("Seed: "+nice("abcabc"));
        System.out.println("Seed2: "+nice2("abcabc", ',',3));

    }
    //zad1.a
    public static int countChar(String str, char c){
        int suma=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                suma+=1;
            }
        }
        return suma;
    }
    //zad1.b
    public static int countSubStr(String str, String subStr){
        int suma=0;
        int last=0;
        while(last!=-1) {

            last = str.indexOf(subStr, last);

            if (last != -1) {
                suma += 1;
                last+=subStr.length();
            }
        }
        return suma;
    }
    //zad1.c
    public static String middle(String str){
        int len=str.length();
        String wynik="";
        String t="";
        if(len%2!=0){
            wynik=String.valueOf(str.charAt(len/2));

        }
        else if(len%2==0){
            wynik=String.valueOf(str.charAt((len-1)/2));
            t=String.valueOf(str.charAt(len/2));
            wynik=wynik+t;
        }

        return wynik;
    }
    //zad1.d
    public static String repeat(String str, int n){
        String wynik="";
        for(int i=0; i<n; i++){
            wynik+=str;

        }
        return wynik;
    }
    //zad1.e
//public static int[] where(String str, String subStr){
//    int[] wynik=new int[0];
//    int last=0;
//    while(last!=-1) {
//
//        last = str.indexOf(subStr, last);
//
//        if (last != -1) {
//            wynik= Arrays.copyOf(wynik, wynik.length+1);
//            wynik[wynik.length-1]=last;
//            last+=subStr.length();
//        }
//    }
//    return wynik;
//}
// zad1.f
    public static String change(String str){
        String t="";
        String wynik="";
        for(int i=0; i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
                t=String.valueOf(c);
                t=t.toLowerCase();
                wynik=wynik+t;


            }
            else if(Character.isLowerCase(c)){
                t=String.valueOf(c);
                t=t.toUpperCase();
                wynik=wynik+t;
            }

        }
        return wynik;
    }
    //zad1.g
    public static String nice(String str) {
        StringBuffer strt = new StringBuffer(str);
        for(int i=(strt.length()-3); i>0;i=i-3) {
            strt.insert(i,"\'");
        }
        return strt.toString();
    }
    //zad1.h
    public static String nice2(String str, char sep, int x) {
        StringBuffer strt = new StringBuffer(str);
        for(int i=(strt.length()-x);i>0;i-=x) {
            strt.insert(i,sep);
        }
        return strt.toString();
    }
    //zad4
    public static BigInteger seeds(int n){
        int s = n * n;
        BigInteger suma = new BigInteger("0");
        int se=1;


        for (int i = 0; i < s; i++) {
            BigInteger big=BigInteger.valueOf(se);

            suma=suma.add(big);

            se*=2;

        }
        return suma;
    }
    //zad5
    public static BigDecimal kapital(int k, double p, int n){
        BigDecimal suma= new BigDecimal("0");
        BigDecimal big=BigDecimal.valueOf(k);
        suma=suma.add(big);
        BigDecimal pro = BigDecimal.valueOf(p);

        for(int i=0; i<n; i++){

        BigDecimal t=suma.multiply(pro);
        suma=suma.add(t);



        }
        suma=suma.setScale(2, RoundingMode.CEILING);
    return suma;
    }
}
