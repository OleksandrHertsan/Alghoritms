public class Recursion {
    public static int powerOfTwo(double n) {
        if (n == 1) {
            return 1;
        }
        else if (n < 1) {
            return 0;
        }
        else {
            return powerOfTwo(n / 2);
        }
    }


    public static int sumOfDigits(int n)
    {
        if (n < 10) {
            return n;
        }
        else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }

}


class HomeworkRecursionMain {
    public static void main(String[] args) {

        double n = 6132;

        if (Recursion.powerOfTwo(n) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        int sum = Recursion.sumOfDigits((int) n);
        System.out.println(sum);

    }

}
