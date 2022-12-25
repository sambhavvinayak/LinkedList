import java.util.Scanner;

public class LL3 {
    Node head;
    private int size;

    LL3(){
        size =0;
    }                           //           /\
    class Node{                             //\\
        int data;                          //  \\
        Node next;                        //    \\  
        Node(int data){                  //======\\
            this.data=data;             //  node  \\
            this.next=null;            //          \\
            size++;


        }
    }

    public void addFirst(int data){
        Node newnode =new Node(data);
        if (head == null) {
            head=newnode;
            return;
        }
        head.next=newnode;
    }
    public void add(int data){
        Node newNode = new Node(data);

        if (head== null) {
            head = newNode;
            return;
        }
        Node lastnode  = head;
        while(lastnode.next != null){
            lastnode = lastnode.next;
        }
        lastnode.next = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);

        if (head== null) {
            head = newNode;
            return;
        }
        Node lastnode  = head;
        while(lastnode.next != null){
            lastnode = lastnode.next;
        }
        lastnode.next = newNode;
    }

    public int get(int index){
        if (head == null) {
            return 0;
        }
        
        int count = 0;
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
            count++;
            if (index == count) {
                return currNode.data;
            }
        }
        return index;
    }
    public void printList(){
        if (head==null) {
            return;
        }
        Node currNode = head;

        while (currNode!=null) {
        System.out.print(currNode.data+"-->");
        currNode = currNode.next;
        }
        System.out.print("null");
    }
    public void removeLast(){

    }
    public void size(){
        System.out.println(size);
    }

    public static void main(String[] args) {
        LL3 list = new LL3();
        Scanner input = new Scanner(System.in);

        list.add(43);//1
        list.add(423);//2
        list.add(86);//3
        list.add(64);//4
        list.add(555);//5
        list.add(77);//6
        list.add(132);//7

        // list.printList();

        System.out.println();

        // list.get(3);

        System.out.println();


        // search in linkedlist

        // list.size();
        System.out.print("Search your number : ");
        int num = input.nextInt();

        for (int i = 0; i<=list.size; i++) {
            
            int a = list.get(i);
            if (num== a) {
                System.out.println(num+" At the index of "+(i+1));
                return;
            }
        }
                System.out.println("This number is not available in your list .");
                /*
                 * in this i got one bug that is if i write the fist number of linkedlist which i make 
                 * and search it then i recognise whole number except fist number of list .
                 * so it is also incomplete for future i make it correct.
                 */
    }
}
