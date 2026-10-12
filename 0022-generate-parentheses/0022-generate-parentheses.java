class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        solve(n,0,0,"",result);
        return result;
        }
        private void solve(int n, int open , int close , String curr , List<String> result){

            //base 
            if(curr.length()==2*n){
                result.add(curr);
                return;
            }
            if(open<n){
                solve(n, open+1,close,curr + "(" , result);
            }
             if(close<open){
                solve(n, open,close+1,curr + ")" , result);
        }   
        
    }
}