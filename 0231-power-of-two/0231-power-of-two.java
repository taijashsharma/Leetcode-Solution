class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return isPower(n, 1);
    }

    private boolean isPower(int n, long mul) {
        if (n == mul) {
            return true;
        }
        if (mul > n) { 
            return false;
        }
        return isPower(n, mul * 2);
    }
}