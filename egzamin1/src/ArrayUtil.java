import java.time.LocalTime;
import java.util.ArrayList;

public abstract class ArrayUtil {
    public static <T extends Comparable<T>> ArrayList<T> removeRepeatedElements(T[] arr){
        ArrayList<T> res = new ArrayList<>();

        for(T x : arr){
            if(!res.contains(x))
                res.add(x);
        }
    return res;
    }
    public static void main(String[] args){
        LocalTime[] time = {LocalTime.of(1,1),LocalTime.of(2,2),LocalTime.of(2,1),LocalTime.of(1,1)};
    ArrayList<LocalTime> arr1 = ArrayUtil.<LocalTime>removeRepeatedElements(time);
    for(LocalTime x : arr1){
        System.out.println(x);
    }
    Character[] charac = {'g','s','x','r','g'};
    ArrayList<Character> arr2 = ArrayUtil.<Character>removeRepeatedElements(charac);
    for(Character x : arr2){
        System.out.println(x);
    }
    }
}
