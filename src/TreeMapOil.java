import java.util.TreeMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class BinaryTree {
    TreeNode root;

    public void insert(int val) {
        root = insert(root, val);
    }

    private TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }

        if (val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    public boolean contains(int val) {
        return contains(root, val);
    }

    private boolean contains(TreeNode node, int val) {
        if (node == null) {
            return false;
        }

        if (val == node.val) {
            return true;
        } else if (val < node.val) {
            return contains(node.left, val);
        } else {
            return contains(node.right, val);
        }
    }
}

class TreeMapExample {
    TreeMap<Integer, Integer> treeMap = new TreeMap<>();

    public void insert(int val) {
        if (!treeMap.containsKey(val)) {
            treeMap.put(val, null);
        }
    }
}