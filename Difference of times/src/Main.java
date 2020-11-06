
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] ldt = new int[6];
        for (int i = 0; i < ldt.length; i++) {
            ldt[i] = scanner.nextInt();
        }
        LocalTime time1 = LocalTime.of(ldt[0], ldt[1], ldt[2]);
        LocalTime time2 = LocalTime.of(ldt[3], ldt[4], ldt[5]);
        System.out.println(time2.toSecondOfDay() - time1.toSecondOfDay());
    }
}