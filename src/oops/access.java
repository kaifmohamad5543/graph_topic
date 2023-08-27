package oops;
class hero{
   private int id;
   private String name;

   public void setName(String name){
       this.name=name;
   }
   public String getname(){
       return name;
   }
   public void setId(int id){
      this.id=id;
   }
   public int getId(){
       return id;
   }
}

public class access {
    public static void main(String[] args) {
        hero t1=new hero();
       t1.setName("kaif");
        System.out.println(t1.getname());
        t1.setId(12);
        System.out.println(t1.getId());

    }
}
