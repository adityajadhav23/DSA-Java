package arrays;

public class Q3_sum_of_array {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        System.out.println(sum);
    }
}
