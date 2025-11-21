public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        // empty cells
        for (int row = 2; row <= 5; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = null;
            }
        }
        // pawns
        for (int col = 0; col < 8; col++) {
            board[1][col] = new Piece(TypeOfPiece.PAWN, Color.WHITE);
            board[6][col] = new Piece(TypeOfPiece.PAWN, Color.BLACK);
        }
        board[0][0] = new Piece(TypeOfPiece.TOWER, Color.WHITE);
        board[0][1] = new Piece(TypeOfPiece.KNIGHT, Color.WHITE);
        board[0][2] = new Piece(TypeOfPiece.BISHOP, Color.WHITE);
        board[0][3] = new Piece(TypeOfPiece.QUEEN, Color.WHITE);
        board[0][4] = new Piece(TypeOfPiece.KING, Color.WHITE);
        board[0][5] = new Piece(TypeOfPiece.BISHOP, Color.WHITE);
        board[0][6] = new Piece(TypeOfPiece.KNIGHT, Color.WHITE);
        board[0][7] = new Piece(TypeOfPiece.TOWER, Color.WHITE);

        board[7][0] = new Piece(TypeOfPiece.TOWER, Color.BLACK);
        board[7][1] = new Piece(TypeOfPiece.KNIGHT, Color.BLACK);
        board[7][2] = new Piece(TypeOfPiece.BISHOP, Color.BLACK);
        board[7][3] = new Piece(TypeOfPiece.QUEEN, Color.BLACK);
        board[7][4] = new Piece(TypeOfPiece.KING, Color.BLACK);
        board[7][5] = new Piece(TypeOfPiece.BISHOP, Color.BLACK);
        board[7][6] = new Piece(TypeOfPiece.KNIGHT, Color.BLACK);
        board[7][7] = new Piece(TypeOfPiece.TOWER, Color.BLACK);
    }

    @Override
    public String toString() {
        String s = "";
        for (int row = 7; row >=0 ; row--) {
            s += (row + 1) + " ";
            for (int col = 0; col < 8; col++) {
                if (board[row][col] == null) {
                    s += "· ";
                } else {
                    s += board[row][col] + " ";
                }
            }
            s += "\n";
        }
        s += "  ";
        for (char letter = 'A'; letter <= 'H'; letter++) {
            s += letter + " ";
        }
        s += "\n";
        return s;
    }
}
