// Method Overloading 

// same name 
// Can Change the parameters 

// public int Add(int a, int b){
//   return a+b;
// }
// public  int Add(int a, int b, int c){
//  return a+b+c
// }


//Method Overriding 

//create same name method in child class
//Return Type
//Name
//parameters 
//should be same

//Runtime
 class Parents{
    public  void primaryEducation(){
        System.out.println("1 to 12");
    }
    public void higherEdu(){
        System.out.println("doctor");
    }
}

class child extends Parents {
    public void higherEdu(){
        System.out.println("Engineering");
    }
}
class Polymorphism{
    public static void main(String args[]){
        child obj  = new child();
        obj.primaryEducation();
        obj.higherEdu();
    }
}