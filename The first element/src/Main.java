// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define getFirst method here
    public static <E>  E getFirst(E[] array) {
        return array.length == 0 ? null : array[0];
    }
}