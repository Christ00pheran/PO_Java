//import java.io.BufferedReader;
//import java.io.DataInputStream;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
//
//
//public class zad2 {
//    public static void main(String[] args){
//        System.out.println(countChars("C:\\Users\\chris\\IdeaProjects\\lab4\\src\\text.txt",'l'));
//
//
//
//
//    }
//    public static int countChars(String b,char c){
//        FileInputStream file = new FileInputStream(b);
//        DataInputStream in = new DataInputStream(file);
//        BufferedReader br = new BufferedReader(new InputStreamReader(in));
//        String s="";
//        String line="";
//        int suma=0;
//    while((line= br.readLine())!=null){
//        s+=line;
//    }
//    for(int i=0; i<s.length();i++){
//        char[] ch = new char[s.length()];
//        for(int j=0;j<s.length();i++){
//            ch[j]=s.charAt(j);
//        }
//        if(ch[i]==c){
//            suma+=1;
//        }
//
//    }
//    return suma;
//    }
//}
