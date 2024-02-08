package RomanNumeralsHelper;

import java.math.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static class Romawi {
        Map<Character, Integer> data;

        public Romawi(){
            data = new TreeMap<>();
            data.put('I', 1);
            data.put('V', 5);
            data.put('X', 10);
            data.put('L', 50);
            data.put('C', 100);
            data.put('D', 500);
            data.put('M', 1000);
        }

        public int getValue(char c){
            return data.get(c);
        }

        public char getLetter(int v){
            for (Map.Entry<Character, Integer> entry : data.entrySet()){
                if (entry.getValue() == v){            
                    return entry.getKey();
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
    System.out.println(toRoman(1071));
      System.out.println(fromRoman("XLIV"));
    }

    

    public static String toRoman(int n) {
        Romawi romawi = new Romawi();
        String str = String.valueOf(n);
        int p = 0;
        String result = "";
        for(int i = str.length()-1; i >= 0 ; i--){
            int val = Integer.valueOf(String.valueOf(str.charAt(i)));
            if (val == 0 && p == 0){
                p++;
                continue;
            }

            int satuan = (int) Math.pow(10,p);
            if (4 == val){
                int a = Math.max(5, 5 * satuan);
                int b = Math.max(1, 1 * satuan);
                result = "" + romawi.getLetter(b) + romawi.getLetter(a) + result; 
            }else if (9 == val){
                int a = Math.max(10, 10 * satuan);
                int b = Math.max(1, 1 * satuan);
                result = "" + romawi.getLetter(b) + romawi.getLetter(a) + result; 

            }else{
                int iter = val >= 5 ? Math.abs(5-val) : val;  
                for (int j = 0; j < iter; j++){
                    result  = romawi.getLetter(Math.max(1, 1*satuan)) + result;
                }

                if (val >= 5) {
                    result = "" + romawi.getLetter(Math.max(5, 5*satuan)) + result;
                }
            }
            p++;
        }

        return result;
    }
      
    public static int fromRoman(String romanNumeral) {
        Romawi romawi = new Romawi();
        int result = 0;
        for (int i = 0; i < romanNumeral.length(); i++){
            if (i + 1 < romanNumeral.length()){
                int ri = romawi.getValue(romanNumeral.charAt(i));
                int rii = romawi.getValue(romanNumeral.charAt(i+1));
                if (ri < rii  ){
                    result += rii - ri;
                    i++;
                }else{
                    result += ri;
                }
            }else{
                result += romawi.getValue(romanNumeral.charAt(i));
            }
         }
        return result;
    }    

}
