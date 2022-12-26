/*
 * find the middle of linked list node
 */

public class middleLinkedList {
    Node head;
    int size = 0;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    /*
     * normal linked list not 
     */

    public void add(int data){
        Node newnode = new Node(data);
        newnode.next=head;
        head = newnode;
    } 

    public void print(){
        
        Node currNode = head;
        while(currNode !=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }
    public int size(){
        return size;
    }

    public void middleNode(){

        
        int count = size()/2;
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            count--;
            if (count ==0) {
                System.out.println("Middle number of this node is : "+currNode.data);
            }
        }
    }


    public static void main(String[] args) {
        middleLinkedList list = new middleLinkedList();
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(254);
        list.add(262);
        list.add(297);
        list.print();
        System.out.println();
        list.middleNode();
        

    }
}
