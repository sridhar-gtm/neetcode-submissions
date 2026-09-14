class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet[] rows = new HashSet[9];
        HashSet[] cols = new HashSet[9];
        HashSet[] boxes = new HashSet[9];

        for(int i=0; i<9; i++) {
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int i=0; i<board.length; i++) {
            for (int j= 0; j<board.length; j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                if (rows[i].contains(board[i][j]) || cols[j].contains(board[i][j])
                            || boxes[((i/3) * 3 + (j/3))].contains(board[i][j])) {
                    return false;
                }
                rows[i].add(board[i][j]);
                cols[j].add(board[i][j]);
                boxes[((i/3) * 3 + (j/3))].add(board[i][j]);
            }
        }

        return true;
    }
}
