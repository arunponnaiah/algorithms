package com.algorithms.ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {

    private List<Node> queue;
    private List<Integer> results;
    private int index;

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
        inOrderTraversal(node.leftNode);
        results.add(node.data);
        inOrderTraversal(node.rightNode);
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

    public List<Integer> serializeByPreorderTraversal(Node node){
        if(node == null){
            results.add(-1);
            return results;
        }
        results.add(node.data);
        serializeByPreorderTraversal(node.leftNode);
        serializeByPreorderTraversal(node.rightNode);
        return results;
    }

    public Node deserializeByPreorderTraversal(List<Integer> array) {
        if(index == array.size() || array.get(index) == -1){
            index +=1;
            return null;
        }
        int data = array.get(index);
        Node node = new Node(data);
        index +=1;
        node.leftNode = deserializeByPreorderTraversal(array);
        node.rightNode = deserializeByPreorderTraversal(array);
        return node;
    }

    public Node constructBinaryTreeFromInorderTraversal(List<Integer> list, int start, int end, Node node){
        if (start > end)
            return null;

        int maxIndex = findMaxIndex(list, start, end);
        node = new Node(list.get(maxIndex));

        if (start == end)
            return node;

        node.leftNode = constructBinaryTreeFromInorderTraversal(list, start, maxIndex - 1, node.leftNode);
        node.rightNode = constructBinaryTreeFromInorderTraversal(list, maxIndex + 1, end, node.rightNode);
        return node;
    }

    private int findMaxIndex(List<Integer> list, int start, int end) {
        int maxIndex = start;
        start++;
        if (start < end) {
            return list.indexOf(list.subList(start, end).stream().mapToInt(Integer::intValue).max().getAsInt());
        }
        return maxIndex;
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
