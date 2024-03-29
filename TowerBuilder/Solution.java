//Link : https://www.codewars.com/kata/576757b1df89ecf5bd00073b

package TowerBuilder;

import java.util.*;

public class Solution {
    public static void main(String... args) {
        System.out.println(Arrays.toString(towerBuilder(6)));
    }
    public static String[] towerBuilder(int nFloors){
        String[] result = new String[nFloors];
        for (int i = 0; i < nFloors; i++){
            StringBuilder build = new StringBuilder();
            int totalKolom = nFloors*2 -1;
            for (int j = 0 ; j < totalKolom; j++){
                if (j >= nFloors -1 - i && j < nFloors  + i ){
                    build.append('*');
                }else{
                    build.append(' ');
                }
            }
            result[i] = build.toString();
        }
        return result;      
    }
}