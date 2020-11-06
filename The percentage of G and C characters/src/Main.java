import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == 'c' || c == 'g' || c == 'G' || c == 'C') {
                count++;
            }
        }
        double result = (double) count / chars.length * 100;
        System.out.println(result);
    }
}