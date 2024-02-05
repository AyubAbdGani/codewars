public class Solution {
    public static void main(String[] args) {
        System.out.println(zeros(100));
    }

    public static int zeros(int n) {
        int rz = 0;

        for (int i = 5; i <= n; i *= 5){
            rz += n/i;
        }

        return rz;
    }
}
