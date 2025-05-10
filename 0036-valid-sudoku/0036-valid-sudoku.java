class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9], cols = new boolean[9][9], boxes = new boolean[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                int d = c - '1', b = (i / 3) * 3 + j / 3;
                if (rows[i][d] || cols[j][d] || boxes[b][d]) return false;
                rows[i][d] = cols[j][d] = boxes[b][d] = true;
            }
        return true;
    }
}