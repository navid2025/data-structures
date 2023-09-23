package main.java.org.navid.linkedList;

public class LinkedList {
    Node first;
    Node last;

    private class Node{
        private int value;
        private Node nextNode;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addFirst(int value){
        Node node = new Node(value);
        node.nextNode = first;
        if(last == null)
            last = first;
        first = node;

    }
    public void deleteFirst(){

        if(first == null)
            return;
        if(first.nextNode == null){
            last = null;
        }
//        Node second = first.nextNode;
//        first.nextNode = null;
//        first = second;
        first = first.nextNode;

    }

    public void deleteLast(){
        if(last == null)
            return;

        Node beforeEnd = first;
        while(beforeEnd.nextNode != last){
            beforeEnd = beforeEnd.nextNode;
        }
        beforeEnd.nextNode = null;
        last = beforeEnd;
    }

    public void addLast(int value){
        Node node = new Node(value);
        last.nextNode = node;
        first = (first == null) ? last : first;
        last = node;
    }

    public Boolean contains(int value){
        Node current = first;
        while(current != null){
            if (current.value == value)
                return true;
            current = current.nextNode;
        }
        return false;
    }

    public int indexOf(int value){
        Node current  = first;
        int i = 0;
        while(current != null){
            if (current.value == value)
                return i;
            current = current.nextNode;
            i++;
        }
        return -1;
    }

    public void reverse(){

        Node current = last;
        while(current != first){
            Node prevNode = beforeNode(current);
            current.nextNode =  prevNode;
            current = beforeNode(current);
        }
        var temFirst = first;
        first = last;
        last = temFirst;
        last.nextNode = null;
    }

    private Node beforeNode(Node node) {
        Node current = first;
        while(current.nextNode != node) {
            current = current.nextNode;
        }
        return current;
    }
    public Node findFromEnd(int k){
        int distance = k-1;
        Node current = first;
        Node target = first;
        for(int i = 0; i < distance; i++){
            current = current.nextNode;
            if(current == null)
                throw new IllegalArgumentException();
        }
        while(current != last){
            current = current.nextNode;
            target = target.nextNode;
        }
        return target;

    }
}
