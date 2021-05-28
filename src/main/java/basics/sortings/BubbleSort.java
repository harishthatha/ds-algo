package basics.sortings;

public class BubbleSort {

    // worst case O(n^2)
    // best case o(n) for already sorted arrays
    public int[] sort(int[] nums){
        int length= nums.length;

        for(int i=0;i<length-1;i++){
            boolean isSwapped = false;
            for(int j=0;j<length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    isSwapped = true;                }
            }
            if(!isSwapped) break;
        }

        return nums;
    }
}
