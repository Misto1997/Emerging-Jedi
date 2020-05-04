import java.util.ArrayList;
import java.util.List;

public class GreaterNumbers {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.root = tree.insertNode(tree.root, 10);
        tree.root = tree.insertNode(tree.root, 20);
        tree.root = tree.insertNode(tree.root, 30);
        tree.root = tree.insertNode(tree.root, 40);
        tree.root = tree.insertNode(tree.root, 50);

        //Numbers Greater than given number
        List<Integer> list = new ArrayList<>();
        inOrder(tree.root, list);
        int index = list.indexOf(30);
        System.out.println(list.size() - (index + 1));
    }

    //Inorder traversal
    private static void inOrder(Node node, List<Integer> list) {
        if (node != null) {
            inOrder(node.left, list);
            list.add(node.data);
            inOrder(node.right, list);
        }
    }
}
