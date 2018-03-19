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

    public List<Integer> preOrderTraversal(Node node){
        if(node == null)
            return results;
        results.add(node.data);
        preOrderTraversal(node.leftNode);
        preOrderTraversal(node.rightNode);
        return results;
    }

    public List<Integer> inOrderTraversal(Node node) {
        if(node == null)
            return results;
        preOrderTraversal(node.leftNode);
        results.add(node.data);
        preOrderTraversal(node.rightNode);
        return results;
    }

    public List<Integer> postOrderTraversal(Node node) {
        if(node == null)
            return results;
        preOrderTraversal(node.leftNode);
        preOrderTraversal(node.rightNode);
        results.add(node.data);
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
