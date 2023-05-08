package Structures;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4};
        int max = arr[0]; // инициализируем переменную максимума первым элементом массива

        // проходим по всем элементам массива, начиная со второго
        for (int i = 1; i < arr.length; i++) {
            // если текущий элемент больше, чем сохраненный максимум, то обновляем максимум
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Максимальный элемент в массиве: " + max);
    }
}
