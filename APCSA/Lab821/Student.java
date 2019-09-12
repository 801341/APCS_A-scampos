
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String stuName;
    private int stuNumber;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int num){
        stuName = name;
        stuNumber = num;
    }

    
    public String getName(){
       return stuName;
    }
    public int getNumber(){
        return stuNumber;
    }
}
