/**
 * Write a description of class Student here.
 *
 * @author (Stephanie)
 * @version (11/24/19)
 */
public class Student
{
    private String fName;
    private String mName;
    private String lName;
    private int num;
    public Student(String fullName){

        parseUserInput(fullName);

    }
    
    public void parseUserInput(String input){
             //"Last, First Middle
             if(input.indexOf(' ') != input.lastIndexOf(' ')){
                fName = input.substring((input.indexOf(' ') + 1), (input.lastIndexOf(' ')));
                mName = input.substring(input.lastIndexOf(' '), input.indexOf(input.length() + 1));
                lName = input.substring((0), (input.indexOf(',')));
            }
    }
    
    public String getFirstName(){//  getter for first name
        return fName;
    }
     public String getLastname(){
         return lName;
     }
    public void setFirstName(String fn){//  getter for first anme
        fName = fn;
    }
    
    
    public int getstudentNum(){//  getter for first name
        return num;
    }
    
    public void setstudentNum(int num){//  getter for first name
        int n = num;
    }
}
