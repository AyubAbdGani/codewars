public class Solution {

    public static void main(String[] args) {
        System.out.println(getCount("Heybooro"));
    }

    public static int getCount(String str) {
        return  (int) str.chars().filter((v) -> ("aiueo".indexOf( v) != -1) ).count();
    }
}