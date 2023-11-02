package codeWars;

public class PowerOf2 {
    public static long[] powersOfTwo(int n) {
        long[] arr = new long[n + 1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = (long) Math.pow(2, i);
        }
        return arr;
    }
}
