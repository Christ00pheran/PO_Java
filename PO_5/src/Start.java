import java.util.ArrayList;
import java.util.Collections;

public class Start {
    public static void main(String[] args){
        ArrayList<Integer> li1= new ArrayList<>();
        ArrayList<Integer> li2= new ArrayList<>();
        li1.add(1);
        li1.add(4);
        li1.add(9);
        li1.add(16);
        li2.add(9);
        li2.add(7);
        li2.add(4);
        li2.add(9);
        li2.add(11);

        System.out.print("Zad1\n");
        System.out.print(append(li1,li2));
        System.out.print("\nZad2\n");
        System.out.print(merge(li1,li2));
        System.out.print("\nZad3\n");
        System.out.print(reversed(li1));
        System.out.print("\nZad4\n");
        reverse(li1);
        System.out.print("\nZad5\n");
        System.out.print(mergeSorted(li1,li2));


    }
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int x : a){
            li.add(x);
        }
        for(int x : b){
            li.add(x);
        }

        return li;
    }
    //
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> li = new ArrayList<>();


        int slen=0;
        int llen=0;
        if(a.size()>b.size()){
            slen=b.size();
            llen=b.size();
        }
        else{
            slen=a.size();
            llen=b.size();
        }
        int i=0;
        for(i=0;i<slen;i++){

            li.add(a.get(i));
            li.add(b.get(i));
        }
        for(int j=i;j<llen;j++){

            li.add(b.get(i));

        }

        return li;
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        Collections.sort(a);
        Collections.sort(b);
        int c=0;
        int d=0;
        while(c<a.size() && d<b.size()) {
            if (a.get(c) < b.get(d)) {
                li.add(a.get(c));
                c++;
            }
            else if (a.get(c) > b.get(d)) {
                li.add(b.get(d));
                d++;
            }
            else {
                li.add(a.get(c));
                li.add(b.get(d));
                c++;
                d++;
            }
        }
        if(c == a.size()) {
            for(int i=d; i<b.size(); i++) {
                li.add(b.get(d));
                d++;
            }
        }
        else if (d == b.size()){
            for(int i=c; i<a.size(); i++) {
                li.add(a.get(c));
                c++;
            }
        }
        return li;
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> li = new ArrayList<>();
        int alen=a.size();
        for(int i=alen-1;i>=0;i--){
            li.add(a.get(i));

        }
        return li;
    }
    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> li = new ArrayList<>();
        int alen=a.size();
        for(int i=alen-1;i>=0;i--){
            li.add(a.get(i));

        }
        a.clear();
        for(int i=0; i<li.size();i++){
            a.add(li.get(i));

        }

        System.out.print(a);

    }
}
