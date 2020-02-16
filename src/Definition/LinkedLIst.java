package Definition;

import AdtLinkedList.adt;

public  class  LinkedLIst<E> implements adt<E> {
    Node<E> head = null;
    private int size;

    @Override
    public void addFirst(E Item) {
        head = new Node<E>(Item, head);
        size++;
    }

    public void addAfter(Node<E> node, E Item) {
        node.next = new Node<E>(Item, node.next);
        size++;

    }

    public E removeFirst() {
        if (head != null) {
            head = head.next;

        }
        Node<E> temp = head;
        if (temp != null) {
            size--;
        } else {
            return null;
        }
        return head.data;


    }
    public String toString() {
        Node<String> noderef = (Node<String>) head;
        StringBuilder result = new StringBuilder();
        while (noderef != null) {
            result.append(noderef.data);
            if (noderef.next != null) {
                result.append("==>");
            }
            noderef=noderef.next;
        }
        return result.toString();

    }
    public Node<E> getNode(int Index){
        Node<E> node=head;

        for (int i = 0; i < Index && node!=null ; i++) {
            node=node.next;// to bring till the specified index

        }
        return  node;
    }

    public E getInfo(int Index){
        if(Index < 0 || Index> size){
            throw new IndexOutOfBoundsException(Integer.toString(Index));
        }
        Node<E> node=getNode(Index);
        return node.data;
    }
    public void add(int Index,E Item){
        if(Index < 0 || Index>size){
            throw new IndexOutOfBoundsException(Integer.toString(Index));

        }
        if(Index==0){
            addFirst(Item);
        }
        else{
            Node<E> node=getNode(Index-1);
            addAfter(node,Item);
        }
    }





    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
