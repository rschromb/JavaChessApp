public abstract class Piece 
{
    private boolean taken = false;
    private boolean white = false;
    //location - for later

    public Piece(boolean white)
    {
        if(white == true)
        setWhite(this.white);
    }

    public boolean checkWhite(boolean white)
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
