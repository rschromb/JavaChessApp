// Piece.java
public abstract class Piece {
    private final ColorType color;
    private Square square;
    private final PieceType type;

    // Constructor
    public Piece(ColorType color, PieceType type) {
        this.color = color;
        this.type = type;
    } // end constructor

    // Abstract method to show the piece name
    public abstract String showPiece(); // end showPiece

    // Move the piece to the specified destination square
    public void movePiece(Square destination) {
        destination.setPiece(this);
        System.out.println("Moved " + showPiece() + " to " + destination.showX() + ", " + destination.showY());
    } // end movePiece

    // Get the color of the piece
    public ColorType getColor() {
        return color;
    } // end getColor

    // Get the type of the piece
    public PieceType getType() {
        return type;
    } // end getType

    // Enum for piece types
    public enum PieceType {
        PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
    } // end PieceType

    // Enum for color types
    public enum ColorType {
        PLAYER1, PLAYER2
    } // end ColorType
}