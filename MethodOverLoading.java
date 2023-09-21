import java.lang.reflect.Method;

public class MethodOverLoading {
    
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String args[]){
       MethodOverLoading obj  = new MethodOverLoading();
       System.out.println(obj.add(5,2));
        System.out.println(obj.add(5,6,2));
       
       

    }
}


// OOPS

// INheritance
// Polymorphism 
// Encapsulation
// Abstraction


//Inheritance
// Animal => Parent class = > display(){This is my animal}
// Dog => child class
// Dog extends Animal {

// } 
// Cat = > child class 
// horse => child class