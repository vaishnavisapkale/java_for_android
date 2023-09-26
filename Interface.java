interface car {
    void number();
   
}
interface bike{
    void name();
}

class Interface implements car, bike{
   public void number(){
        System.out.println("1234");
    }
    public void name(){
         System.out.println("Activa");
    }
} 
