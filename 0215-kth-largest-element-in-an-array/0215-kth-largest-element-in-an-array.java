
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int max=nums[0];
        for(int i=0;i<=nums.length-k;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}