import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] values = date.split(" ");
        int year = Integer.parseInt(values[0]);
        int month = Integer.parseInt(values[1]);
        int offset = Integer.parseInt(values[2]);
        LocalDate ld = LocalDate.of(year, month, 1);
        System.out.println(ld = ld.plusMonths(1).minusDays(offset));

    }
}