public class binarysearchilt{
public static int Binarysearchilt(int[] arr, int target) {

    int low = 0, high = arr.length - 1;

    while(low <= high) {

        int mid = (low + high) / 2;

        if(arr[mid] == target) return mid;

        else if(target > arr[mid])
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1;
}
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
    static int linearSearchRecursive(int[] A, int index, int key) {
        if (index == A.length)
            return -1;

        if (A[index] == key)
            return index;

        return linearSearchRecursive(A, index + 1, key);
    }
    static int findMin(int[] A, int n) {
        if (n == 1)
            return A[0];
        return Math.min(A[n - 1], findMin(A, n - 1));
    }
    static int findMax(int[] A, int n) {
        if (n == 1)
            return A[0];
        return Math.max(A[n - 1], findMax(A, n - 1));
    }

}
