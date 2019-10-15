/**
 * Number 10
 *
 * @author (Stephanie)
 * @version (10/14/19)
 */
public class pumpkin
{
    private int num;
    public pumpkin(int x)
    {
        num = x;
    }
    public static int digitsSum(int[] num)
    {
    int i = 0;
    int sum = 0;
    while(i < num.length){
        sum += num[i];
        i++;
    }
    return sum;
    }
}
