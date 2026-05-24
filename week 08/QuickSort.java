public class QuickSort {

    // PARTITION(A, p, r)
    public static int partition(int[] A, int p, int r) {
        int x = A[r];        // Pivot element
        int i = p - 1;       // Index of smaller element

        for (int j = p; j <= r - 1; j++) {

            if (A[j] <= x) {
                i = i + 1;
                // exchange A[i] with A[j]
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        // exchange A[i+1] with A[r]
        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;

        return i + 1; // Return the pivot index
    }

    // QUICKSORT(A, p, r)
    public static void quickSort(int[] A, int p, int r) {
        if (p < r) {

            int q = partition(A, p, r); // [cite: 73]

            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }
}