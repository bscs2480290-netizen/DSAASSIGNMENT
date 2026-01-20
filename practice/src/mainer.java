
public class mainer{
    public static void main(String[] args) {
        BST tree = new BST();

        // Insert elements
        int[] elements = {50, 30, 70, 20, 40, 60, 80};
        for (int el : elements) {
            tree.root = tree.insert(tree.root, el);
        }

        // 1️⃣ Traversals
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
        System.out.println();

        // 2️⃣ Search for 60
        int key = 60;
        System.out.println("Search " + key + ": " + (tree.search(tree.root, key) ? "Found" : "Not Found"));

        // 3️⃣ Delete node 80
        tree.root = tree.delete(tree.root, 80);
        System.out.print("Inorder after deleting 80: ");
        tree.inorder(tree.root);
        System.out.println();

        // 4️⃣ Min & Max
        System.out.println("Minimum value: " + tree.findMin(tree.root));
        System.out.println("Maximum value: " + tree.findMax(tree.root));

        // 5️⃣ Count nodes & leaf nodes
        System.out.println("Total nodes: " + tree.countNodes(tree.root));
        System.out.println("Leaf nodes: " + tree.countLeafNodes(tree.root));

        // 6️⃣ Tree height
        System.out.println("Tree height: " + tree.height(tree.root));
    }
}
