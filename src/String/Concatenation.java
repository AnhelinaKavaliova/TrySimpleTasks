package String;
import java.util.Scanner;
public class Concatenation {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = str.nextLine();
        System.out.print("Enter second string: ");
        String second = str.nextLine();
        first = first.concat(second);

        System.out.println("Result of concatenation: " + first);
    }
}
