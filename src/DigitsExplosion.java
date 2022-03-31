public class DigitsExplosion {
    public static String explode(String digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            sb.append(String.valueOf(digits.toCharArray()[i]).repeat(Math.max(0, Integer.parseInt(digits.substring(i, i + 1)))));
        }
        return sb.toString();
    }
}
