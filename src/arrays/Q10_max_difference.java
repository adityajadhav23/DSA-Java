package arrays;

public class Q10_max_difference {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4,99};
        int min = nums[1];
        int max_difference = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            int difference = nums[i] - min;
            if(difference > max_difference){
                max_difference = difference;
            }
            if(nums[i] < min){
                min  = nums[i];
            }
        }

        System.out.println(max_difference);
    }
}
