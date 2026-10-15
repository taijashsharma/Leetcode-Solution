class Solution {
    public int sumCounts(List<Integer> nums) {

        int totalSum =0;
        for(int i =0; i<nums.size(); i++){
            Set<Integer> uniqueElements = new HashSet<>();

            for(int j=i; j<nums.size(); j++){
                uniqueElements.add(nums.get(j));

                int distintCount = uniqueElements.size();
                totalSum += distintCount*distintCount;
            }
        }
        return totalSum;
    }
}