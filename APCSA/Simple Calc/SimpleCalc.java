
/**
 * Write a description of class SimpleCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCalc{
    public SimpleCalc()
    {

    }

    public double add(int x, int y){ 
        double h = x + y;
        return h;
    }
    public double subtract(int x, int y){
        double h = x - y;
        return h; 
    }
    public double multiply(int x, int y){
        double h = x * y;
        return h; 
    }
     public double divide(int x, int y){
        double h = x/y;
        return h; 
    }
     public int moduloDivide(int x, int y){
        if (y == 0){
            return 0;
        }
    }
    }
