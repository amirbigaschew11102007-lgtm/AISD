class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;
    private Node<T> parent;

    Node(T value,Node<T> parent) {
        this.value = value;
        left = null;
        right = null;
        this.parent=parent;
    }
    Node(T value) {
        this.value = value;
        left = null;
        right = null;
        parent=null;
    }
    Node(T value,Node<T> left,Node<T> right,Node<T> parent) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.parent=parent;
    }


    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }

    public boolean isRoot() {
        return this.parent == null;
    }

    public boolean haveLeft() {
        return getLeft() != null;
    }

    public boolean haveRight() {
        return getRight() != null;
    }



    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }
}
