public class Chess {
    public static void main(String[] args) throws Exception {
        //System.out.println("This is my chess program!");
        Board chessGame = new Board();

        chessGame.showBlackView();
        System.out.println();
        chessGame.showWhiteView();
    }
}
