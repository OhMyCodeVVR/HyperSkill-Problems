import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String[] ss = scanner.nextLine().split(" ");
        int n = Integer.parseInt(ss[0]);
        int a = Integer.parseInt(ss[1]);
        int b = Integer.parseInt(ss[2]);

        int sum = 0;
        Random random = new Random(a + b);

        while (n > 0) {
            sum += random.nextInt(b - a + 1) + a;
            n--;
        }
        System.out.println(sum);
    }
}