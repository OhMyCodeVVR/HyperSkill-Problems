import java.util.Scanner;

public class Main {

    public static long fib(long n) {
        // write your code here
        long prev = 0;
        long current = 1;
        long next = 0;
        long index = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        while (index < n) {
            next = index % 2 != 0 ? -(Math.abs(prev) + Math.abs(current)) : Math.abs(prev) + Math.abs(current);
            prev = current;
            current = next;
            index++;
        }
        return next;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}
