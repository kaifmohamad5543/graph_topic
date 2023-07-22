public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }


    class Node{
       Node head;
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
//    add first
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
    }
//    add last
    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("list is empyt");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.println("NULL");

    }
    public void reverser(){
        if(head==null || head.next==null){
            return;
        }
        Node prev=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
         currNode.next=prev;
//         update
            prev=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prev;
    }
//    delete the firts
    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        size--;
        head=head.next;
    }
//    delete the last
    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        if(lastNode.next!=null){
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL t1=new LL();
        t1.addfirst("this");
        t1.addfirst("is");
        t1.addfirst("a");
        t1.addfirst("linkedlist");
        t1.printlist();

        t1.addlast("chutiya");
        t1.printlist();

        t1.deletefirst();
        t1.printlist();
    
        t1.deletelast();
        t1.printlist();
        System.out.println(t1.getSize());
        t1.reverser();
        t1.printlist();

    }
}
