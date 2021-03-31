package arrays;
/*
215. Kth Largest Element in an Array.
*/
public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, nums.length - k, 0, nums.length-1);
    }

    private int quickSort(int[] nums, int k, int start, int end) {
        
        int pivot = nums[start];
        int index = start;
        for(int i=start+1; i<=end; i++){
            if(nums[i]<=pivot){
                index++;
                swap(nums, i, index);
            }
        }
        swap(nums, start, index);

        if(k>index){
            return quickSort(nums, k, index+1, end);
        }
        
        if(k<index){
            return quickSort(nums, k, start, index-1);
        }
        
        return nums[index];
    }

    private void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
