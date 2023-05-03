import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter circle's R: ");
        int r = num.nextInt();

        System.out.printf("Circle's length: %f\n", 2*Math.PI*r);
        System.out.printf("Circle's area: %f\n", Math.PI*Math.pow(r, 2));
    }
}
