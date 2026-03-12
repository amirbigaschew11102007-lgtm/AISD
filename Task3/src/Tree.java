public class Tree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public Tree() {
        this.root = null;
        this.size = 0;
    }

    public Tree(Node<T> root) {
        this.root = root;
        this.size = updatesize(root);
    }


    public void add(T value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            add(root, value);
        }
        size = updatesize(root);
    }

    private void add(Node<T> current, T value) {
        if (current.getValue().compareTo(value) > 0) {
            if (current.getLeft() == null) {
                current.setLeft(new Node<>(value, current));
            } else {
                add(current.getLeft(), value);
            }
        } else {
            if (current.getRight() == null) {
                current.setRight(new Node<>(value, current));
            } else {
                add(current.getRight(), value);
            }
        }
    }

    public Node<T> get(T value) {
        if (root == null) {
            return null;
        }
        return get(root, value);
    }

    private Node<T> get(Node<T> current, T value) {
        if (current == null) {
            return null;
        }
        int comparing = current.getValue().compareTo(value);
        if (comparing == 0) {
            return current;
        }
        if (comparing > 0) {
            return get(current.getLeft(), value);
        } else {
            return get(current.getRight(), value);
        }
    }

    public void remove(T value) {
        Node<T> trash = get(value);
        if (trash == null) {
            return;
        }
        remove(trash);
        size = updatesize(root);
    }

    private void remove(Node<T> node) {
        if (node.getLeft() == null && node.getRight() == null) {
            if (node.isRoot()) {
                root = null;
            } else {
                Node<T> parent = node.getParent();
                if (parent.getLeft() == node) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
                node.setParent(null);
            }
            return;
        }

        if (node.getLeft() == null || node.getRight() == null) {
            Node<T> son = (node.getLeft() != null) ? node.getLeft() : node.getRight();
            if (node.isRoot()) {
                root = son;
                son.setParent(null);
            } else {
                Node<T> parent = node.getParent();
                if (parent.getLeft() == node) {
                    parent.setLeft(son);
                } else {
                    parent.setRight(son);
                }
                son.setParent(parent);
            }
            node.setParent(null);
            return;
        }

        Node<T> max = node.getRight();
        while (max.getLeft() != null) {
            max = max.getLeft();
        }
        T max_value = max.getValue();
        remove(max);
        node.setValue(max_value);
    }

    private int updatesize(Node<T> node) {
        if (node == null) {
            return 0;
        }
        int a = updatesize(node.getLeft());
        int b = updatesize(node.getRight());
        if (a > b) {
            return 1 + a;
        } else {
            return 1 + b;
        }
    }

    // Это публичные(SOLID)
    public void preOrder() {
        preOrder(getRoot());
    }

    public void postOrder() {
        postOrder(getRoot());
    }

    public void inOrder() {
        inOrder(getRoot());
    }

    //Это приватные
    private void preOrder(Node<T> r) {
        if (r == null) {
            return;
        }
        System.out.println(r.getValue());
        preOrder(r.getLeft());
        preOrder(r.getRight());
    }

    private void inOrder(Node<T> r) {
        if (r == null) {
            return;
        }
        inOrder(r.getLeft());
        System.out.println(r.getValue());

        inOrder(r.getRight());
    }

    private void postOrder(Node<T> r) {
        if (r == null) {
            return;
        }
        postOrder(r.getLeft());
        postOrder(r.getRight());
        System.out.println(r.getValue());
    }

    public Node<T> getRoot() {
        return root;
    }

    public int getsize() {
        return size;
    }
}