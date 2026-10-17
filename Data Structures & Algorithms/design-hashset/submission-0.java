class MyHashSet {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    private Node root;


    public MyHashSet() {

        
    }
    
    public void add(int val) {
        if (!contains(val)){
        root = insert(root, val);
        }
        
    }
     private Node insert(Node node, int val) {
        if (node == null) return new Node(val);

        if (val < node.val)
            node.left = insert(node.left, val);
        else if (val > node.val)
            node.right = insert(node.right, val);

        return node;
    }
    
    public void remove(int key) {
        if (contains(key)){
        root = delete(root, key);
        }
    }
    
    
    public boolean contains(int val) {
        Node curr = root;

        while (curr != null) {
            if (curr.val == val) return true;

            curr = val < curr.val
                    ? curr.left
                    : curr.right;
        }

        return false;
    }
     private Node delete(Node node, int val) {
        if (val < node.val) {
            node.left = delete(node.left, val);
        } else if (val > node.val) {
            node.right = delete(node.right, val);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            Node successor = node.right;
            while (successor.left != null) {
                successor = successor.left;
            }

            node.val = successor.val;
            node.right = delete(node.right, successor.val);
        }

        return node;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */