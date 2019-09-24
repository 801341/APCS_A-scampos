
/**
 * Scanner tester
 *
 * @author (Stephanie)
 * @version (924)
 */

import java.util.Scanner;
public class ScannerTest{
    
    
    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";
        //  if(str1 == str2)
        while(!inputStr.equals("quit")){
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            System.out.println(inputStr);
        }
        int count = 0; 
        int io = inputStr.indexOf(" ");
        //scannerTest str = new inputStr.substring(io + 1);
           if (inputStr.indexOf(",  ") == -1){
            for (int i = 0; i <=inputStr.length(); i++){
                if (inputStr.substring(i) == " "){ 
                    count++;
                }
            }
            if (count == 2){
                //Format Three == 
            }
            
        }
        
  }
}
