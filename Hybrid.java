class Father {
 public void disp() {
       System.out.println("This is the father class");
   }
}
class Son extends Father {
   public void disp() {
       System.out.println("The Son class extends the Father Class");
   }
}
class Daughter extends Father {
   public void disp() {
       System.out.println("The Daughter class extends the Father Class");
   }
}
public class Hybrid extends Daughter {
   public void disp() {
       System.out.println("Method defined inside the Hybrid class");
   }
   public static void main(String args[]) {
      Hybrid obj = new Hybrid();
       System.out.println("Example of Hybrid Inheritance using Hierarchical and Single Inheritance");
       obj.disp();
 


   }
}
