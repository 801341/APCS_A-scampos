/**
 * Write a description of class TestCorrections here.
 *
 * @author (Stephanie)
 * @version (10/14/19)
 */
public class TestCorrections
{
  
 public TestCorrections()
   {
        
   }
  public void sampleMethod()
  {
   //#3
   int y = (int)(Math.random()*11) + 10;
   //11 = how many numbers there are and 10 = where is starts
   
   //#4
   int num = 4;
   if (num/3 <= 1){
       System.out.print("true");
    }
   System.out.println("false");
   //will return truefalse because num/3 will get truncated.
   
   //#9
   for(int i = 0; i < 4; i++){
       for(int j = 0; j <= i; j++){
           System.out.print("X ");
        }
       System.out.println();
    }
   //will return 
   
}
}
