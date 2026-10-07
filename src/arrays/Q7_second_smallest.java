package arrays;

public class Q7_second_smallest {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,0,-1,-2};

        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                second_min = min;
                min = nums[i];
            } else if (nums[i] < second_min && nums[i] != min) {
                second_min = nums[i];
            }
        }
        System.out.println(second_min);
    }
}
