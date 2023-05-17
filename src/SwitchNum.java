import java.util.Scanner;

public class SwitchNum {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any decimal number: ");
        double number = scanner.nextDouble();

        String numberStr = Double.toString(number);
        int decimalPlaces = numberStr.length() - numberStr.indexOf('.') - 1;
        int a = 10;
        for(int i = 0; i < decimalPlaces; i++){
            a *= 10;
        }

       int integerPart = (int) number;
       int fractionalPart = (int) (number*a);
       fractionalPart %= a;
       System.out.println("New number: "+ fractionalPart +"."+integerPart);


    }
}
