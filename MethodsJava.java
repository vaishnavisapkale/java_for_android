import java.util.*;
public class MethodsJava {

    Scanner sc  = new Scanner(System.in);
    int num = sc.nextInt();

    void findEvenOdd(int num){
         if(num%2 == 0){
            System.out.println("NUmber is Even");
         }else{
             System.out.println("NUmber is Odd");
         }
    }
    public static void main(String[] args) {
        
        MethodsJava obj = new MethodsJava();
        obj.findEvenOdd(obj.num);
    }
}
