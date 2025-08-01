package Decompressor;
public class Main {
    public static void main(String[] args) {
        String[] inputCodes = {"84", "79", "66", "69", "79", "82", "78", "79", "84", "256", "258", "260", "262", "77"};
        System.out.println("Decompressed string:");
        LZWDecompression.decompress(inputCodes);
    }
}