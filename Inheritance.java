class Bank{ //parent class
    
    public void AccountDetails(){
         System.out.println("Account holder details");
    }
}
class HomeLoan {  //parent
        public void AccountDetails(){
         System.out.println("Account holder details");
    }  
} 
class PersonalLoan extends HomeLoan {  //child
   
} 


public class Inheritance {
    
   public static void main(String args[]){
     PersonalLoan obj = new PersonalLoan();
     obj.AccountDetails();
    
   }

}





