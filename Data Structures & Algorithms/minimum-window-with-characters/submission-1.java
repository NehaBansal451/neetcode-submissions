class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: store frequency of t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int l = 0, count = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // Step 2: sliding window
        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) >= 0) {
                    count++;
                }
            }

            // Step 3: shrink window when valid
            while (count == t.length()) {

                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                char leftChar = s.charAt(l);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }

                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}