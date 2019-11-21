
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{

    private String fName;
    private String mName;
    private String lName;

    
    public Student(String fullName){

        parseUserInput(fullName);

    }
    
    public void parseUserInput(String input){
        

            // if(i.indexof(' ') != i.lastindexof(' ')){
                // fname = i.substring(i.indexof(' '));
                // mname = i.substring(i.indexof(' '),(i.lastindexof(' ')));
                // lname = i.substring(i.lastindexof(' '), (i.length + 1));
            // }
            // else if (i.indexof(',') != -1){
                // lname = i.substring(',');
                // fname = i.substring(i.indexof(' '), i.lastindexof(' '));
                // mname = i.substring(i.lastindexof(' '), (i.length + 1));
            // }
        
    }
    
    public String getFirstName(){//  getter for first anme
        return fName;
    }
    public String getLastname(){
        return lname;
    }
    public void setFirstName(String fn){//  getter for first anme
        fName = fn;
    }

}
