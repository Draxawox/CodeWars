package codeWars;

public class BackspacesInString {
    public static String cleanString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals("#")) {
                if (sb.length() == 0) {
                    continue;
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
