import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner snum = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = snum.nextInt();

        for(int i = 0; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }

    }
}
