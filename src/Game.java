public class Game {
    private Board board;
    private Movement[] movements;

    public Game() {
        board = new Board();
        movements = new Movement[10000];
        for (int i = 0; i < movements.length; i++) {
            movements[i] = null;
        }
    }

    public void movePiece(Movement movement) {
        int index = 0;
        while (movements[index] != null) {
            index++;
        }
        movements[index] = movement;
        board.movePiece(movement);
    }

    @Override
    public String toString() {
        String s = board.toString();
        int index = 0;
        while (movements[index] != null) {
            s += movements[index] + "\n";
            index++;
        }
        return s;
    }


}
