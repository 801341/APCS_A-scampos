import java.util.*;
/**
 * Write a description of class quiz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class quiz
{
    public ArrayList<Integer> makeArrayList(int[] nums)
    {
     ArrayList<Integer> newArrayList = new ArrayList<Integer> ();
     for (int i = 0; i < nums.length; i++){
        newArrayList.add(nums[i]);
      }
     return newArrayList; 
      }
      
    public int[] makeArray(ArrayList<Integer> nums){
      int [] newArray = new int[nums.size()] ;
      for (int i = 0; i < nums.size(); i++){
        newArray[i] = nums.get(i);
       }
      return newArray;
      }
}
