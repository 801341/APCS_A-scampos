
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
       
       for (int i = 0; i < studentList.size(); i++){
          if (studentList[i].get){
              studentList.remove(studentList.get(i));
            }
        } 
    }

    public void clearList()
    {
     for (int i = 0; i < studentList.size(); i++){
         studentList.set(studentList.get(i)) = null;
        } 
    }

    public void printList()
    {
        for (int i = 0; i < studentList.size(); i++){
            System.out.print(studentList.get(i));
        }
    }
}
