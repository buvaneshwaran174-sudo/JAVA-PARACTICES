class Solution {
    public String losingPlayer(int x, int y) {

        int moves = Math.min(x, y / 4);

        if (moves % 2 == 1) {
            return "Alice";
        }

        return "Bob";
    }
}