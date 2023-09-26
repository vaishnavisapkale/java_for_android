//Abstraction using Abstract Class
abstract class car{

    abstract void carname();

    void name(){
        System.out.println("hii");
    }
}
class Abstraction extends car {

   void carname(){
     System.out.println("Mustang");
   } 
   void name(){
System.out.println("hey");

   }
    public static void main(String args[]){
       Abstraction obj = new Abstraction();
      obj.name();
      obj.carname();
    }
}
