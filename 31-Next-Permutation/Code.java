class Solution {
    public void nextPermutation(int[] nums) {
        int pos = -1;
        for(int i = nums.length-2; i >=0; i--){
            if(nums[i]<nums[i+1]){
                pos = i;
                break;
            }
        }
        if(pos == -1)   reverse(nums, 0, nums.length-1);
        else{
            for(int i = nums.length - 1; i>=0; i--){
                if(nums[pos]<nums[i]){
                    int temp = nums[pos];
                    nums[pos] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }

            reverse(nums, pos+1, nums.length-1);
        }
    }

    private int[] reverse(int[] nums, int start, int end){
        int temp;
        while(start<end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
        return nums;
    }
}
