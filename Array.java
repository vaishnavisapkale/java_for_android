//Every Array in Java is an Object
public class Array {
 
    public static void main(String args[]){
      int[] arr = new int[5];
   arr[0] = 15;
   arr[1] = 12;
   arr[2] = 14;
   arr[3] = 15;
   arr[4] = 16;
   for(int i = 0 ; i<arr.length ; i++ ){
       System.out.println(arr[i]);
   }
     
}
}
