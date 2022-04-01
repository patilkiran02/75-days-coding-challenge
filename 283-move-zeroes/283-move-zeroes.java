class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero=0;
        int t;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                t=nums[i];
                nums[i]=nums[nonzero];
                nums[nonzero]=t;
                nonzero++;
                
            }
        }
        
        
    }
}