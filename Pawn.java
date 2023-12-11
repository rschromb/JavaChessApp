
public class Pawn extends Piece {
    public Pawn (ColorType color)
    {
        super(color, PieceType.PAWN);
    }
    
    @Override
    public String showPiece()
    {
        return "Pawn";
    }

    public void movePiece(Square a) {
        System.out.println(a.showX());
        System.out.println(a.showY());
    }//end movePiece
}//end Pawn
