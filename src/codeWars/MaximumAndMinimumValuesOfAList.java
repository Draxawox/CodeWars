package codeWars;

public class MaximumAndMinimumValuesOfAList {
    public int min(int[] list) {
        int min = list[0];
        for (int j : list) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int j : list) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
