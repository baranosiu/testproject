package local.pbaranowski.fibo;

import java.math.BigInteger;
import java.util.HashMap;

public class Fibo {
    public static HashMap<BigInteger, BigInteger> cache = new HashMap<>();

    public static BigInteger fibo(BigInteger n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        if (n.compareTo(BigInteger.ONE) < 0) {
            return BigInteger.ZERO;
        }
        if (n.compareTo(BigInteger.ONE) == 0) {
            return BigInteger.ONE;
        }
        BigInteger result = fibo(n.subtract(BigInteger.ONE)).add(fibo(n.subtract(BigInteger.TWO)));
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        BigInteger n = BigInteger.ZERO;
        BigInteger limit = BigInteger.valueOf(500);
        while (n.compareTo(limit) <= 0) {
            System.out.println("" + n + " -> " + fibo(n));
            n = n.add(BigInteger.ONE);
        }
    }
}