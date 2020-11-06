import java.util.Scanner;

public class Main {

    void binarySearch(int[] array, int left, int right, int searchFor) {

        if (left > right) {
            System.out.print(-1 + " ");
            return;
        }
        int mid = left + (right - left) / 2;
        if (array[mid] == searchFor) {
            System.out.println((mid += 1) + " ");
        } else if (searchFor < array[mid]) {
            binarySearch(array, left, mid - 1, searchFor);
        } else {
            binarySearch(array, mid + 1, right, searchFor);
        }
    }

    public static void main(String[] args) {
        // put your code here
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        //seq 1 scan
        int length1 = scanner.nextInt();
        scanner.nextLine();
        String[] numbers1 = new String[length1];
        numbers1 = scanner.nextLine().split(" ");
        int[] array1 = new int[numbers1.length];

        //seq 2 scan
        int length2 = scanner.nextInt();
        scanner.nextLine();
        String[] numbers2 = new String[length2];
        numbers2 = scanner.nextLine().split(" ");
        int[] array2 = new int[numbers2.length];
        //arr1 parse
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(numbers1[i]);
        }
        //arr2 parse
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(numbers2[i]);
        }
        for (int i: array2) {
            main.binarySearch(array1, 0, array1.length - 1, i);
        }

    }
}
