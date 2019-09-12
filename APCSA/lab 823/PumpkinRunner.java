
/**
 * Write a description of class PumkinRunner here.
 * Another class to run Pumpkin
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PumpkinRunner
{
   
    /**
     * Constructor for objects of class PumkinRunner
     */
    public PumpkinRunner()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main()
    {
        Pumpkin p1 = new Pumpkin(3.4, 12);
        Pumpkin p2 = new Pumpkin(7.6,13);
        System.out.println(p2.getRadius());
        System.out.println(p2.getID());
    }
}
