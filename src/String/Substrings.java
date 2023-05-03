package String;
import java.util.Scanner;
public class Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();

        String[] substrings = str.split(" ");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
