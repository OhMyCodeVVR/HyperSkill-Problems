import java.math.BigInteger;
import java.util.Scanner;

class Main {
    static public BigInteger factorialHavingLargeResult(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger longForUse = scanner.nextBigInteger();

        Long startLong = 2L;
        BigInteger temp = BigInteger.ONE;
        while (true) {
            temp = factorialHavingLargeResult(startLong);
            if (temp.compareTo(longForUse) == 1 || temp.compareTo(longForUse) == 0) {
                System.out.println(startLong);
                break;
            }
            startLong++;
        }

    }
}