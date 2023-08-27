package oops;
class kaif1{
    public void meth1(){
        System.out.println("this is a method of the system");
    }


}
class kaif2 extends kaif1{
    public void meth1(){
        System.out.println("this is method overring");

    }
}

public class overrring {
    public static void main(String[] args) {
        kaif2 t1=new kaif2();
        t1.meth1();

    }
}
