package Structures;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class SetMethod {
    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(100));
        }

        System.out.println("Исходное множество: " + set);

        set.removeIf(num -> num % 2 == 0);

        System.out.println("Множество без четных чисел: " + set);


    }
}
