
/**
 * Write a description of class StudListRunner here.
 *
 * @author (Stephanie)
 * @version (11/8/2019)
 */

import java.util.*;
public class StudListRunner
{
    private StudList Stud = new StudList();
    
    
    public StudListRunner(){
        menuNumber();
    }
    
    
    //  Allow the user to choose a menu number
    public void menuNumber(){
        Scanner kb = new Scanner(System.in);
        String userIn = "";
        
        while(!userIn.equals("quit")){
        System.out.println("Please choose a menu item\n");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Print Student records");
        System.out.println("4. Search for student");
        System.out.println("5. Delete Student");
        
       }
        
     }
    
    public static void main(){
        StudListRunner slr = new StudListRunner();
    }
}
