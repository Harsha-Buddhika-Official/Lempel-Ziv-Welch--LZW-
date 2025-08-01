public class LZWMain {
    public static void main(String[] args) {
        String input = "TOBEORNOTTOBEORTOBEORNOT";
        System.out.println("Compressed codes:");
        LZWCompressor.compress(input);
    }
}