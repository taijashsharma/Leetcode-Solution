class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int baseSatisfied = 0;
        int extraSatisfied =0;
        int maxExtra =0;

        for(int i =0; i<customers.length; i++){
            if(grumpy[i]==0){
                baseSatisfied+=customers[i];
            }
        }   
            for(int i=0; i<minutes; i++){
                if(grumpy[i]==1){
                    extraSatisfied += customers[i];    
            } 
            maxExtra = extraSatisfied;
        }

        for(int i =minutes; i<customers.length; i++){
            if(grumpy[i-minutes]==1){
                extraSatisfied -= customers[i - minutes];
            }
            if(grumpy[i]==1){
                extraSatisfied += customers[i];
            }
                maxExtra = Math.max(maxExtra,extraSatisfied);
        }
        return baseSatisfied + maxExtra;
    }
}