
/**
 * Write a description of class ShapeRunner here.
 *
 * Stephanie Campos
 * 08/27/19
 */
public class ShapeRunner
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ShapeRunner
     */
    public ShapeRunner()
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
        ShapeWorld shapeWorld = new ShapeWorld(600, 500);
        
        APCSCircle circle = new APCSCircle(400, 300, 200);
        shapeWorld.addCircle(circle);
        
        APCSRectangle rectangle = new APCSRectangle(200, 300, 200, 250);
        shapeWorld.addRectangle(rectangle);
        
        APCSColor purple = new APCSColor(1, 0, 1);
        
        APCSLine line = new APCSLine(200, 300, 400, 100);
        shapeWorld.addLine(line);
    }
}
