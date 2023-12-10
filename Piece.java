public abstract class Piece {
    private final boolean isWhite;

    private Square square;

    public Piece(boolean white) {
        this.isWhite = white;
    }

    public abstract String showPiece();

    public void movePiece(Square destination) {
        square.setPiece(null); // Clear the piece from the current square
        destination.setPiece(this); // Set the piece on the new square
        square = destination; // Update the reference to the current square
    }

    public boolean checkWhite() {
        return this.isWhite;
    }

    public String showColor(boolean isWhite) {
        return isWhite ? "White " : "Black ";
    }
}
