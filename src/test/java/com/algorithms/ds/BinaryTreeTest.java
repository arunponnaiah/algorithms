package com.algorithms.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeTest {
    private BinaryTree binaryTree;
    private BinaryTree.Node rootNode;

    @Before
    public void setUp() throws Exception {
        this.binaryTree = new BinaryTree();
        rootNode = this.binaryTree.new Node(1);
        rootNode.leftNode = this.binaryTree.new Node(2);
        rootNode.rightNode = this.binaryTree.new Node(3);
    }

    @Test
    public  void testLevelOrderTraversal(){
        List<Integer> expected = Arrays.asList(1,2,3);
        Assert.assertEquals(expected, this.binaryTree.levelOrderTraversal(rootNode));
    }

    @Test
    public void testpreOrderTraversal(){
        List<Integer> expected = Arrays.asList(1,2,3);
        Assert.assertEquals(expected, this.binaryTree.preOrderTraversal(rootNode));
    }

    @Test
    public void testInOrderTraversal(){
        List<Integer> expected = Arrays.asList(2,1,3);
        Assert.assertEquals(expected, this.binaryTree.inOrderTraversal(rootNode));
    }

    @Test
    public void testPostOrderTraversal(){
        List<Integer> expected = Arrays.asList(2,3,1);
        Assert.assertEquals(expected, this.binaryTree.postOrderTraversal(rootNode));
    }

    @Test
    public void testSerialize(){
        List<Integer> expected = Arrays.asList(1,2,-1,-1,3,-1,-1);
        Assert.assertEquals(expected, this.binaryTree.serializeByPreorderTraversal(rootNode));
    }

    @Test
    public void testDeserialize(){
        List<Integer> input = Arrays.asList(1,2,-1,-1,3,-1,-1);
        List<Integer> expected = Arrays.asList(1,2,3);
        Assert.assertEquals(expected, this.binaryTree.preOrderTraversal(this.binaryTree.deserializeByPreorderTraversal(input)));
    }

    @Test
    public void testConstructBinaryTreeForInorder(){
        List<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
        this.binaryTree = new BinaryTree();
        rootNode = this.binaryTree.new Node(4);
        rootNode.leftNode = this.binaryTree.new Node(2);
        rootNode.leftNode.leftNode = this.binaryTree.new Node(1);
        rootNode.leftNode.rightNode = this.binaryTree.new Node(3);
        rootNode.rightNode = this.binaryTree.new Node(5);

        BinaryTree.Node root = this.binaryTree.constructBinaryTreeFromInorderTraversal(list,0, list.size()-1, null);
        Assert.assertEquals(list, this.binaryTree.inOrderTraversal(root));
    }


}