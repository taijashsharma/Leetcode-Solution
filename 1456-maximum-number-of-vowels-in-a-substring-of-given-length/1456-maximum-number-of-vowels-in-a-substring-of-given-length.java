class Solution {
    public int maxVowels(String s, int k) {
        int vowelCount =0; 
        int maxCount =0;

        for(int i=0; i< k ;i++){
           char ch = s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                vowelCount++;

            }
            maxCount = vowelCount;
        }
        for(int i =k ; i< s.length(); i++){
            char outgoing =s.charAt(i-k);
            char incoming =s.charAt(i);

            if(outgoing=='a'|| outgoing=='e'|| outgoing=='i'|| outgoing=='o'|| outgoing=='u'){
                vowelCount--;
            }
            if(incoming=='a'|| incoming=='e'|| incoming=='i'|| incoming=='o'|| incoming=='u'){
                vowelCount++;
            }
            maxCount = Math.max(maxCount,vowelCount);
        }
           return maxCount;
    }
}