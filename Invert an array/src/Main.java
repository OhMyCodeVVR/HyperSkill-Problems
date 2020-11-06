// do not remove imports

import java.util.*;
import java.util.function.Function;

class ArrayUtils {
    // define invert method here
    public static <E> E[] invert(E[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;
    }
}