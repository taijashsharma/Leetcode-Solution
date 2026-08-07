class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int windowSize = s1.length();

        if (windowSize > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        // 1. s1 ki frequency
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            s1Map.put(ch, s1Map.getOrDefault(ch, 0) + 1);
        }

        // 2. s2 ki first window
        for (int i = 0; i < windowSize; i++) {
            char ch = s2.charAt(i);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
        }

        // 3. First window check
        if (s1Map.equals(windowMap)) {
            return true;
        }

        // 4. Sliding Window
        for (int i = windowSize; i < s2.length(); i++) {

            // outgoing character
            char outgoing = s2.charAt(i - windowSize);

            windowMap.put(
                outgoing,
                windowMap.get(outgoing) - 1
            );

            // Agar frequency 0 ho gayi, key remove
            if (windowMap.get(outgoing) == 0) {
                windowMap.remove(outgoing);
            }

            // incoming character
            char incoming = s2.charAt(i);

            windowMap.put(
                incoming,
                windowMap.getOrDefault(incoming, 0) + 1
            );

            // Check current window
            if (s1Map.equals(windowMap)) {
                return true;
            }
        }

        return false;
    }
}