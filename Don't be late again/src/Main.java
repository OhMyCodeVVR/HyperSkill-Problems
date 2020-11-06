
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int countOfStores = scanner.nextInt();
        String[] nameAndTime = new String[countOfStores];
        LocalTime exitTime = LocalTime.of(19, 30);
        LocalTime[] timeToParse = new LocalTime[countOfStores];
        ArrayList<String> stores = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < countOfStores; i++) {
            if (scanner.hasNext()) {
                nameAndTime[i] = scanner.nextLine();
            }
            timeToParse[i] = LocalTime.parse(nameAndTime[i].split(" ")[1]);
            if (exitTime.plusMinutes(30).isBefore(timeToParse[i])) {
                stores.add(nameAndTime[i].split(" ")[0]);
            }
        }
        for (String s : stores) {
            System.out.println(s);
        }
    }
}
