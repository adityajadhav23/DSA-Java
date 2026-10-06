package arrays;

public class Q1_maximum {
    public static void main(String[] args) {
        int nums[] = {1,5,78,34,76};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
