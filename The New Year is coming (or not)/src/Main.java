import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] st = scanner.nextLine().split(" ");
        LocalDate ld = LocalDate.parse(st[0]);
        LocalDate ld1 = ld.plusDays(Long.parseLong(st[1]));
        if (ld1.getYear() > ld.getYear()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}