package JavaProgram;

import java.util.Scanner;

public class Problem4 {

    public static int missingNumber(int[] arr){
        // One number is missing, so the array length is one less than n. Therefore, n = arr.length + 1.
        int n = arr.length + 1;
        int expectedSum = n * (n + 1)/ 2;
        int totalSum = 0;

        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        return expectedSum - totalSum;
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

        int output = missingNumber(arr);
        System.out.println("Ans : " + output);
    }
}
