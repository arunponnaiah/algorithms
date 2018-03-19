package com.algorithms.ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {

    private List<Node> queue;
    private List<Integer> results;

    public BinaryTree(){
        this.queue = new LinkedList<Node>();
        this.results = new ArrayList<Integer>();
    }

    public List<Integer> levelOrderTraversal(Node node){
        if(node == null)
            return results;
        results.add(node.data);
        if(node.leftNode != null)
            queue.add(node.leftNode);
        if(node.rightNode != null)
            queue.add(node.rightNode);

        if(!queue.isEmpty())
            return levelOrderTraversal(queue.remove(0));
        return results;
    }

    class Node{
        Node(int data){
            this.data = data;
        }
        Node rightNode;
        Node leftNode;
        int data;
    }
}
