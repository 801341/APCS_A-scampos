import java.until.*;
public class StringChecker
{
    String input = "";
    
    public static void main(){
        System.out.print("Enter words to add to your list of words. Type 'quit' to leave");
    }
    public ArrayList<Sting> wordChecker(String[] str, String key){
        ArrayList<Sting> words = new ArrayList<Sting>();
        for (int i = 0; i < str.length; i++){
            if (str[i].indexOf(key) >= 0){
                words.add(str[i]);
            }
        }
        return words;
    }
    public String[] wordChecker(ArrayList<Sting> str, String Key){
        String[] words = new String[] {};
        for (int i = 0; i < str.size(); i++){
          if (str.get[i].indexOf(key) >= 0){
             words.get(str[i]);
            }
        }
        return words;
    }
}
