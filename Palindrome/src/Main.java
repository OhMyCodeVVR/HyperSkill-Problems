import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String word = null;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            word = scanner.nextLine();
        }
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length / 2; i++) {
            if (letters[i] != letters[letters.length - 1 - i]) {
                System.out.println("no");
                System.exit(0);
            }
        }
        System.out.println("yes");
        char c = '1' + '3';
        System.out.println(c);
    }
}