package com.hai.collection_.set_;

public class HashSetStructure {
    public static void main(String[] args) {
        Node[] table = new Node[16];

        // 创建一个Node结点对象
        Node ball = new Node("ball", null);
        // 将结点挂载到 table[1]的位置
        table[1] = ball;

        // 创建一个Node结点对象
        Node messi = new Node("messi", null);
        // 将 messi结点对象挂载到ball后
        ball.next = messi;

        // 创建一个Node结点对象，并将结点挂载到table[3]
        Node lucy = new Node("lucy", null);
        table[3] = lucy;

        for (int i = 0; i < table.length; i++) {
            while(table[i] != null) {
                System.out.println(table[i]);
                table[i] = table[i].next;
            }
        }


    }
}

class Node {
    Object item;
    public Node next;

    public Node (Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
