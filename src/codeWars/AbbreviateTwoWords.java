package codeWars;

import java.util.Scanner;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(name);
        boolean isFirst = true;
        while (sc.hasNext()) {
            sb.append(sc.next().substring(0, 1).toUpperCase());
            if (isFirst) {
                sb.append(".");
                isFirst = false;
            }
        }
        return String.valueOf(sb);
    }
}
