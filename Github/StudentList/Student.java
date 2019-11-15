
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        x = 0;
    }

    public static void parseUserInput(string input, student<Student> student){
        for (int i = 0;i < StudentList.length(); i++){
    
        if(i.indexof(' ') != i.lastindexof(' ')){
             fname = i.substring(i.indexof(' '));
             mname = i.substring(i.indexof(' '),(i.lastindexof(' ')));
             lname = i.substring(i.lastindexof(' '), (i.length + 1));
           }
        else if (i.indexof(',') != -1){
            lname = i.substring(',');
            fname = i.substring(i.indexof(' '), i.lastindexof(' '));
            mname = i.substring(i.lastindexof(' '), (i.length + 1));
        }
    }
}
