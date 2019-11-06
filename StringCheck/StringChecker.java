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
    public ArrayList<String> wordChecker(String[] str, String key){
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
    public static void main(){
       StringChecker sc = new StringChecker();
    }
}

