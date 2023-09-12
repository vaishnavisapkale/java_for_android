// return type   method_name(parameters){
//     task to perform
// }

// int add(int a, int b, int c){
//     int c = a+b+c;
//     return c;
// }

// NO return No parameter
// void showMessage(){
//     sop(msg);
// }


// No return with parameter

// void add(int a,int b){
//     sop(a+b);
// }

// return without parameter

// float getPi(){
//     return 3.14f;
// }

//return with parameter
// int add(int a, int b){
//     return a+b;
// }


public class Methods{

    int x = 15,y = 3,result;

    void multi(int a, int b){
        System.out.println(a*b);
    }

    void divide(){
       result = x/y;
        System.out.println(result);
    }
    public static void main(String[] args) {
         Methods obj = new Methods();
         obj.multi(4,5);
         obj.divide();
    }
}
