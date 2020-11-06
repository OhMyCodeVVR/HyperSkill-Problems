import java.io.CharArrayWriter;
import java.io.IOException;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        // implement the method
        CharArrayWriter caw = new CharArrayWriter();
        for (String s : words) {
            caw.append(s);
        }
        return caw.toCharArray();
    }
}
