class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
        int[] answer=new int[n];
        int productofAllbeforcurrent=1;
        int productofAllaftercurrent=1;
        
        for(int i=0;i<n;i++){
            answer[i]=productofAllbeforcurrent;
            productofAllbeforcurrent*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            answer[i]*=productofAllaftercurrent;
            productofAllaftercurrent*=nums[i];
        }
        return answer;
    }
}