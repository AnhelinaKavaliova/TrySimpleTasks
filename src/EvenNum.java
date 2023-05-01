import java.util.Scanner;
public class EvenNum {
    public static void main(String[] args) {
        Scanner snum = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = snum.nextInt();
        System.out.println((num%2 == 0) ? "Num is even" : "Num is not even");
    }
}
