public class Recursion {
    public static int two(double n) {
        if (n == 1) {
            return 1;
        }
        else if (n < 1) {
            return 0;
        }
        else {
            return two(n / 2);
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

    public static long fibRecursion(long n) {

        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 1;
        }
        else {
            return fibRecursion(n - 1) + fibRecursion(n - 2);
        }
    }


    public static boolean palindrome(String str) {

        str = str.toLowerCase();

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        else if (str.length() == 1) {
            return true;
        }
        else {
            return palindrome(str.substring(1, str.length() - 1));
        }


    }
}

class HomeworkRecursionMain {
    public static void main(String[] args) {

        double n = 8192;

        if (Recursion.two(n) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        int sum = Recursion.sumOfDigits((int) n);
        System.out.println(sum);

        long fib = Recursion.fibRecursion(20);
        System.out.println(fib);


        String str = "Palindrome";
        System.out.println(Recursion.palindrome(str));

    }

}
