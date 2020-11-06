import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        int a = inputStream.read();
        while (a != -1 && a != 10) {
            System.out.print(a);
            a = inputStream.read();

        }
    }
}