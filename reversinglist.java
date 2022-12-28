public class reversinglist {

    Node head ;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newnode = new Node(data);
    
        newnode.next = head;
        head = newnode;
    }

    public void print(){
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void reverse(){

        if (head == null ||head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node lastNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = lastNode;

        }
        head.next    = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        reversinglist list = new reversinglist();

        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.reverse();
        list.print();
    }
}
