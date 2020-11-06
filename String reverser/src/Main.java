
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                String reverse = "";
                char[] chars = str.toCharArray();
                for (int i = chars.length - 1; i >= 0; i--) {
                    reverse += chars[i];
                }
                return reverse;
            }
        };

        System.out.println(reverser.reverse(line));
    }

    interface StringReverser {

        String reverse(String str);
    }

}