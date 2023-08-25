package Class8;

public class T7EnhancedLoop {
    public static void main(String[] args) {
        //find the largest even number
        int[] nums = {10, 77, 25, 56, 60, 20, -10, -5};


        for (int n : nums) {

            if (n <0) {

                n = 0;

            }

            System.out.println(n);
        }
    }
}