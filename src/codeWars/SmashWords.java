package codeWars;

public class SmashWords {
    public static String smash(String... words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return String.valueOf(sb);
    }
}
