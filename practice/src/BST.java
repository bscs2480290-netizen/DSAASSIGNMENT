


    class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Binary Search Tree class
    class BST {
        Node root;

        // 1️⃣ Insert a node into BST
        Node insert(Node root, int value) {
            if (root == null) {
                return new Node(value); // Base case: empty position
            }
            if (value < root.data) {
                root.left = insert(root.left, value); // Go left
            } else if (value > root.data) {
                root.right = insert(root.right, value); // Go right
            }
            return root; // Return unchanged root
        }

        // 2️⃣ Inorder traversal (Left, Root, Right)
        void inorder(Node root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

        // 3️⃣ Preorder traversal (Root, Left, Right)
        void preorder(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorder(root.left);
                preorder(root.right);
            }
        }

        // 4️⃣ Postorder traversal (Left, Right, Root)
        void postorder(Node root) {
            if (root != null) {
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data + " ");
            }
        }

        // 5️⃣ Search a value
        boolean search(Node root, int key) {
            if (root == null) return false;
            if (root.data == key) return true;
            if (key < root.data) return search(root.left, key);
            else return search(root.right, key);
        }

        // 6️⃣ Find minimum value
        int findMin(Node root) {
            Node current = root;
            while (current.left != null) {
                current = current.left;
            }
            return current.data;
        }

        // 7️⃣ Find maximum value
        int findMax(Node root) {
            Node current = root;
            while (current.right != null) {
                current = current.right;
            }
            return current.data;
        }

        // 8️⃣ Delete a node
        Node delete(Node root, int key) {
            if (root == null) return root;

            if (key < root.data) root.left = delete(root.left, key);
            else if (key > root.data) root.right = delete(root.right, key);
            else {
                // Node with only one child or no child
                if (root.left == null) return root.right;
                else if (root.right == null) return root.left;

                // Node with two children: Get inorder successor
                root.data = findMin(root.right);
                root.right = delete(root.right, root.data);
            }
            return root;
        }

        // 9️⃣ Count total nodes
        int countNodes(Node root) {
            if (root == null) return 0;
            return 1 + countNodes(root.left) + countNodes(root.right);
        }

        // 🔟 Count leaf nodes
        int countLeafNodes(Node root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1;
            return countLeafNodes(root.left) + countLeafNodes(root.right);
        }

        // 1️⃣1️⃣ Find tree height
        int height(Node root) {
            if (root == null) return 0;
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }


