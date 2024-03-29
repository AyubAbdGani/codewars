package TakeANumber;
/*
 Take a Number And Sum Its Digits Raised 
 To The Consecutive Powers And ....¡Eureka!! (raulbc777)

 Link : https://www.codewars.com/kata/5626b561280a42ecc50000d1
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String... args) {
        System.out.println(sumDigPow(1,100));   
    }

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> list = new ArrayList<>();
        for (long i = a; i <= b; i++){
            String[] arr = String.valueOf(i).split("");
            long sm = 0;
            for (int j = 0; j < arr.length; j++){
                sm += Math.pow(Long.parseLong(arr[j]),j+1);
            }
            if (sm == i){
                list.add(i);
            }
        }
        return list;
    }
 
}
