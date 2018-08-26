package com.Trees;

import java.util.ArrayList;

/**
 * Created by mithun on 14/03/18.
 */
public class MainBinaryTree {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(20);
        root.right = new BinaryTreeNode(30);
        root.left.left = new BinaryTreeNode(5);
        root.left.right = new BinaryTreeNode(25);
        root.right.left = new BinaryTreeNode(35);
        root.right.right = new BinaryTreeNode(12);

       /* {
            int maxElement = Tree.maxInBinaryTreeRecursive(root);
            System.out.println(maxElement);
            maxElement = Tree.maxInBinaryTreeLevelOrder(root);
            System.out.println(maxElement);
        }
        {
            ArrayList<Integer> tree = Tree.levelOrderList(root);
            System.out.println(tree);

            ArrayList<ArrayList<Integer>> treeLevel = Tree.levelOrder(root);
            System.out.println(treeLevel);
        }
        {
            BinaryTreeNode root1 = Tree.insertInBinaryTreeLevelOrder(root, 50);
            ArrayList<ArrayList<Integer>> treeLevel = Tree.levelOrder(root1);
            System.out.println(treeLevel);
        }
        {
            int size = Tree.binaryTreeSize(root);
            System.out.println(size);
        }*/
        /*{
            int treeDepth = Tree.maxDepthRecursive(root);
            System.out.println(treeDepth);


        }*/
        {
            int treeDepth = Tree.maxDepthIterative(root);
            System.out.println(treeDepth);


        }


    }
}
