public class LinkedList {
    int length;
    Node head;
    Node tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void traverseBackwards(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.print("START");
    }

    public void insertStart(int data){
        Node current = new Node(data);
        if(head == null){
            head = current;
            tail = current;
        } else {
            current.next = head;
            head.prev = current;
            head = current;
        }
        length++;
    }

    public void insertEnd(int data){
        Node current = new Node(data);
        if(head == null){
            head = current;
            tail = current;
        } else {
            tail.next = current;
            current.next = null;
            current.prev = tail;
            tail = current;
        }
        length++;
    }

    public void insertAtPosition(int data, int position){
        Node current = new Node(data);
        int index = 1;

        if(position == 1){
            insertStart(data);
        } else if (position > length){
            insertEnd(data);
        } else {
            Node currPosition = head;
            while(index < position){
                currPosition = currPosition.next;
                index++;
            }
            current.next = currPosition;
            current.prev = currPosition.prev;
            currPosition.prev.next = current;
            currPosition.prev = current;
        }
    }

    public String toString(){
        String str = "";
        Node current = head;
        while(current != null){
            str += current.data + " -> ";
            current = current.next;
        }

        str += "END";
        return str;
    }
}
