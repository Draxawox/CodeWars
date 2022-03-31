import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxDiff {
    public static int maxDiff(int[] lst) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.stream(lst).forEach(list::add);
        Collections.sort(list);
        return list.size() == 0 ? 0 : list.get(list.size() - 1) - list.get(0);
    }
}
