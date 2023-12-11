public class Rook extends Piece {
    public Rook (ColorType color)
    {
        super(color, PieceType.ROOK);
    }
    
    @Override
    public String showPiece()
    {
        return "Rook";
    }

    public void movePiece(Square a) {
        System.out.println(a.showX());
        System.out.println(a.showY());
    }//end movePiece
}//end Rook
