package com.algorithms.ds;

import java.util.LinkedList;
import java.util.List;

public class BinaryTree {

    private static List<Node> queue = new LinkedList<Node>();

    // Breath First Traversal
    public static void levelOrderTraversal(Node node){
        if(node == null)
            return;
        System.out.println(node.data);
        if(node.leftNode != null)
            queue.add(node.leftNode);
        if(node.rightNode != null)
            queue.add(node.rightNode);
        levelOrderTraversal(queue.remove(0));
    }


    class Node{
        Node rightNode;
        Node leftNode;
        int data;
    }
}
