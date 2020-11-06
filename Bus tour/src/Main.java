import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busH = scanner.nextInt();
        int bridgeCount = scanner.nextInt();
        scanner.nextLine();
        String[] strs = scanner.nextLine().split(" ");
        for (int i = 0; i < strs.length; i++) {
            if (Integer.parseInt(strs[i]) <= busH) {
                System.out.println("Will crash on bridge " + (i + 1));
                System.exit(0);
            }
        }
        System.out.println("Will not crash");
    }
}