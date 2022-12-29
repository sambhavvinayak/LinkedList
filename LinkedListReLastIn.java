/**
 * LinkedListReLastIn
 */
public class LinkedListReLastIn {
    Node head;
    int size = 0;
    class Node {
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(int data){
        Node newnode = new Node(data);
        if (head==null) {
            head = newnode;
            return;
        }
        head.next = newnode;
    }   
    public void add(int data){
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;    
        }

        Node currNode = head;
        while(currNode.next!= null){
            currNode = currNode.next;
        }
        currNode.next = newnode;

    }
    public void print(){

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void size(){
        System.out.print(size);
    }

    public void lastNodecount(){
        int n = 2 ;
        Node currNode = head;
        int lastsize = size-n;
        int i = 1;
        while (i< lastsize) {
            currNode = currNode.next;
            i++;
        }
        currNode.next = currNode.next.next;

    }

    public static void main(String[] args) {
        LinkedListReLastIn list = new LinkedListReLastIn();

        list.addFirst(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.size();
        System.out.println();
        list.print();
        list.lastNodecount();
        System.out.println();
        list.print();

    }
}
