public class Constructor {
    int id;
    String Name;

    Constructor(){
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {
       Constructor obj = new Constructor(); 
    }
}
