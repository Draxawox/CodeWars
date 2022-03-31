import java.util.ArrayList;
import java.util.Scanner;

public class ConvertAStringToAnArray {
    public static String[] stringToArray(String s) {
        //your code;
        Scanner sc = new Scanner(s);
        ArrayList<String> stringList = new ArrayList<>();
        while (sc.hasNext()) {
            stringList.add(sc.next());
        }
        return stringList.toArray(new String[stringList.size()]);
    }
}
