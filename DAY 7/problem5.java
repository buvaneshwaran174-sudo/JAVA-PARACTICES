class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        boolean[] valid = new boolean[26];

        for (char c : allowed.toCharArray())
            valid[c - 'a'] = true;

        int count = 0;

        for (String word : words) {

            boolean ok = true;

            for (char c : word.toCharArray()) {
                if (!valid[c - 'a']) {
                    ok = false;
                    break;
                }
            }

            if (ok)
                count++;
        }

        return count;
    }
}