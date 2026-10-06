package arrays;

public class Q2_minimum_num {
    public static void main(String[] args) {
        int nums[] = {1,2,4,5,6,7,-2};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(min);
    }
}
