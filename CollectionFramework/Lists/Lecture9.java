package CollectionFramework.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture9 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 3, 9));
        System.out.println(list.lastIndexOf(3));
        System.out.println(list.subList(0, 3));
        System.out.println(list.getFirst());
        System.out.println(list.isEmpty());
    }
}
