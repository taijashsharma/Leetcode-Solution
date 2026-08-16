class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int missingNumber =0;
        for(int i=0; i<nums.length; i++){
            missingNumber+= nums[i];

        }
        int expectedSum = n*(n+1)/2;  
        return expectedSum- missingNumber;      
    }
}