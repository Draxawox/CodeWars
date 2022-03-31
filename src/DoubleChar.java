public class DoubleChar {
    public static String doubleChar(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append(s.charAt(i));
        }
        return String.valueOf(sb);
    }
}
