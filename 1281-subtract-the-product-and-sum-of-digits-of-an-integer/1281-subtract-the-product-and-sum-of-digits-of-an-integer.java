class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10; // Last digit nikala
            
            product *= digit;   // Multiply kiya
            sum += digit;       // Add kiya
            
            n /= 10;            // Last digit hata diya
        }
        
        return product - sum;
    }
}