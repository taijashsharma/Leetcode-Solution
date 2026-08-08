class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int windowSize = p.length();

        if (windowSize > s.length()) {
            return result;
        }

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        // p ki frequency
        for (char ch : p.toCharArray()) {
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        // s ki first window
        for (int i = 0; i < windowSize; i++) {
            char ch = s.charAt(i);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
        }

        // First window check
        if (pMap.equals(windowMap)) {
            result.add(0);
        }

        // Sliding Window
        for (int i = windowSize; i < s.length(); i++) {

            // Remove outgoing
            char outgoing = s.charAt(i - windowSize);

            windowMap.put(
                outgoing,
                windowMap.get(outgoing) - 1
            );

            if (windowMap.get(outgoing) == 0) {
                windowMap.remove(outgoing);
            }

            // Add incoming
            char incoming = s.charAt(i);

            windowMap.put(
                incoming,
                windowMap.getOrDefault(incoming, 0) + 1
            );

            // Check current window
            if (pMap.equals(windowMap)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}