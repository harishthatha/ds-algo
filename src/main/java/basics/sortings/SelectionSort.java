package basics.sortings;

import java.util.Arrays;

public class SelectionSort {

    // O(n^2) time complexity
    // O(1) space complexity
    // Useful when space cost has high priority
    public int[] sort(int[] nums){
        int length= nums.length;
        for(int i =0;i< length-1;i++){
            for(int j=i+1;j<length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return  nums;
    }
}
