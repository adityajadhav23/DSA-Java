package arrays;

public class Q9_average_of_array_elements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 0, -1, -2};
        int sum = 0;
        int elements_count = nums.length;

        for (int i = 0; i < elements_count; i++) {
            sum = sum + nums[i];
        }
        double average = (double) sum / elements_count;
        System.out.println(average);
    }
}
