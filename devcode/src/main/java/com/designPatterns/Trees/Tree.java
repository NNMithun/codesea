package com.designPatterns.Trees;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by mithun on 16/03/18.
 */
public class Tree {

    public static ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode root) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (root == null)
            return res;
        //intialisation

        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        q.offer(null);
        ArrayList<Integer> curr = new ArrayList<Integer>();
        while (!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            if (tmp != null) {
                curr.add(tmp.data);
                if (tmp.left != null)
                    q.offer(tmp.left);
                if (tmp.right != null)
                    q.offer(tmp.right);
            } else {
                ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
                res.add(c_curr);
                curr.clear();
                if (!q.isEmpty())
                    q.offer(null);

            }

        }
        return res;

    }

    public static ArrayList<Integer> levelOrderList(BinaryTreeNode root) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null)
            return res;
        //intialisation

        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            if (tmp != null) {
                res.add(tmp.data);
                if (tmp.left != null)
                    q.offer(tmp.left);
                if (tmp.right != null)
                    q.offer(tmp.right);
            }


        }
        return res;

    }

    public static int maxInBinaryTreeRecursive(BinaryTreeNode root) {
        int maxValue = Integer.MIN_VALUE;
        if (root != null) {
            int leftMax = maxInBinaryTreeRecursive(root.left);
            int rightMax = maxInBinaryTreeRecursive(root.right);
            if (leftMax > rightMax) {
                maxValue = leftMax;
            } else {
                maxValue = rightMax;
            }
            if (root.data > maxValue) {
                maxValue = root.data;
            }
        }

        return maxValue;

    }

    public static int maxInBinaryTreeLevelOrder(BinaryTreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();

            if (tmp.getData() > max)
                max = tmp.getData();


            if (tmp.getLeft() != null)
                q.offer(tmp.getLeft());
            if (tmp.getRight() != null)
                q.offer(tmp.getRight());
        }
        return max;
    }

    public static boolean findInBT(BinaryTreeNode root, int data) {
        if (root == null)
            return false;
        if (root.getData() == data)
            return true;
        return findInBT(root.getLeft(), data) || findInBT(root.getRight(), data);
    }

    public static boolean findInBTLevelOrder(BinaryTreeNode root, int data) {
        if (root == null)
            return false;

        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {

            BinaryTreeNode tmp = q.poll();
            if (tmp.getData() == data)
                return true;
            if (tmp.getLeft() != null)
                q.offer(tmp.getLeft());
            if (tmp.getRight() != null)
                q.offer(tmp.getRight());
        }
        return false;
    }

    public static BinaryTreeNode insertInBinaryTreeLevelOrder(BinaryTreeNode root, int data) {
        if (root == null)
            return null;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            if (tmp != null) {
                if (tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                else {
                    tmp.left = new BinaryTreeNode(data);
                    return root;
                }
                if (tmp.right != null) {
                    q.offer(tmp.getRight());
                } else {
                    tmp.right = new BinaryTreeNode(data);
                    return root;
                }
            }
        }

        return root;
    }

    public static int binaryTreeSize(BinaryTreeNode root) {
        int leftCount = root.left == null ? 0 : binaryTreeSize(root.left);
        int righttCount = root.right == null ? 0 : binaryTreeSize(root.right);
        return 1 + leftCount + righttCount;


    }

    public static int maxDepthRecursive(BinaryTreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = maxDepthRecursive(root.left);
        int rightDepth = maxDepthRecursive(root.right);
        return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;


    }

    public static int maxDepthIterative(BinaryTreeNode root) {
        if (root == null)
            return 0;
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);
        int maxDepth = 0;
        BinaryTreeNode prev = null;
        while (!s.isEmpty()) {

            BinaryTreeNode curr = s.peek();
            if (prev == null || prev.left == curr || prev.right == curr) {
                if (curr.left != null) s.push(curr.left);
                else if (curr.right != null) s.push(curr.right);
            } else if (curr.left == prev) {
                if (curr.right != null) s.push(curr.right);
            } else
                s.pop();
            prev=curr;
            if (s.size()>maxDepth)
                maxDepth=s.size();
        }
        return maxDepth;
    }
}
