package Decompressor;
public class LZWDecompression {
    public static void decompress(String[] inputCodes) {
        String[] dictionary = new String[4096];
        int dictSize = 256;
        for (int i = 0; i < 256; i++) {
            dictionary[i] = String.valueOf((char)i);
        }

        String s = null;
        int k = Integer.parseInt(inputCodes[0]);
        String entry = dictionary[k];
        System.out.print(entry);

        for (int i = 1; i < inputCodes.length; i++) {
            k = Integer.parseInt(inputCodes[i]);
            try {
                entry = dictionary[k];
            } catch (Exception e) {
                entry = s + s.charAt(0);
            }

            System.out.print(entry);

            if (s != null) {
                String newEntry = s + entry.charAt(0);
                if (dictSize < 4096) {
                    dictionary[dictSize++] = newEntry;
                }
            }
            s = entry;
        }
    }
}