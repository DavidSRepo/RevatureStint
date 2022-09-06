package Exercises;

import java.util.Arrays;

public class BackwardsArray1 {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int hold;


        for (int i = 0; i<= nums.length / 2; i++){
            hold = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = hold;


        }

        System.out.print(Arrays.toString(nums));
    }
}
