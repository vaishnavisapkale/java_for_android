public class Encapsulation {
    private String username;
    private String email;

    public void setUsername(String uname){
        this.username = uname;
    }
    public String getUsername(){
        return this.username;
    }

    public static void main(String args[]){
      Encapsulation obj = new Encapsulation();
      obj.setUsername("vaishnavi");
      System.out.println(obj.getUsername());
    }
}
