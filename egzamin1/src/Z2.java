import java.util.ArrayList;
import java.util.Iterator;

public abstract class Z2 {
    public static<E> void printMarginal(Iterable<E> arr){
        ArrayList<E> res = new ArrayList<>();
        Iterator<E> iter = arr.iterator();
        res.add(iter.next());
//        while(!iter.hasNext()){
//            res.add(iter.next());
//
//        }

        System.out.println(res);


    }
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        printMarginal(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("abc1");
        list2.add("abc2");
        list2.add("abc3");
        list2.add("abc4");
        printMarginal(list2);

    }
}
