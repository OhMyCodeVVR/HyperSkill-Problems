import java.util.Scanner;

class Main {
    static int step = 1;
    static int addon1 = 1;


    public static void decompose(int n) {
        decompose(n, n, "");
    }

    public static void decompose(int n, int max, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 1; i <= Math.min(max, n); i++) {
            decompose(n - i, i, prefix + " " + i);
        }
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int forDecompose = scanner.nextInt();
        decompose(forDecompose);

    }
}