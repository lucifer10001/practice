public class LinkedList {
    Node head;
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public void add(int data){

        Node n=new Node(data);
        if(isEmpty()){
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }

    private boolean isEmpty() {
        if(head==null)
            return true;
        return false;
    }

    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        obj.add(5);
        obj.add(6);
        obj.display();
    }
}
