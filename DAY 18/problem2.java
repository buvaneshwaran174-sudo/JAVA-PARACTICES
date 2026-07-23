import java.util.*;

class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    public List<String> findWords(char[][] board, String[] words) {

        TrieNode root = buildTrie(words);

        List<String> result = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                dfs(board, i, j, root, result);
            }
        }

        return result;
    }

    private TrieNode buildTrie(String[] words) {

        TrieNode root = new TrieNode();

        for (String word : words) {

            TrieNode node = root;

            for (char c : word.toCharArray()) {

                int index = c - 'a';

                if (node.children[index] == null)
                    node.children[index] = new TrieNode();

                node = node.children[index];
            }

            node.word = word;
        }

        return root;
    }

    private void dfs(char[][] board,
                     int row,
                     int col,
                     TrieNode node,
                     List<String> result) {

        if (row < 0 || col < 0 ||
            row >= board.length || col >= board[0].length)
            return;

        char c = board[row][col];

        if (c == '#' || node.children[c - 'a'] == null)
            return;

        node = node.children[c - 'a'];

        if (node.word != null) {
            result.add(node.word);
            node.word = null;
        }

        board[row][col] = '#';

        dfs(board, row + 1, col, node, result);
        dfs(board, row - 1, col, node, result);
        dfs(board, row, col + 1, node, result);
        dfs(board, row, col - 1, node, result);

        board[row][col] = c;
    }
}