public class NonConsecutiveNumber {
    static Integer find(final int[] array) {
        int num = array[0];
        for (int i = 1; i < array.length; i++) {
            if (num + 1 != array[i]) {
                return array[i];
            }
            num += 1;
        }
        return null;
    }
}
