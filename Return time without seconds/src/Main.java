import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        LocalTime lt = LocalTime.parse(time).withSecond(0);
        System.out.println(lt);
    }
}