package com.algorithms.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
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
}