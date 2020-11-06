import java.util.*;

class Main {
    static void lettersCounter(char[] chars, int index) {
        int counter = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                sb.append(chars[i] + "" + counter);
                break;
            }
            if (chars[i] == chars[i + 1]) {
                while (chars[i] == chars[i + 1]) {
                    counter++;
                    i++;
                    if (i == chars.length - 1) {
                        break;
                    }
                }
                sb.append(chars[i] + "" + counter);
                counter = 1;
            } else {
                sb.append(chars[i] + "" + counter);
            }
        }
        System.out.println(sb);

    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();

        lettersCounter(chars, 0);

    }
}
