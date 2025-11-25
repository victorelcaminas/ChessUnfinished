public class Movement {
    public Piece piece;
    public int originRow;
    public char originCol;
    public int destRow;
    public char destCol;

    public Movement(Piece piece, char originCol, int originRow, char destCol, int destRow) {
        this.piece = piece;
        this.originRow = originRow;
        this.originCol = Character.toUpperCase(originCol);
        this.destRow = destRow;
        this.destCol = Character.toUpperCase(destCol);
    }

    @Override
    public String toString() {
        return piece + " from " + originCol + originRow + " to " +
                destCol + destRow;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getOriginRow() {
        return originRow;
    }

    public char getOriginCol() {
        return originCol;
    }

    public int getDestRow() {
        return destRow;
    }

    public char getDestCol() {
        return destCol;
    }
}
