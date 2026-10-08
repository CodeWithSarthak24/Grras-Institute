package JavaProgram;

import java.util.Scanner;

public class Problem3 {

    public static void findPair(int[] arr, int target){
        int n = arr.length;
        for (int i = 0; i < n; i++){
           for (int j = i + 1; j < n; j++){
               if (arr[i] + arr[j] == target){
                   System.out.println("List of pairs : " + arr[i] + " " +  arr[j]);
               }
           }
        }
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
        System.out.println("Take target : ");
        int value = sc.nextInt();
        findPair(arr,value);
    }
}
