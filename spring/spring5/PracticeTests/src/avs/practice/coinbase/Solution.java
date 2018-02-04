package avs.practice.coinbase;

import java.util.Scanner;

public class Solution {

    private static class Node {
        Node left, right;
        int data;

        Node(int newData) {
            left = right = null;
            data = newData;
        }
    }

    private static Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node.data) {

                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return (node);
    }

    private static int isPresent(Node root, int val) {

        int result = 0;
        boolean found = false;
        while ((root != null) && !found) {
            int rval = root.data;
            if (val < rval)
                root = root.left;
            else if (val > rval)
                root = root.right;
            else {
                found = true;
                result = 1;
                break;

            }
            isPresent(root, val);
        }


        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node _root;
        int root_i = 0, rooot_cnt = 0, root_num = 0;
        rooot_cnt = in.nextInt();
        _root = null;

        for (root_i = 0; root_i < rooot_cnt; root_i++) {
            root_num = in.nextInt();
            if (root_i == 0) {
                _root = new Node(root_num);
            } else {
                insert(_root, root_num);
            }
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int _x = in.nextInt();
            System.out.println(isPresent(_root, _x));

        }
    }


}
