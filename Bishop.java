public class Bishop extends Piece {
    public Bishop (ColorType color)
    {
        super(color, PieceType.BISHOP);
    }
    
    @Override
    public String showPiece()
    {
        return "Bishop";
    }

    public void movePiece(Square a) {
        System.out.println(a.showX());
        System.out.println(a.showY());
    }//end movePiece
}//end Bishop
