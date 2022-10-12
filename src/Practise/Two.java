package Practise;

public class Two {
    public static void main(String[] args) {
        Two two = new Two();
        two.insertData(10);
        two.insertData(20);
        two.printData();
    }

    Node head = null;

    public void insertData(int data) {
        Node node = new Node(data);
        if (head == null)
            head = node;
        else {
            Node temp = head;
            while (temp.next !=null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public void printData () {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("X");
    }
}
class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}
