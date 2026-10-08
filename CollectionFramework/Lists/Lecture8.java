package CollectionFramework.Lists;

// List interface

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture8 {
    public static void main(String[] args) {

        // Converting List to Array

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        //  Integer[] ar = list.toArray(new Integer[list.size()]); // create integer type array
           Integer[] ar = list.toArray(new Integer[0]);

        for (Integer i : ar) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Converting Array to list

             Integer[] arr = {1, 2, 3, 4, 5};
             List<Integer> ls = new ArrayList<>(Arrays.asList(arr)); // Convert the elements of the array into a List.
             System.out.print(ls + " ");


    }
}
