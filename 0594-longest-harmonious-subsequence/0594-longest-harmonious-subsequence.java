class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int left =0;
        int max =0;

        for(int r=0; r<nums.length; r++){
            while(nums[r]-nums[left]>1){
                left++;
            }
            if(nums[r]-nums[left]==1){
                max = Math.max(max,r-left+1);
            }
            
        }
        return max;
    }
}