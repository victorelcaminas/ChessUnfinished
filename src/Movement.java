public class Movement {
    public Piece piece;
    public int originRow;
    public char originCol;
    public int destRow;
    public char destCol;

    public Movement(Piece piece, int originRow, char originCol, int destRow, char destCol) {
        this.piece = piece;
        this.originRow = originRow;
        this.originCol = originCol;
        this.destRow = destRow;
        this.destCol = destCol;
    }
}
