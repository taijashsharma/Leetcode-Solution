class Solution {
    public void sortColors(int[] nums) {

        int low =0;
        int mid =0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                //swap 
                int temp = nums[low];
                nums[low]= nums[mid];
                nums[mid]=temp;

                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                //swap krde ab high k liye mtlb 2 k liye mtlb blue k liye 
                int temp = nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;

                high--;
            }
        }

    }
}