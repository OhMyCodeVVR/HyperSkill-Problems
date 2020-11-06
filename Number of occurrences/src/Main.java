import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String stroke = scanner.nextLine();
        String countIt = scanner.nextLine();
        String[] arr = stroke.split(" ");
        int counter = 0;

        for (String s : arr) {
            if (s.contains(countIt)) {
                while (s.contains(countIt)) {
                    if (s.indexOf(countIt) == 0) {
                        s = s.substring(countIt.length());
                    } else if (countIt.length() != 1) {
                        s = s.substring(s.indexOf(countIt), countIt.length());
                    } else {
                        s = s.substring(s.indexOf(countIt), s.length() - countIt.length());
                    }
                    counter++;
                }
            } else {
                continue;
            }
        }
        System.out.println(counter);
    }

}
