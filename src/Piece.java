public class Piece {
    private TypeOfPiece type;
    private Color color;

    public Piece(TypeOfPiece type, Color color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        if (color == Color.WHITE) {
            if (type == TypeOfPiece.PAWN) {
                return "♙";
            } else if (type == TypeOfPiece.TOWER) {
                return "♖";
            } else if (type == TypeOfPiece.KNIGHT) {
                return "♘";
            } else if (type == TypeOfPiece.BISHOP) {
                return "♗";
            } else if (type == TypeOfPiece.QUEEN) {
                return "♕";
            } else if (type == TypeOfPiece.KING) {
                return "♔";
            }
        } else {
            if (type == TypeOfPiece.PAWN) {
                return "♟";
            } else if (type == TypeOfPiece.TOWER) {
                return "♜";
            } else if (type == TypeOfPiece.KNIGHT) {
                return "♞";
            } else if (type == TypeOfPiece.BISHOP) {
                return "♝";
            } else if (type == TypeOfPiece.QUEEN) {
                return "♛";
            } else if (type == TypeOfPiece.KING) {
                return "♚";
            }
        }
        return "ERROR";
    }
}
