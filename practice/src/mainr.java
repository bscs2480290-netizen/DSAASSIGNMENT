public class mainr {


        // 1. Binary Search (Iterative)
        static int binarySearchIterative(int[] A, int key) {
            int low = 0;
            int high = A.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (A[mid] == key)
                    return mid;
                else if (key < A[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            return -1;
        }

        // 2. Binary Search (Recursive)
        static int binarySearchRecursive(int[] A, int low, int high, int key) {
            if (low > high)
                return -1;

            int mid = (low + high) / 2;

            if (A[mid] == key)
                return mid;
            else if (key < A[mid])
                return binarySearchRecursive(A, low, mid - 1, key);
            else
                return binarySearchRecursive(A, mid + 1, high, key);
        }

        // 3. Recursive Linear Search
        static int linearSearchRecursive(int[] A, int index, int key) {
            if (index == A.length)
                return -1;

            if (A[index] == key)
                return index;

            return linearSearchRecursive(A, index + 1, key);
        }

        // 4. Find Minimum using recursion
        static int findMin(int[] A, int n) {
            if (n == 1)
                return A[0];
            return Math.min(A[n - 1], findMin(A, n - 1));
        }

        // 4. Find Maximum using recursion
        static int findMax(int[] A, int n) {
            if (n == 1)
                return A[0];
            return Math.max(A[n - 1], findMax(A, n - 1));
        }

        // MAIN METHOD
        public static void main(String[] args) {

            int[] A = {3, 8, 12, 20, 25, 30};

            // 1. Iterative Binary Search for 20
            int result1 = binarySearchIterative(A, 20);
            System.out.println("Iterative Binary Search: 20 found at index = " + result1);

            // 2. Recursive Binary Search for 25
            int result2 = binarySearchRecursive(A, 0, A.length - 1, 25);
            System.out.println("Recursive Binary Search: 25 found at index = " + result2);

            // 3. Recursive Linear Search for 12
            int result3 = linearSearchRecursive(A, 0, 12);
            System.out.println("Recursive Linear Search: 12 found at index = " + result3);

            // 4. Minimum and Maximum using recursion
            int min = findMin(A, A.length);
            int max = findMax(A, A.length);

            System.out.println("Minimum value = " + min);
            System.out.println("Maximum value = " + max);
        }
    }

