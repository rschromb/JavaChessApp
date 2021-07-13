package JavaChessApp;

public abstract class Piece 
{
    private boolean taken = false;
    private boolean white = false;

    //Abstract method, currently returning a String, for instantiated Pieces to display their location on the Board.
    abstract String showPiece();

    //Constructor includes boolean so pieces can be declared to the correct color upon initialization.
    public Piece(boolean white)
    {
        if(white == true)
        setWhite(this.white);
    }

    //Returns String to show color of Piece.
    public String showColor(boolean white)
    {
        if(white == true)
        return "W";
        else
        return "B";
    }

    public boolean checkWhite()
    {
        return this.white;
    }

    public boolean checkDead(boolean taken)
    {
        return this.taken;
    }

    public void setWhite(boolean white)
    {
        this.white = true;
    }

    public void setDead(boolean taken)
    {
        this.taken = true;
    }

}
