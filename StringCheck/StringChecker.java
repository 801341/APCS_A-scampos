import java.util.*;
public class StringChecker
{
    private String[] wordArray = {"cat", "catepillar", "catcher", "dog"};
    private ArrayList<String> WordList = new ArrayList<String>();   
    public StringChecker(){
        Scanner sc = new Scanner(System.in);
        String inputStr = "";
        ArrayList<String> keyList = wordChecker(wordArray, "cat");
        printList(keyList);
        System.out.print("\n");
        printList(wordArray);
    }
    public static void loadArray(ArrayList<String> str){
        str.add("cat");
        str.add("catepillar");
        str.add("catcher");
        str.add("dog");
    }
    public static void printList(ArrayList<String> str){
        for (int i = 0; i < str.size(); i++){
            System.out.println(str.get(i));
        }
    }
    public static void printList(String[] str){
        for (int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
<<<<<<< HEAD
    public ArrayList<String> wordChecker(String[] str, String key){
=======
    public ArrayList<String> wordChecker(String[] str, String key){        
>>>>>>> 18e74e94ec1cf22850ad470df9636f0ac06b992b
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < str.length; i++){
            if (str[i].indexOf(key) >= 0){
                temp.add(str[i]);
            }
        }
        return temp;
    }
    public String[] wordChecker(ArrayList<String> str, String key){
        String[] words = new String[] {};
        for (int i = 0; i < str.size(); i++){
          if (str.get(i).indexOf(key) >= 0){
             words[i] = (str.get(i));
            }
        }
        return words;
    }
<<<<<<< HEAD
    public static void main(){
       StringChecker sc = new StringChecker();
    }
=======
      public static void main(){
      printList(keyList); 
    } 
>>>>>>> 18e74e94ec1cf22850ad470df9636f0ac06b992b
}

