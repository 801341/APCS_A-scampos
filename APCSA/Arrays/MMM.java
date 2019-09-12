
/**
 * Write a description of class MMM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MMM
{
    
    int[] num = new int[100]; 
    public void loadArray()
    {
        for(int i = 0; i < num.length; i++){     //  length 10
            num[i] = (int)(Math.random()*10) + 1;  //  last index = 9
        }
    }
    public void printArray()
    {
     for(int i =0; i < num.length; i++){     
            System.out.print(num[i]);
            
        }
    }
    public int getSum()
    {
        int sum = 0;
        for(int i =0; i < num.length; i++){     
           sum += num[i];
        }
        return int sum;
    }
    public double getMean()
    {
        
    }
    public double getMedian()
    {

    }
}
