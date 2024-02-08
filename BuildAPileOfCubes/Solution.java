package BuildAPileOfCubes;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(findNb(1212));        
    }

    public static long findNb(long m) {
        int n = 1;
        BigInteger total = BigInteger.ZERO;

        while (total.compareTo(BigInteger.valueOf(m)) < 0) {
            total = total.add(BigInteger.valueOf(n).pow(3));
            if (total.equals(BigInteger.valueOf(m))) {
                return n;
            }
            n++;
        }

        return total.equals(BigInteger.valueOf(m)) ? n : -1;
    }
}
