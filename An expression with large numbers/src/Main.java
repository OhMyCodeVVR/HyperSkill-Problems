import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        args = scanner.nextLine().split(" ");
        BigInteger[] bigIntegers = new BigInteger[args.length];
        for (int i = 0; i < args.length; i++) {
            bigIntegers[i] = new BigInteger(String.valueOf(args[i]));
        }
        BigInteger one, two, three, four;
        one = bigIntegers[0].multiply(bigIntegers[1]).negate();
        System.out.println(one.add(bigIntegers[2]).subtract(bigIntegers[3]));
    }
}