package Practise;

public class Three<T> {

    Node<T> head = null;

    public void insertData (T data) {
        Node<T> node = new Node<>(data);

        if (head == null) {
            head = node;
        } else {
            Node<T> temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printData () {
        Node<T> temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) {
        Three<Integer> three = new Three<>();
        three.insertData(10);
        three.insertData(20);
        three.printData();
    }

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}