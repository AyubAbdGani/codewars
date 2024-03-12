// Link : https://www.codewars.com/kata/55b3425df71c1201a800009c

package StatisticsForAnAthleticAssociation;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
       System.out.println(stat("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41"));  
    }
        
	public static String stat(String strg) {
		
        if (strg.isEmpty()) return "";

        String[] split = strg.split(",");

        List<Integer> list = new ArrayList<>();

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH|mm|ss");
        for (String str : split){
            str = padTime(str);
            LocalTime lTime = LocalTime.parse(str, formater);
            list.add(lTime.toSecondOfDay());
        }

        Collections.sort(list);

        int range = list.get(list.size()-1) - list.get(0);
        int average = list.stream().mapToInt(Integer::intValue).sum()/list.size();
        int median = hitungMedian(list);

        Duration dr = Duration.ofSeconds(range);
        Duration da = Duration.ofSeconds(average);
        Duration dm = Duration.ofSeconds(median);

        LocalTime lr = LocalTime.MIDNIGHT.plus(dr);
        LocalTime la = LocalTime.MIDNIGHT.plus(da);
        LocalTime lm = LocalTime.MIDNIGHT.plus(dm);

        return String.format("Range: %s Average: %s Median: %s", lr.format(formater), la.format(formater), lm.format(formater));
        


	}

    private static String padTime(String str){
        String[] split = str.split("\\|");

        for (int i = 0; i < split.length; i++){
            split[i] = split[i].trim().length() <= 1 ? String.format("0%s", split[i].trim()) : split[i].trim();
        }

        return String.join("|", split);
    }

    private static int hitungMedian(List<Integer> list) {
        int size = list.size();
        int middleIndex = size / 2;

        if (size % 2 == 0) {
            int mid1 = list.get(middleIndex - 1);
            int mid2 = list.get(middleIndex);
            return (int) (mid1 + mid2) / 2;
        } else {
            return list.get(middleIndex);
        }
    }

}