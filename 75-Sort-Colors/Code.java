class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        if(n == 1)  return ;
        int low = 0, mid = 0, high = n-1;

        while(mid <= high){
            if(nums[mid] == 0)  swap(nums, low ++, mid++);
            else if(nums[mid] == 1) mid++;
            else    swap(nums, mid, high--);
        }
    }

    private void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
