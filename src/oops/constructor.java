package oops;
class jero {
    String name;
    int id;

    public jero(String name, int id) {
        name=name;
        id=id;

    }
    public void print(){
        System.out.println("the name is :"+name);
        System.out.println("the id is :"+id);
    }
}

public class constructor {
    public static void main(String[] args) {
        jero t1=new jero("kaif",10);

        jero t2=new jero("chutiya",20);
        t2.print();
        ;

    }
}
