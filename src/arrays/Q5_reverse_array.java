package arrays;

public class Q5_reverse_array {
    public static void main(String[] args) {
        int nums[] = {10,20,30,40,50};

        int left = 0;
        int right = nums.length - 1;
        System.out.println("Left: " + left + " | Right: " + right);
        while(left<=right){
            int temp = nums[left];
            System.out.println("Temp : " + temp);
            nums[left] = nums[right];
            System.out.println("Left: " + left);
            System.out.println("Right: " + right);


            System.out.println("Left: " + nums[left]);
            System.out.println("Right: " + nums[right]);
            nums[right] = temp;
            System.out.println("Right: " + right);
            left++;
            right--;
        }
        System.out.println("{");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("}");
    }
}
