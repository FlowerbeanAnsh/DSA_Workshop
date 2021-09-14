class Solution {
    public int maxSubArray(int[] nums) {
      
       
        int sum = 0;
        int main_sum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum > main_sum){
                main_sum = sum;
            }
            if(sum <= 0){
                sum = 0;
            }
        }
        
        return main_sum ;
        
    }
}
