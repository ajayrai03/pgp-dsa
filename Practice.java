import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Practice{
    public static void main(String[] args) {
        // HashSet<List<Integer>> set= new HashSet<>();
        // List<Integer> list=new ArrayList<>(Arrays.asList(5,2,3));
        // List<Integer> list2=new ArrayList<>(Arrays.asList(5,2,3));
        // set.add(list);
        // set.add(list2);
        HashSet<Integer> set= new HashSet<>();
        set.add(10);
        set.add(15);
        set.add(-1);
        set.add(0);
        set.add(0);
        set.add(11);

        System.out.println(set);
    }
}