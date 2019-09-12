
/**
 * Write a description of class FirstClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstClass
{
    private static int x;
    public FirstClass()
    {
    }
    public static void main(){
        printname("tom", x);
        x = 7;
    }
    public static void printname(String name){
        System.out.print("Hello," + name, x);
    }
    
}
