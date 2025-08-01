import java.util.Scanner;

public class LZWMainUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to compress: ");
        String input = scanner.nextLine();
        System.out.println("Compressed codes:");
        LZWCompressor.compress(input);
        scanner.close();
    }
}