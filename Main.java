class Main{
    public static void main(String[] args){
        LinkedList doublyLinkedList = new LinkedList();
        doublyLinkedList.insertEnd(2);
        doublyLinkedList.insertEnd(4);
        doublyLinkedList.insertEnd(6);
        doublyLinkedList.insertEnd(10);
        doublyLinkedList.insertAtPosition(8,2);

        System.out.println(doublyLinkedList);
        System.out.println(doublyLinkedList.length());
    }
}