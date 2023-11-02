package codeWars;

public class DifferenceOfVolumesOfCuboids {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int v1 = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
        int v2 = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];
        if (v1 > v2) {
            return v1 - v2;
        } else {
            return v2 - v1;
        }
    }
}
