package arrays;

import java.util.ArrayList;

public class Q8_count_positive_and_negative {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 0, -1, -2};
        int positive_count = 0;
        int negative_count = 0;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                continue;
            }
            if(nums[i] < 0){
                negative_count++;
                negative.add(nums[i]);
            }else {
                positive_count++;
                positive.add(nums[i]);
            }
        }
        System.out.println("Positive Numbers Count : " + positive_count);
        System.out.println("Positive Numbers: " + positive);

        System.out.println("Negative Numbers Count : " + negative_count);
        System.out.println(negative);
    }
}
