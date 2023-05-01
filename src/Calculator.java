import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = num.nextInt();
        System.out.print("Enter num2: ");
        int num2 = num.nextInt();

        System.out.printf("Sum: %d\n", num1 + num2);
        System.out.printf("Difference: %d\n", num1 - num2);
        System.out.printf("Product: %d\n", num1 * num2);
        System.out.printf("Quotient: %d\n", num1/num2);
    }
}

