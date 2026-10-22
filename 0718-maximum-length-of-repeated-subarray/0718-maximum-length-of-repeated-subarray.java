class Solution {
    public int findLength(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int maxlen=0;

        for(int i=0; i<m; i++){
            int len = Math.min(m-i,n);
            maxlen = Math.max(maxlen,checkover(nums1, nums2 , i , 0 , len));
        }

        for(int j=0; j<n; j++){
            int len = Math.min(m,n-j);
            maxlen = Math.max(maxlen,checkover(nums1, nums2 , 0 , j, len));
        }
         return maxlen;
    }

        private int checkover(int[] nums1, int[] nums2, int index1,int index2, int len){

            int maxCount =0 ;
            int currCount =0;
            for(int k=0; k<len; k++){
                if(nums1[index1+k] == nums2[index2+k]){
                    currCount++;
                    maxCount = Math.max(maxCount,currCount);
                }
                else{
                    currCount=0;
                }
            }
        return maxCount;
    }
}