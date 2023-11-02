package codeWars;

public class PagesInBook {
    public static int amountOfPages(int summary) {
        int counter = summary;
        for (int i = 1; i <= summary; i++) {
            counter -= String.valueOf(i).length();
            if (counter == 0) {
                return i;
            }
        }
        return counter;
    }
}
