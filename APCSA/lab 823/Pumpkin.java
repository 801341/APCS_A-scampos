
/** 
 * Pumpkin is a class where you will give a pumpkin their id and their radius.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pumpkin
{
    // instance variables - replace the example below with your own
    private double rad;
    private int id;

    /**
     * Constructor for objects of class Pumpkin
     */
    public Pumpkin(double r, int id)
    {
        // initialise instance variables
        rad = r;
        this.id = id;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getRadius()
    {
        return rad;
    }
    public int getID()
    {
        return this.id;
    }
}
