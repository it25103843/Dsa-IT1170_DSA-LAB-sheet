package ex01;

class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int emp) {
        Node current = root;
        while (current != null && current.empNo != emp) {
            if (emp < current.empNo)
                current = current.leftChild;
            else
                current = current.rightChild;
        }
        return current;
    }

    public void insert(int emp, String name) {
        Node newNode = new Node(emp, name);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (emp < current.empNo) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            localRoot.displayNode();
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            localRoot.displayNode();
        }
    }

    public Node findRecursive(int emp) {
        return findRecursive(root, emp);
    }

    private Node findRecursive(Node current, int emp) {
        if (current == null || current.empNo == emp) {
            return current;
        }
        if (emp < current.empNo) {
            return findRecursive(current.leftChild, emp);
        }
        return findRecursive(current.rightChild, emp);
    }

    public void deleteAll() {
        root = null;
        System.out.println("All nodes deleted.");
    }
}