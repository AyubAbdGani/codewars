package RomanNumeralsHelper;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static Map<Character, Integer> romanData;

    static {
        romanData = new TreeMap<>();
        romanData.put('I', 1);
        romanData.put('V', 5);
        romanData.put('X', 10);
        romanData.put('L', 50);
        romanData.put('C', 100);
        romanData.put('D', 500);
        romanData.put('M', 1000);
    }

    public static void main(String... args){
        System.out.println(fromRoman("CXLIII"));
        System.out.println(toRoman(143));
    }

    public static String toRoman(int n) {
        String str = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        int p = 0;

        for(int i = str.length() - 1; i >= 0; i--){
            int val = Integer.valueOf(String.valueOf(str.charAt(i)));
            if (val == 0 && p == 0){
                p++;
                continue;
            }

            int satuan = Math.toIntExact((long) Math.pow(10, p));
            if (4 == val){
                int a = 5 * satuan;
                int b = 1 * satuan;
                result.append(String.valueOf(getLetter(a)) + getLetter(b)); 
            }else if (9 == val){
                int a = 10 * satuan;
                int b = 1 * satuan;
                result.append(String.valueOf(getLetter(a)) + getLetter(b)); 
            }else{
                int iter = val >= 5 ? Math.abs(5-val) : val;  
                for (int j = 0; j < iter; j++){
                    result.append(getLetter(1 * satuan));
                }

                if (val >= 5) {
                    result.append(getLetter(5 * satuan));
                }
            }
            p++;
        }
        return result.reverse().toString();
    }
      
    public static int fromRoman(String romanNumeral) {
        int result = 0;
        for (int i = 0; i < romanNumeral.length(); i++){
            if (i + 1 < romanNumeral.length()){
                int ri = getValue(romanNumeral.charAt(i));
                int rii = getValue(romanNumeral.charAt(i+1));
                if (ri < rii){
                    result += rii - ri;
                    i++;
                }else{
                    result += ri;
                }
            }else{
                result += getValue(romanNumeral.charAt(i));
            }
         }
        return result;
    }

    public static int getValue(char c){
        return romanData.get(c);
    }

    public static char getLetter(int v){
        for (Map.Entry<Character, Integer> entry : romanData.entrySet()){
            if (entry.getValue() == v){            
                return entry.getKey();
            }
        }
        return 0;
    }
}
