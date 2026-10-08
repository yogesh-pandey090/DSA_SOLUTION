class Solution {
    public int[] runningSum(int[] nums) {
        int sum =0;
        int i=0;
        int l=nums.length;
        while(i<l){
            sum = sum+nums[i];
            nums[i]=sum;
            i++;
        }
        return nums;
    }
}