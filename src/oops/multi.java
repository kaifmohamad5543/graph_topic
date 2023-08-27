package oops;
class base1{
    base1(){
        System.out.println("i am a first constructor from");
    }
    base1(int a){
        System.out.println("this is a overload constructor from the a is "+a);
    }
}
class derived1 extends base1{
    derived1(){
        System.out.println("this is a second constructor");
    }
    derived1(int a,int b){
        super(a);
        System.out.println("this is a second number is :"+b);
    }

}
class derived2 extends derived1{
    derived2(int a,int b,int c){
        super(a,b);
        System.out.println("this is a third value is :"+c);
    }
}

public class multi {
    public static void main(String[] args) {
        derived2 t1=new derived2(10,20,30);


    }
}
