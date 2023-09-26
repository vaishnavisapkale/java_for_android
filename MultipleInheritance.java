interface car{
    void name();
    void number();
}

interface bike{
    void name();
    void number();
}
class child implements car, bike{
    public void name(){
        System.out.println("name");
    }
    public  void number(){
      System.out.println("number");
   }
}

public class MultipleInheritance {
    public static void main(String args[]){
    child obj = new child();
     obj.name();
     obj.number();
    }
}
