import java.util.Scanner;
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        int c = num.nextInt();

        System.out.println("Celsius to Fahrenheit: " + (c*1.8+32));
    }
}
