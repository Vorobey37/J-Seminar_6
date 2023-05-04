import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * task_0
 */
public class task_0 {

    public static void main(String[] args) {
        Integer array[] = new Integer[]{1, 2, 3, 5, 4, 1, 0, 3, 5, 4};
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        HashSet<Integer> linkSet = new LinkedHashSet<>(Arrays.asList(array));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(array));
        System.out.println(hashSet);
        System.out.println(linkSet);
        System.out.println(treeSet);
    }
}