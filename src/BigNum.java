import java.util.Scanner;
public class BigNum {
    public static void main(String[] args) {
        int arr[] = new int[3];
        int max = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter 3 nums: ");
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = num.nextInt();
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("The biggest num: " + max);
    }
}
