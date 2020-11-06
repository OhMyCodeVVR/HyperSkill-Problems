import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

class Main {
    static int repeats;

    void doRepeat(int i) {
        for (int k = 0; k < i; k++) {
            if (repeats == 0) {
                break;
            }
            System.out.print(i + " ");
            repeats--;
        }
    }

    public static void main(String[] args) {
        // put your code here
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        repeats = scanner.nextInt();
        int counter = repeats;
        for (int i = 1; i <= counter; i++) {
            if (repeats == 0) {
                break;
            }
            main.doRepeat(i);


        }
    }
}