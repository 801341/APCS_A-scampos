
/**
 * Write a description of class GridTester here.
 *
 * @author (Stephanie)
 * @version (11/18/19)
 */
public class GridTester
{
    public GridTester()
    {

    }

    public static void loadArray(){
        int[][] array = new int[10][10];
        for( int i = 0;i < array.length; i++){
            for(int c = 0; c < array[i].length; c++)
            {
                array[i][c] = (int) Math.random() * 100 + 1;
            }
        }        
    }

    public static void sumAll(){
        int[][] array = new int[10][10];
        int count = 0;
        for( int i = 0;i < array.length; i++){
            for(int c = 0; c < array[i].length; c++)
            {
                count = c + count;  
            }
        }
    }

    public static void findGreatest(){
        int[][] array = new int[10][10];
        int max = 0;
        for( int i = 0;i < array.length; i++){
            for(int c = 0; c < array[i].length; c++)
            {
                if (max < c){
                    max = c;
                }
            }
        }
    }
    public static void numberofGreatest(){
        int[][] array = new int[10][10];
        int max = 0;
        int count = 0;
        for( int i = 0;i < array.length; i++){
            for(int c = 0; c < array[i].length; c++)
            {
                if (max < c){
                    max = c;
                }
            }
        }
        
        for( int i = 0;i < array.length; i++){
            for(int c = 0; c < array[i].length; c++)
            {
                if (c == max){
                    count = count + 1; 
                }
            }
        }
        
    }
    public static void findAvg(){
        int[][] array = new int[10][10];
        int count = 0;
        for( int i = 0;i < array.length; i++){
            for(int c = 0; c < array[i].length; c++)
            {
                count = c + count;  
            }
        }
        int average = count/array.length;
    }
}
