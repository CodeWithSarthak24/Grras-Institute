package CollectionFramework.Lists;

// Problem 4 — Medium: Remove Duplicates
// Given: [1, 2, 2, 3, 4, 4, 5]
// Create a new list containing only unique elements.
// Expected: [1, 2, 3, 4, 5]

import java.util.ArrayList;
import java.util.Arrays;

public class Lecture11 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "x", "a", "x", "y"));

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }

        for (String s : list) {
            System.out.println(s);
        }

        // Overall Time Complexity ->  O(n²)
        // Nested loops → O(n²) + Removal → O(n)


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("a", "x", "a", "x", "y"));

        ArrayList<String> unique = new ArrayList<>();

        for(String s : list2){
            if(!unique.contains(s)){
                unique.add(s);
            }
        }
        System.out.println(unique);


        // Time Complexity: O(n²)
        // The loop runs n times: for (String s : list2) → O(n)
        // Inside it: unique.contains(s): For an ArrayList, contains() searches one by one: contains() → O(n)
        //Therefore: O(n) × O(n) = O(n²)

/*      -------------------------------
        ArrayList<String> list =
                new ArrayList<>(Arrays.asList("a", "x", "a", "x", "y"));

        HashSet<String> uniqueSet = new HashSet<>(list);  // Convert List to HashSet. A HashSet automatically removes duplicates.

        ArrayList<String> unique =
                new ArrayList<>(uniqueSet); // Convert HashSet back to ArrayList

        System.out.println(unique);
        -----------------------------------
        If order does NOT matter use HashSet:
    HashSet<String> uniqueSet = new HashSet<>(list);

    Complexity:

    Time  → O(n) average
    Space → O(n)
       -------------------------------------
       If insertion order MUST be maintained ⭐
    Use LinkedHashSet:

    ArrayList<String> unique =
        new ArrayList<>(new LinkedHashSet<>(list));
      --------------------------------------
*/
    }
}
