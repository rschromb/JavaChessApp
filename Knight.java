public class Knight extends Piece {
    public Knight (ColorType color)
    {
        super(color, PieceType.KNIGHT);
    }
    
    @Override
    public String showPiece()
    {
        return "Knight";
    }

    public void movePiece(Square a) {
        System.out.println(a.showX());
        System.out.println(a.showY());
    }//end movePiece
}//end Knight
