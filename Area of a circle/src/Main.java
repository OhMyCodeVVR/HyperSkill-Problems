import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//        double rad = scanner.nextDouble();
//        System.out.println(Math.PI * rad * rad);
//        File sampleFile = new File("sample.txt");
//        byte[] content = new byte[]{'J', 'a', 'v', 'a'};
//
//        try {
//            OutputStream outputStream = new FileOutputStream(sampleFile, true);
//            outputStream.write(content);
//            outputStream.close();
//        } catch (Exception e) {
//            System.out.println("Error!");
//        }
        Reader reader = new FileReader("file.txt");
        int current = reader.read();
        while (current != -1) {
            current = reader.read();
            System.out.println((char) current);
        }
        reader.close();
    }
}