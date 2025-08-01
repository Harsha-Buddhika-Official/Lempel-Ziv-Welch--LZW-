public class LZWCompressor {
    public static void compress(String in) {
        String[] dict = new String[4096];
        int idx = 256;
        for (int i = 0; i < 256; i++) {
            dict[i] = String.valueOf((char)i);
        }

        String s = String.valueOf(in.charAt(0));
        int p = 1;

        while (p < in.length()) {
            char c = in.charAt(p);
            String sc = s + c;

            if (contains(dict, idx, sc)) {
                s = sc;
            } else {
                int code = findCode(dict, idx, s);
                System.out.print(code + " ");

                if (idx < 4096) {
                    dict[idx++] = sc;
                }
                s = String.valueOf(c);
            }
            p++;
        }

        int code = findCode(dict, idx, s);
        System.out.print(code);
    }

    private static boolean contains(String[] dict, int size, String str) {
        for (int i = 0; i < size; i++) {
            if (dict[i] != null && dict[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static int findCode(String[] dict, int size, String str) {
        for (int i = 0; i < size; i++) {
            if (dict[i] != null && dict[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
}