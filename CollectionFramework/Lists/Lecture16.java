package CollectionFramework.Lists;

// Stack
// Problem 1 — Easy ⭐: Push and Pop
// Create a Stack and add 10, 20, 30.
// Remove the top element.
// Print the Stack output [10, 20]

import java.util.Iterator;
import java.util.Stack;

public class Lecture16 {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

       Iterator<Integer> it = st.iterator();

       it.forEachRemaining(System.out::println);

       st.pop();

        System.out.println(st);

        // Problem 2 — Easy ⭐: Print Top Element
        // Input [10, 20, 30] print the top element without removing it. output 30

        System.out.println(st.peek());

        // Problem 3 — Easy ⭐: Check Empty
        // Create an empty Stack and check whether it is empty. output true

        Stack<String> str = new  Stack<>();
        System.out.println(str.isEmpty());

        // Problem 4 — Reverse a String

        Stack<String> stack = new  Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        Stack<String> stack1 = new  Stack<>();
        String s;

        while(!stack.isEmpty()){
             s = stack.pop();
             stack1.push(s);
        }

        System.out.println("Reversed : " + stack1);


        // Since the problem is Reverse a String using Stack

        String s2 = "abcde";

        Stack<Character> stack2 = new  Stack<>();

        for(char ch : s2.toCharArray()){
            stack2.push(ch);
        }

       // String reverse = "";
        StringBuilder stringBuilder = new StringBuilder();

        while(!stack2.isEmpty()){
            stringBuilder.append(stack2.pop());
        }
        System.out.println("Result : " + stringBuilder);

        //---------------------\\

        String[] array = {"abc","xyz","ytr","sdf"};

        Stack<String> stack3 = new  Stack<>();

        for(String ans : array){
            stack3.push(ans);
        }

        StringBuilder stringBuilder1 = new StringBuilder();

        while(!stack3.isEmpty()){
            stringBuilder1.append(stack3.pop()).append(" ");
        }

        System.out.println("Output : " + stringBuilder1);

        //......................\\

        String[] array1 = {"abc","xyz","ytr","sdf"};

        for(String x : array1){

            Stack<Character> stack4 = new  Stack<>();

          for(char ch : x.toCharArray()){
              stack4.push(ch);
          }
            StringBuilder stringBuilder2 = new StringBuilder();

            while(!stack4.isEmpty()){
                stringBuilder2.append(stack4.pop());
            }
            stringBuilder2.append(" ");
            System.out.print(stringBuilder2);

        }

    }
}
