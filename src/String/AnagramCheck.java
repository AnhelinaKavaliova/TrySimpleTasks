package String;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first_str = scanner.nextLine();
        System.out.print("Enter second string: ");
        String second_str = scanner.nextLine();

        if(isAnagram(first_str, second_str))
        {
            System.out.println("It's an anagram");
        }
        else{
            System.out.println("It's not an anagram");
        }
    }

    public static boolean isAnagram(String str1, String str2){
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        if(str1.length() != str2.length()){ return false; }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1, arr2);
    }
}
