public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(8);
        System.out.println(list.find(10));
        System.out.println(list.find(2));
        list.displayList();

    }
}
class Node {
   int data;
   Node next;
    public Node(int data) {
        this.data = data;
        next = null;
    }

    public void displayLink()      // display ourself
    {
        System.out.print("{" + data + ", " + data + "} ");
    }
}
class LinkedList{
    public Node first;

    public LinkedList() {
        this.first = null;
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = first;
        first = node;
    }
    public Node deleteFirst(){
         Node delete = first;
         first  = first.next;
         return delete;
    }
    public boolean find(int key){
        Node curr = first;
        while (curr !=null){
            if(curr.data == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Node current = first;       // start at beginning of list
        while(current != null)      // until end of list,
        {
            current.displayLink();   // print data
            current = current.next;  // move to next link
        }
        System.out.println("tt");
    }
}