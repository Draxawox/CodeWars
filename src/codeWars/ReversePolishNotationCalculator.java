package codeWars;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePolishNotationCalculator {
    public static void main(String[] args) {
        evaluate("1 2 + 4");
    }

    public static double evaluate(String expr) {
        // TODO: Your awesome code here
        Scanner sc = new Scanner(expr);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> sarr = new ArrayList<>();
        while (sc.hasNext()) {
            String temp = sc.next();
            try {
                arr.add(Integer.parseInt(temp));
            } catch (NumberFormatException e) {
                sarr.add(temp);
            }
        }
        return 0;
    }
}
