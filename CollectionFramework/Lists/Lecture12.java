package CollectionFramework.Lists;

// Problem 5 — Medium: Find Maximum
// Given: [10, 55, 23, 90, 12], Expected: 90

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture12 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 18, 9));
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > maxNumber){
                maxNumber = list.get(i);
            }
        }
        System.out.println(maxNumber);

        //  int maxNumber = Collections.max(list);
       // int maxNumber = list.stream().max(Integer::compareTo).get();

    }
}
