class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return check(s); 
    }

        private boolean check(String s) { 
        if (s==null || s.length() <=1){
            return true;
        }
        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }
        return check(s.substring(1,s.length()-1));
    }
}