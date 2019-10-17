
/**
 * Write a description of class TestCorrections1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestCorrections1
{
    // instance variables - replace the example below with your own
    private int x;
    private int sum;
    public TestCorrections1()
    {
        sampleMethod();
    }

    public void sampleMethod()
    {
        //#3
        int y = (int)(Math.random()*11) + 10;
        System.out.print(y);

        //11 = how many numbers there are and 10 = where is starts
        //#4
        int num = 4;
        if (num/3 <= 1){
            System.out.print("true");
        }
        System.out.println("false");
        //will return truefalse because num/3 will get truncated

        //#9
        for(int i = 0; i < 4; i++){

        }
        //will return 

    }

    public void digitsSum(int num){
        while (num%10 =! 0){
            sum = sum + num%10;
            num = num/10;
        }
    }
        public static void main(){
            TestCorrections1 Tc1 = new TestCorrections1();
        }
    }
}
