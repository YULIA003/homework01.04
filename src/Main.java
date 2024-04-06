import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        double[] nor = {1.57, 7.654, 9.986};
        for (double i = 0; i < nor.length; i++) {
            System.out.println(nor[(int) i]);
        }
        int[] weights = new int[2];
        weights[0] = 65;
        weights[1] = 59;
        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println("Задание 2");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nor));
        System.out.println(Arrays.toString(weights));
        System.out.println("Задание 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = nor.length - 1; i >= 0; i--) {
            System.out.print(nor[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                numbers[i]++;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}