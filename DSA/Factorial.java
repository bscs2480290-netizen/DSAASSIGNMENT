public class Factorial {

    // 1. Factorial using recursion
    static int factorial(int n) {
        if (n == 0 || n == 1) // Base Case
            return 1;
        return n * factorial(n - 1); // Recursive Case
    }

    // 2. Fibonacci using recursion
    static int fibonacci(int n) {
        if (n == 0) return 0; // Base Case
        if (n == 1) return 1; // Base Case
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive Case
    }

    // 3. Sum of array using recursion
    static int sumArray(int[] arr, int index) {
        if (index == arr.length) // Base Case
            return 0;
        return arr[index] + sumArray(arr, index + 1); // Recursive Case
    }

    // 4. Check if array is sorted using recursion
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) // Base Case
            return true;
        if (arr[index] > arr[index + 1])
            return false;
        return isSorted(arr, index + 1); // Recursive Case
    }

    // 5a. Find minimum element using recursion
    static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) // Base Case
            return arr[index];
        return Math.min(arr[index], findMin(arr, index + 1)); // Recursive Case
    }

    // 5b. Find maximum element using recursion
    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) // Base Case
            return arr[index];
        return Math.max(arr[index], findMax(arr, index + 1)); // Recursive Case
    }

    public static void main(String[] args) {

        // 1. Factorial
        int factNum = 5;
        System.out.println("Factorial of " + factNum + " is " + factorial(factNum));

        // 2. Fibonacci
        int fibPos = 6;
        System.out.println("Fibonacci number at position " + fibPos + " is " + fibonacci(fibPos));

        // 3. Sum of array
        int[] arr1 = {2, 4, 6, 8};
        System.out.println("Sum of array elements is " + sumArray(arr1, 0));

        // 4. Check if array is sorted
        int[] arr2 = {3, 5, 7, 9};
        System.out.println("Array is sorted: " + isSorted(arr2, 0));

        // 5. Find min and max
        int[] arr3 = {2, 4, 6, 8};
        System.out.println("Minimum element is " + findMin(arr3, 0));
        System.out.println("Maximum element is " + findMax(arr3, 0));
    }
}
