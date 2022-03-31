public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(Math.max(0, repeat));
    }
}
