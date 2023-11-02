package codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GravityFlip {
    public static int[] flip(char dir, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.stream(arr).forEach(list::add);
        if (dir == 'R') {
            Collections.sort(list);
        } else {
            list.sort(Collections.reverseOrder());
        }
        int[] ar = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ar[i] = list.get(i);
        }
        return ar;
    }
}
