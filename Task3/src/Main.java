public class Main {
    public static void main(String[] args) {
        System.out.println("=======================");
        Tree<Double> tree = new Tree<>();
        tree.add(10.5); //корень
        if (tree.getsize() != 1) {
            System.out.println("!" + 1);
        }
        tree.add(8.2); // влево от 10.5
        tree.add(12.7); // вправо от 10.5
        tree.add(9.1); // вправо от 8.2

        System.out.println("=======================");
        if (tree.getsize() != 4) {
            System.out.println("!" + 2);
        }
        System.out.println("=======================");

        System.out.println(tree.getRoot().getValue());
        System.out.println(tree.getRoot().getLeft().getValue());
        System.out.println(tree.getRoot().getLeft().getRight().getValue());
        System.out.println(tree.getRoot().getRight().getValue());

        System.out.println("=======================");

        System.out.println(tree.get(9.1));
        System.out.println(tree.get(8.2));
        System.out.println(tree.get(11.0));//null
        System.out.println("=======================");

        tree.remove(10.5);
        System.out.println(tree.getRoot().getValue());
        System.out.println(tree.getRoot().getLeft().getValue());
        System.out.println("=======================");

        tree.preOrder();// 8.2 9.1 12.7
    }
}
