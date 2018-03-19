package com.algorithms.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BinaryTreeTest {
    private BinaryTree binaryTree;

    @Before
    public void setUp() throws Exception {
        this.binaryTree = new BinaryTree();
    }

    @Test
    public  void testLevelOrderTraversal(){
        BinaryTree.Node rootNode = this.binaryTree.new Node(1);
        rootNode.leftNode = this.binaryTree.new Node(2);
        rootNode.rightNode = this.binaryTree.new Node(3);

        List<Integer> expected = Arrays.asList(1,2,3);
        Assert.assertEquals(expected, this.binaryTree.levelOrderTraversal(rootNode));
    }


}