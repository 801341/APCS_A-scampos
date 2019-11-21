
/**
 * Write a description of class StudList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StudList
{
    ArrayList<Student> studentList;
   
    private int stuNumber;
    private double gpa;
    public StudList(){
        studentList = new ArrayList<Student>();
    }

    public void addStudent(Student s){
        studentList.add(s);

    }

    public void deleteStudent(String LastName)
    {
      for (int i = 0; i < studentList.size(); i++){
          if (studentList.remove(studentList.get(i))){
            }
        }
    }

    public void deleteStudent(int stuNumber)
    {

    }

    public void clearList()
    {

    }

    public void printList()
    {

    }
}
