import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String entered = reader.readLine();
        String[] counter = entered.trim().split("\\s+");
        if (counter[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(counter.length);
        }

    }
}