class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            // Space se split karke words ki counting nikal lo
            int currentWords = sentence.split(" ").length;
            
            // Maximum update karo
            maxWords = Math.max(maxWords, currentWords);
        }
        
        return maxWords;
    }
}