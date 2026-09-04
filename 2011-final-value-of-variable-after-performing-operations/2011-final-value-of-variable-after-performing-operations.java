class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        
        for (int i = 0; i < operations.length; i++) {
            // Har operation string me middle character (index 1) check kar lo
            if (operations[i].charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        
        return x;
    }
}