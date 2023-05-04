import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        RandomList(list);
        PrintList(list);
        System.out.println();
        HashSet<Integer> setList = new HashSet<>(list);
        System.out.println(setList);
        Double percent = 1.0*setList.size()/1000*100;
        System.out.println(percent + "%");
        
        }
    public static void RandomList (List<Integer> list) {
            Random rand = new Random();
            for (int i = 0; i < 1000; i++) {
                list.add(i, rand.nextInt(0, 25));
            }

    }
    public static void PrintList (List<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }

}

