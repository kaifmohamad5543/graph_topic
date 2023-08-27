package oops;
class phone{
    public void ring(){
        System.out.println("ringing");
    }
    public void vibrate(){
        System.out.println("vibrating");
    }
    public void silent(){
        System.out.println("silenting");
    }
    public void airoplane(){
        System.out.println("aeroplabe");
    }
}

public class topic2 {
    public static void main(String[] args) {
        phone t1=new phone();
        System.out.println("this is a method1");
        t1.ring();
        t1.vibrate();
        t1.silent();
        System.out.println("this is a method");
        t1.airoplane();

    }
}
