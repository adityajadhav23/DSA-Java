package arrays;

public class Q6_find_second_largest {
    public static void main(String[] args) {
        int nums[] = {1, 22, 3, 4, 5, 21};

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second_max = max;
                max = nums[i];
            } else if (nums[i] > second_max && nums[i] != max) {
                second_max = nums[i];
            }
        }

        System.out.println(max);
        System.out.println(second_max);
    }
}
