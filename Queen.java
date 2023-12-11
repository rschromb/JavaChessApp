public class Queen extends Piece {
    public Queen (ColorType color)
    {
        super(color, PieceType.QUEEN);
    }
    
    @Override
    public String showPiece()
    {
        return "Queen";
    }

    public void movePiece(Square a) {
        System.out.println(a.showX());
        System.out.println(a.showY());
    }//end movePiece
}//end Queen
