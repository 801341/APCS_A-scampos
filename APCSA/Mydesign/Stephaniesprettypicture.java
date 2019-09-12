
/**
 * Write a description of class Stephaniesprettypicture here.
 *
 * @author (Stephanie Campos)
 * @version (08/29/19)
 */
import java.awt.*;
public class Stephaniesprettypicture
{
    // instance variables - replace the example below with your own
    
    public static void main()
    {
      Turtle Stephanie;
      int size,  turn;
      Stephanie = new Turtle(Turtle.NO_DEFAULT_WINDOW); 
      TurtleDrawingWindow window = new TurtleDrawingWindow();
      window.add(Stephanie);
      window.setVisible(true);
      size      = 100;
      turn      = 60;
      Stephanie.penColor(Color.magenta);
      Stephanie.penSize(2);
      Stephanie.jumpTo(-250,0);
         for(int i = 0; i < 120; i++){
            Stephanie.move( size ); 
           Stephanie.turn( turn );
           String n = ""+i;
            //t.print(n);
       }
       Stephanie.jumpTo(-200, 50);
       Stephanie.heading(0);
       size     = 150;
       Stephanie.penColor(Color.blue);
       for(int i = 0; i < 120; i++){
           Stephanie.move( size ); 
           Stephanie.turn( turn );
           String n = ""+i;
           //t.print(n);
       }
       Stephanie.jumpTo(-150, 100);
       Stephanie.heading(0);
       size     = 200;
       Stephanie.penColor(Color.green);
       for(int i = 0; i < 120; i++){
           Stephanie.move( size ); 
           Stephanie.turn( turn );
           String n = ""+i;
           //t.print(n);
       }      
       Stephanie.jumpTo(-150, 100);
       Stephanie.heading(0);
       size     = 200;
       Stephanie.penColor(Color.yellow);
       for(int i = 0; i < 120; i++){
           Stephanie.move( size ); 
           Stephanie.turn( turn );
           String n = ""+i;
           //t.print(n);
       }      
       Stephanie.jumpTo(-100, 100);
       Stephanie.heading(0);
       size     = 150;
       Stephanie.penColor(Color.orange);
       for(int i = 0; i < 120; i++){
           Stephanie.move( size ); 
           Stephanie.turn( turn );
           String n = ""+i;
           //t.print(n);
       }    
       Stephanie.jumpTo(-50, 50);
       Stephanie.heading(0);
       size     = 100;
       Stephanie.penColor(Color.red);
       for(int i = 0; i < 120; i++){
           Stephanie.move( size ); 
           Stephanie.turn( turn );
           String n = ""+i;
           //t.print(n);
       }      
    }
}
