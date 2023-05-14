package Structures;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int stringNum = scanner.nextInt();
        scanner.nextLine();

        String[] s = new String[stringNum];

        for(int i = 0; i < stringNum; i++){
            int k = i + 1;
            System.out.print("Enter " + k + " string: ");
            s[i] = scanner.nextLine();
        }

        for(int i = 0; i < stringNum; i++){
            for(int j = i+1; j < stringNum; j++){
                if(s[i].length() >s [j].length()){
                    String tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;

                }
            }

        }

        for(String str : s){
            System.out.println(str);
        }
    }
}
