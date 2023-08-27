package oops;

class kaif{
    String name;
    int id;
    public void print(){
        System.out.println("the name is:" +name);
        System.out.println("the id is :"+id);
    }
}

public class topic1 {
    public static void main(String[] args) {
        kaif t1=new kaif();
        t1.name="kaif";
        t1.id=12;
        t1.print();
        System.out.println("this is asecond details");
        kaif t2=new kaif();
        t2.name="zero";
        t2.id=34;
        t2.print();

    }
}
