class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int h = people.length - 1;
        int count = 0;

        while (l <= h) {
            if (people[l] + people[h] <= limit) {
                l++;  // pair light + heavy
            }
            h--;      // heavy always goes
            count++;  // one boat used
        }

        return count;
    }
}
