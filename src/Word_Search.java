public class Word_Search {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];
        boolean res = false;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] == word.charAt(0)) {
                    res = dfs(row, col, 0, board, word, visited);
                    if (res) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dfs(int row, int col, int index, char[][] board, String word, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index) || visited[row][col]) {
            return false;
        }
        visited[row][col] = true;
        if (
                dfs(row + 1, col, index + 1, board, word, visited) ||
                        dfs(row - 1, col, index + 1, board, word, visited) ||
                        dfs(row, col + 1, index + 1, board, word, visited) ||
                        dfs(row, col - 1, index + 1, board, word, visited)
        ) {
            return true;
        }
        visited[row][col] = false;
        return false;
    }
}
