package data;

import java.util.Arrays;
import java.util.Random;

public class SortWhile {
    public static void main(String[] args) {

        Random random = new Random();

        int[] nums = {random.nextInt(10), 7, 5, 0, 155, 4, 5};

        System.out.println(Arrays.toString(sortWhile(nums)));

        System.out.println("->>>" + Arrays.toString(sortForI(nums)));



    }
    public static int [] sortWhile(int[] nums){
        int tamp;
        boolean count = false;

        while (!count){
            count = true;
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] > nums[i+1]){
                    tamp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tamp;
                    count = false;
                }
            }
        }
//        for(int i : nums){
//            System.out.println(i);
//        }
        return nums;
    }

    public static  int [] sortForI(int[] nums){
        int tamp;


        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    tamp = nums[i];
                    nums[j] = nums[i];
                    tamp = nums[i];
                }
            }
        }
        return nums;
    }
}
