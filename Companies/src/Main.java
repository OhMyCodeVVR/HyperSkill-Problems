import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> goj = new ArrayList<>();

        goj = Arrays.asList(scanner.nextLine().split(" "));
        System.out.println(goj);
    }
}