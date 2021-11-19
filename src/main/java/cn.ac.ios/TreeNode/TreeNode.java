package cn.ac.ios.TreeNode;

import java.util.*;


import static cn.ac.ios.TreeNode.Utils.*;


public class TreeNode {
    private String data;
    private TreeNode parent;
    private List<TreeNode> children;

    public TreeNode() {
    }

    public TreeNode(String data) {
        this.data = data;
        this.children = new LinkedList<>();
    }
}
