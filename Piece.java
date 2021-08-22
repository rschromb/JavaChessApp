public abstract class Piece 
{
    private boolean taken = false;
    private boolean white = false;

    //Abstract methods for pieces to override
    abstract String showPiece();
    abstract void movePiece(Square a);

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
