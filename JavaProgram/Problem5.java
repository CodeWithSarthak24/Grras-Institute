package JavaProgram;

import java.util.HashSet;
import java.util.Scanner;

public class Problem5 {

    public static void removeDuplicate(int[] arr){

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr){
            set.add(i);
        }
        System.out.print(set + " ");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");

        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];

        System.out.println("Take array : ");
        for (int i = 0; i < arrayLength; i++){
            arr[i] = sc.nextInt();
        }

       removeDuplicate(arr);
    }
}

// We use a HashSet because it automatically stores only unique elements and removes duplicate values.
// A HashSet first checks if the value is already present.
// If it is not present, it adds it; if it is already present, it ignores it.