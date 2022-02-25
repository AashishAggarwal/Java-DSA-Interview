package Linked_List;

public class ListDemo {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.printList();
        for (int i = 1; i <= 10; i++) {
            sll.insertAtHead(i);
            sll.printList();
        }
        sll.insertAtEnd(11);
        sll.printList();

        if(sll.searchNode(3)) {   // Calling search function
            System.out.println("Value: 3 is Found");
        }
        else {
            System.out.println("Value: 3 is not Found");
        }

        if(sll.searchNode(15)) {   // Calling search function
            System.out.println("Value: 15 is Found");
        }
        else {
            System.out.println("Value: 15 is not Found");
        }
        System.out.println("After deleting 9 from List: ");
        sll.deleteByValue(9);
        sll.printList();
        System.out.println("After deleting 1 from List: ");
        sll.deleteByValue(1);
        sll.printList();
        System.out.println("After deleting 21 from List: ");
        sll.deleteByValue(21);
        sll.printList(); // list remains unchanged as there is no element 21 in the list
        System.out.println(sll.size);
    
    }

    
}
