class main{
      private int age;
    private String name;
    void setAge(int Age){
        this.age = Age;
    }
   public int getAge(){
        return this.age;
    }
}
public class GetterSetter extends main {
    public static void main(String args[]){
      main  obj = new main(); 
  
      obj.setAge(12);   
      System.out.println( obj.getAge());
    }
}
