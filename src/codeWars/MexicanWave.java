package codeWars;

public class MexicanWave {
    public static String[] wave(String str) {
        String[] wave = new String[str.length()];
        if (str.length() == 0) {
            return new String[]{""};
        } else {
            for (int i = 0; i < str.length(); i++) {
                char a = str.substring(i, i + 1).toUpperCase().charAt(0);

                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(i, a);
                wave[i] = String.valueOf(sb);
            }
            return wave;
        }
    }
}
