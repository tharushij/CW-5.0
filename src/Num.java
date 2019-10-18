public class Num
{
    private int value;

    //set up num obj and store initial value
    public Num(int update)
    {
        value = update;
    }

    //return stored int value
    public int getValue ()
    {
        return value;
    }

    //set store val to newly specified value
    public void setValue (int update)
    {
        value = update;
    }

    //return stored int val as string
    public String toString ()
    {
        return value + "";
    }
} //end class Num