class Solution {
    public String customSortString(String order, String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch: order.toCharArray()){
            if(map.containsKey(ch)){
                int freq = map.get(ch);

                for(int i=0; i<freq; i++){
                    result.append(ch);
                }
                map.remove(ch);
            }
        }

        for(char ch: map.keySet()){
            int freq = map.get(ch);

             for(int i=0; i<freq; i++){
                    result.append(ch);
                }
        }
        return result.toString();
    }
}