import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.nextLine().split(" ");
        LocalDateTime ldt = LocalDateTime.parse(date[0]);
        int daysToAdd = Integer.parseInt(date[1]);
        int hoursToSubstract = Integer.parseInt(date[2]);

        System.out.println(ldt.plusDays(daysToAdd).minusHours(hoursToSubstract));
    }
}