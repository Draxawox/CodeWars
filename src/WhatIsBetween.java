import java.util.ArrayList;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            list.add(i);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
