package com.hai.collection_.linkedlist;

public class DLinkList {
    public static void main(String[] args) {
        Node node = new Node("eason");
        Node ball = new Node("ball");
        Node messi = new Node("messi");

        // 将三个结点彼此连接
        node.next = ball;
        ball.next = messi;
        messi.next = null;

        Node first = node;
        Node last = messi;

//        System.out.println(ball);

        while(first != null) {
            System.out.println(first);
            first = first.next;
        }

    }
}

class Node {
    public Object obj;

    public Node next;
    public Node prev;

    public Node (Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return (String)obj;
    }
}