public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();

    int[] array = new int[n];
    System.out.println("Enter " + n + " integers:");
    for (int i = 0; i < n; i++) {
        array[i] = scanner.nextInt();
    }

    System.out.println("\nOriginal Array:");
    printArray(array);

    // Call quicksort starting from index 0 to n-1
    QuickSort.quickSort(array, 0, array.length - 1);

    System.out.println("\nSorted Array using Quick Sort:");
    printArray(array);

    scanner.close();
}

public static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}