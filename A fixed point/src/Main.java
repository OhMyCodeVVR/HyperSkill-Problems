import java.util.Scanner;

public class Main {

    boolean binarySearch(int[] array, int left, int right, int searchFor) {
        if (left > right) {
            return false;
        }
        int mid = left + (right - left) / 2;
        if (array[mid] == searchFor) {
            System.out.println(true);
            System.exit(0);
            return true;

        } else if (searchFor < array[mid]) {
            binarySearch(array, left, mid - 1, searchFor);
        } else {
            binarySearch(array, mid + 1, right, searchFor);
        }
        return false;
    }

    public static void main(String[] args) {
        // put your code here
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();
        String[] numbers = new String[length];
        numbers = scanner.nextLine().split(" ");
        int[] array = new int[numbers.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (main.binarySearch(array, i, length - 1, i)) {
                System.out.println(true);
            } else if (i == array.length - 1) {
                System.out.println(false);
            }
        }
    }
}
