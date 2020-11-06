@FunctionalInterface
interface Callable<V> {
    V call() throws Exception;
}

class FutureUtils {

    public static int determineCallableDepth(Callable callable) throws Exception {
        // write your code here
        int counter = 1;
        Object o = callable.call();
        while (o instanceof Callable) {
            if (!(o instanceof Callable)) {
                System.out.println(counter);
                break;
            }
            counter++;
            o = ((Callable<?>) o).call();

        }
        return counter;
    }

    public static void main(String[] args) throws Exception {
        Callable<Integer> generator = () -> {
            TimeUnit.SECONDS.sleep(1);
            return 700000;
        };
        Callable<Callable> generator1 = () -> {
            return generator;
        };
        Callable<Callable> generator2 = () -> {
            return generator1;
        };
        Callable<Callable> generator3 = () -> {
            return generator2;
        };
        Callable<Callable> generator4 = () -> {
            return generator3;
        };
        Callable<Callable> generator5 = () -> {
            return generator4;
        };

        System.out.println(determineCallableDepth(generator5));
    }
}