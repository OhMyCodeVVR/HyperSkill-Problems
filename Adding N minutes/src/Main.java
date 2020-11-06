import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        LocalDateTime ldt = LocalDateTime.parse(scanner.nextLine());
        int minutesToAdd = scanner.nextInt();

        ldt = ldt.plusMinutes(minutesToAdd);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy " + ldt.getDayOfYear() + " HH:mm:ss");

        if (ldt.getSecond() == 0) {
            dtf = DateTimeFormatter.ofPattern("yyyy " + ldt.getDayOfYear() + " HH:mm");
            System.out.println(ldt.format(dtf));
        } else {
            System.out.println(ldt.format(dtf));
        }
    }
}