import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add elements
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);

        //set elements
        list.set(1, 19);
        System.out.println(list);
    
        //get elements
       int var =  list.get(3);
       System.out.println(var);

       //remove elements
       list.remove(2);
       System.out.println(list);

        int size = list.size();
         System.out.println(size);
        


    } 
}


