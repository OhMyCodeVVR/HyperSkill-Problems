import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        LocalDate ld = LocalDate.of(year, month, 1);
        System.out.print(ld + " ");
        ld = ld.plusDays(ld.lengthOfMonth() - 1);
        System.out.println(ld);
    }
}