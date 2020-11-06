import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String seconds1 = scanner.nextLine();
        String seconds2 = scanner.nextLine();
        LocalTime lt1 = LocalTime.parse(seconds1);
        LocalTime lt2 = LocalTime.parse(seconds2);

        System.out.println(Math.abs(lt2.toSecondOfDay() - lt1.toSecondOfDay()));

        System.out.println(LocalDateTime.of(2020, 12, 31, 23, 59, 59).minusYears(1));

        System.out.println(LocalDateTime.of(LocalDate.of(2020, 1, 1), LocalTime.MIDNIGHT).minusSeconds(1));

        System.out.println(LocalDateTime.of(2020, 1, 1, 0, 1, 1).minusSeconds(61));

        System.out.println(LocalDateTime.of(LocalDate.of(2019, 12, 31), LocalTime.MAX));

        System.out.println(LocalDateTime.parse("2019-12-31T23:59").withSecond(59));

        System.out.println(LocalDateTime.parse("2017-12-31T23:59").withYear(2019));
    }
}