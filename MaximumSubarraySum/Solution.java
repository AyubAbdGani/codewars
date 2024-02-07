package MaximumSubarraySum;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        
    }

    public static int sequence(int[] arr) {
        if (arr == null || arr.length == 0){
            return 0;
        }

        int result = Integer.MIN_VALUE;
        int startPoint = 0;
        int range = 2;
        boolean right = true;

        for(;;){
            int temp = 0;

            for (int i = startPoint; i < range + startPoint; i++){
                temp += arr[i];
            }
            
            if (temp > result){
                result = temp;
            }

            if (right){
                startPoint++;
                if (startPoint + range >= arr.length){
                    right = false;
                    startPoint = arr.length - range;
                }
            }else{
                startPoint--;
                if (startPoint - range < 0){
                    right = true;
                    startPoint = 0;
                    range++;
                    if (range > arr.length){
                        break;
                    }
                }
            }
            

        }

        return result < 0 ? 0 : result;
    }
}
