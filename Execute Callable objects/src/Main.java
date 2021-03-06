import java.util.List;
import java.util.concurrent.*;


class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        // write your code here
        int sum = 0;
        try {
            for (int i = items.size() - 1; i >= 0; i--) {
                Future<Callable<Integer>> f = items.get(i);
                sum += f.get().call();
            }
        } catch (Exception e) {

        }
        return sum;
    }
}


