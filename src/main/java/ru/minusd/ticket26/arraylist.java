package ru.minusd.ticket26;
public class arraylist<T>{

    Node head;
    class Node {

        T data;
        Node next;
        Node(T d)
        {
            data = d;
            next = null;
        }
    }

    // вставка нового элемента
    public void add(T data) {
        Node new_node = new Node(data);

        // Если список пуст, то создадим корневой элемент
        if (this.head == null) {
            this.head = new_node;
        } else {
            // Иначе переместимся в конец списка и вставим новую запись
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

    }

    public T get(int index){

        if(isEmpty()) return null;
        Node currNode = this.head;
        int i = 0;
        for(; i != index && currNode != null; ++i)  currNode = currNode.next;
        if(currNode == null) return null;
        return currNode.data;

    }

    public boolean contains(T value){

        Node currNode = this.head;

        while (currNode != null) {

            if(currNode.data.equals(value)) return true;
            currNode = currNode.next;

        }
        return false;
    }

    public boolean isEmpty(){

       return head == null;

    }

    public void print()
    {
        Node currNode = this.head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args)
    {
        arraylist<Integer> list = new arraylist<Integer>();

        System.out.println(list.isEmpty());

        list.add(1);
        System.out.println(list.isEmpty());
        list.add(2);
        list.add(3);
        System.out.println(list.get(4));
        System.out.println(list.contains(4));
        list.add(4);
        System.out.println(list.contains(4));
        list.add(5);
        list.add(6);
        System.out.println(list.get(4));
        list.add(7);
        list.add(8);

        list.print();
    }
}