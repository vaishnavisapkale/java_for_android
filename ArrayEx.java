//we use array when we have fixed sized data
import java.util.*;
public class ArrayEx {
   static Scanner sc= new Scanner(System.in);
  public static void main(String args[]){
  int arr[] = new int[5];
 
  for(int i = 0; i < arr.length ; i++){
     System.out.println("please enter a value at index no. " + i);
     arr[i] = sc.nextInt();
   }

   System.out.println("values in array are :");
   for(int i = 0; i< arr.length ; i++){
    System.out.println(arr[i]);
   }
  }
   

}
