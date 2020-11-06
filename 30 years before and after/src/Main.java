import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        LocalDate ld = LocalDate.parse(date);
        System.out.println(ld.minusYears(30));
        System.out.println(ld.plusYears(30));

    }
}