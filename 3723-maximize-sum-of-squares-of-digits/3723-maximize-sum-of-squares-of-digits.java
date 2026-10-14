class Solution {
    public String maxSumOfSquares(int num, int sum) {
      
        if (sum < 1 || sum > 9 * num) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < num; i++) {
            
            for (int d = 9; d >= 0; d--) {
                int remainingPositions = num - 1 - i;
                int remainingSum = sum - d;
                if (remainingSum >= 0 && remainingSum <= 9 * remainingPositions) {
                    ans.append(d);
                    sum -= d;
                    break;  
                }
            }
        }

        return ans.toString();
    }
}