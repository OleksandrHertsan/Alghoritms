import java.util.Arrays;
import java.util.Scanner;

public class Hometask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] massive = new int[]{3, 6, 4, 7, 2, 1, 9};
        System.out.println(Arrays.toString(massive));
        System.out.println("Введите число");
        int number = scanner.nextInt();

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == number) {
                System.out.println("Индекс числа" + number + " номер " + i);
            }
        }

        int[] secondMassive = new int[]{3, 6, 4, 7, 2, 1, 9};
        System.out.println(Arrays.toString(secondMassive));
        int sum = 0;
        for (int j : secondMassive) {
            sum += j * j;
        }
        System.out.println("Сумма чисел в квадрате = " + sum);
    }
}
