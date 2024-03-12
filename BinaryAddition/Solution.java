//Link : https://www.codewars.com/kata/551f37452ff852b7bd000139

package BinaryAddition;

public class Solution{
    public static void main(String[] args) {
        System.out.println(binaryAddition(5,3));
    }

    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a+b);
    }
}