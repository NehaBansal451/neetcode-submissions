class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder mix = new StringBuilder();

        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            mix.append(word1.charAt(i));
            mix.append(word2.charAt(j));
            i++;
            j++;
        }

        // remaining characters
        while (i < word1.length()) {
            mix.append(word1.charAt(i));
            i++;
        }

        while (j < word2.length()) {
            mix.append(word2.charAt(j));
            j++;
        }

        return mix.toString();
    }
}