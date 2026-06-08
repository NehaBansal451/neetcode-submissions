class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // build frequency map of s1
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int l = 0;

        for (int r = 0; r < s2.length(); r++) {

            char ch = s2.charAt(r);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // keep window size = s1.length()
            if (r - l + 1 > s1.length()) {
                char leftChar = s2.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);

                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }
                l++;
            }

            // check if both maps are equal
            if (window.equals(map)) {
                return true;
            }
        }

        return false;
    }
}
