package DATA_STRUCTURES.LINKED_LIST;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList s = new SinglyLinkedList();

        System.out.println("Enter the data:");
        int d = sc.nextInt();
        s.insertbegin(d);
        s.insertend(100);
        s.insertend(200);
        s.insertend(300);
        s.insertend(1400);
        s.insertspecific(2002, 2);

        // s.insertEnd(d);
        // s.insertSpecific(d);
        s.traversal(d);

    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class SinglyLinkedList {
        Node head = null;
        Node tail = null;

        void traversal(int data) {
            if (this.head == null) {
                System.out.println("The list is empty");
                return;
            }
            Node temp = this.head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }

        public void insertbegin(int data) {
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
                return;
            }
            new_node.next = head;
            head = new_node;

        }

        public void insertend(int data) {

            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
                tail = new_node;
                return;
            }

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = new_node;
            tail = new_node;
        }

        void insertspecific(int data, int pos) {
            if (head == null) {
                System.out.println("List is empty");
            }
            Node new_node = new Node(data);
            Node temp = head;
            if (pos == 1) {
                insertbegin(data);
            }
            for (int i = 1; i < pos - 1; i++) {
                if (temp == null) {
                    return;
                }
                temp = temp.next;
            }
            new_node.next = temp.next;
            temp.next = new_node;

        }

        void deleteend() {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        void deletebegin() {
            if (head == null) {
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }

            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }

        void deleteSpecific(int pos) {

            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            // Delete first node
            if (pos == 1) {
                head = head.next;

                if (head == null)
                    tail = null;

                return;
            }

            Node temp = head;

            // Move to (pos-1)th node
            for (int i = 1; i < pos - 1; i++) {

                if (temp == null || temp.next == null) {
                    System.out.println("Invalid Position");
                    return;
                }

                temp = temp.next;
            }

            if (temp.next == null) {
                System.out.println("Invalid Position");
                return;
            }

            // If deleting the last node
            if (temp.next == tail) {
                tail = temp;
            }

            temp.next = temp.next.next;
        }

    }
}
// 21
// 19
// 24
// 25
// 92
// 206
// 237
// 876
