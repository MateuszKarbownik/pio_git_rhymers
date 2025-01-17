package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int ERROR_NUMBER = -1;
    private class Node {

        public int value;
        public Node prev, next;

        public Node(int i) {
            value = i;
        }

    }
    Node last;
    int i;

    public void push(int i) {
        if (last == null) last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty()) return ERROR_NUMBER;
        return last.value;
    }

    public int pop() {
        if (isEmpty()) return ERROR_NUMBER;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
