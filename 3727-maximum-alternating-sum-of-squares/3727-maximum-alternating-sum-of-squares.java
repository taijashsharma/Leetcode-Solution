class Solution {
    public long maxAlternatingSum(int[] nums) {
      int n = nums.length;
      long[] squares = new long[n];

      for(int i =0; i<n; i++){
        squares[i]= (long)nums[i]*nums[i];
      } 
      Arrays.sort(squares);

      int numPositives = (n+1)/2;

      long positiveSum =0;
      long negativeSum =0;

      for(int i= n-numPositives; i<n;i++){
        positiveSum += squares[i];
      } 
       for(int i=0; i<n-numPositives;i++){
        negativeSum += squares[i];
      } 
      return positiveSum - negativeSum;
    }
}