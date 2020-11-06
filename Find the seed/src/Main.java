import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String[] abnk = scanner.nextLine().split(" ");
        int a = Integer.parseInt(abnk[0]);
        int b = Integer.parseInt(abnk[1]);
        int n = Integer.parseInt(abnk[2]);
        int k = Integer.parseInt(abnk[3]);
        int oldA = a;

        ArrayList<Integer> findTheMax = new ArrayList<>();
        ArrayList<Integer> findMinFromMax = new ArrayList<>();
        while (a <= b) {
            findTheMax.clear();
            Random random = new Random(a);
            for (int i = 0; i < n; i++) {
                findTheMax.add(random.nextInt(k));
            }
            findMinFromMax.add(findTheMax.stream().max(Integer::compareTo).get());
            a++;
        }
        int seed = oldA + findMinFromMax.indexOf(findMinFromMax.stream().min(Integer::compareTo).get());
        System.out.println(seed);
        Random random = new Random(seed);
        findTheMax.clear();
        for (int i = 0; i < n; i++) {
            findTheMax.add(random.nextInt(k));
        }
        System.out.println(findTheMax.stream().max(Integer::compareTo).get());
    }
}