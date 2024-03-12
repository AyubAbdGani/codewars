// Link :https://www.codewars.com/kata/515e271a311df0350d00000f
import java.util.stream.IntStream;

public class Solution{
    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{5,-3,4}));
    }

    public static int squareSum(int[] n) { 
       return IntStream.of(n).reduce(0,(acc, curr) -> acc+ (curr*curr) );
    }
}