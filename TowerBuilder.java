
import java.util.*;
public class TowerBuilder {
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