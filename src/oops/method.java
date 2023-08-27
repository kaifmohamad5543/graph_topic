package oops;

import java.util.Scanner;

class square{
    int length;
    int height;
    public int perimeter(){
        int peri=4*(length);
        return peri;
    }
    public int area(){
        return length*length;
    }

}

public class method {
    public static void main(String[] args) {
        square t1=new square();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        t1.length=sc.nextInt();
        System.out.println(t1.perimeter());
        System.out.println(t1.area());


    }
}
