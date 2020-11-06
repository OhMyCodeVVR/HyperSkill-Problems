import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String val = scanner.nextLine();
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += Integer.parseInt(val.split(" ")[i]);
        }
        System.out.println(sum);
    }
}
