import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] ints = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        ints = Arrays.stream(ints).map(i -> i - 1).toArray();
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }
}