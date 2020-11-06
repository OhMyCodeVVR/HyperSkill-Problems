import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] st1 = scanner.nextLine().split(" ");
        String[] st2 = scanner.nextLine().split(" ");
        LocalTime lT_1_1 = LocalTime.parse(st1[0]);
        LocalTime lT_1_2 = LocalTime.parse(st1[1]);
        LocalTime lT_2_1 = LocalTime.parse(st2[0]);
        LocalTime lT_2_2 = LocalTime.parse(st2[1]);
        if (lT_1_1.isAfter(lT_2_2)) {
            System.out.println(false);
        } else if (lT_2_1.isAfter(lT_1_2)) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}