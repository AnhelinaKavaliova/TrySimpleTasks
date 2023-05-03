package String;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();

        if(isPalindrome(str)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String isn't palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        str = str.replaceAll(" ", "").toLowerCase();
        int n = str.length();

        for(int i = 0; i<(n/2);i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
