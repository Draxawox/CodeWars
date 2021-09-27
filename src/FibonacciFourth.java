import java.math.BigInteger;
import java.util.ArrayList;

public class FibonacciFourth {
    public static BigInteger countSquare(BigInteger number) {
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(1);

        for (int i = 1; i < number.intValue(); i++) {
            fib.add(fib.get(i) + fib.get(i - 1));
        }
        return BigInteger.valueOf((fib.stream().mapToLong(Integer::intValue).sum())).multiply(BigInteger.valueOf(4));
    }
}
