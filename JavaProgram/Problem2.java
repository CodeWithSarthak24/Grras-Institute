package JavaProgram;
// String find out vowel
// Duplicate character find out in array and print them.
// Remove duplicate character.
//  Count total word in string.
// Reverse every word from string.
public class Problem2 {

    public static void main(String[] args) {

        String str = "Developer";
        System.out.println(vowel(str));

        String[] s = {"alex", "david", "bean"};

        for (int i = 0; i < s.length; i++){
            System.out.println(s[i] + "\n" + "Total vowel count " + vowel(s[i]));
        }

    }


    private static int vowel(String str) {

        int count = 0;
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                count++;
            }
        }
        return count;
    }
}
