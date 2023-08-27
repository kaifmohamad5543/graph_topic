package oops;
class base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am setting the value of the x ");
        this.x=x;
    }
    public void print(){
        System.out.println("this is a first method of the season");
    }
}
class derived  extends base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("i am setting the value of y is");
        this.y=y;
    }
    public void print(){
        System.out.println("this is a method 2nd");
    }
}

public class single {
    public static void main(String[] args) {
        derived t1=new derived();
        t1.setX(10);
        t1.setY(20);
        System.out.println(t1.getX());
        System.out.println(t1.getY());
        t1.print();

    }
}
