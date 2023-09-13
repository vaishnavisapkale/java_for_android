public class Constructor {
    int id;
    String Name;
    String surname;

    Constructor(){
         System.out.println("Default Constructor is called ");
    }

    Constructor(int ID, String  name){
        id = ID;
        Name = name;

        System.out.println("Constructor is called " + ID + " " + name);
    }
     Constructor(int ID, String  name, String Surname){
        id = ID;
        Name = name;
        surname = Surname;

        System.out.println("Constructor is called " + ID + " " + name + " " + surname);
    }

    public static void main(String[] args) {
       Constructor obj = new Constructor(5, "Vaishnavi", "Sapkale");
       Constructor obj2  = new Constructor(6, "Vaish");
        Constructor obj3  = new Constructor();

     
    }
}


