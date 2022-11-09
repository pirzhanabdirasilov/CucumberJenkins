package steps_defs.PojoSteps;

import java.util.Arrays;


public class Draft {
    public static void main(String[] args) {
        int [] nums = {90,70,10,100,9,1,4,6,200};

        String str = "Hello123abc123";

        System.out.println("1-->" + Arrays.toString(Draft.sort(nums)));
        System.out.println("1-->" + Arrays.toString(Draft.sort1(nums)));

        System.out.println(Draft.sum(str));
    }

    public static int sum(String str){

        int num = 0;

        char [] run = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(run[i])){
                num += Character.getNumericValue(run[i]);
            }
        }
        return num;
    }
    public static int[] sort(int [] nums){

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j] ){
                    int num = nums[i];
                    nums[i] = nums[j];
                    nums[j] = num;
                }
            }
        }

        return nums;
    }

    public static int[] sort1(int [] nums){

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j] ){
                    int num = nums[i];
                    nums[i] = nums[j];
                    nums[j] = num;
                }
            }
        }

        int i = nums[nums.length-2];
        int j = nums[nums.length-1];

        int [] numw = {i,j};

        return numw;
    }


}
