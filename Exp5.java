import java.util.*;

public class Exp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100);
        }

        System.out.println("The array elements before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        long startTime = System.currentTimeMillis();
        quickSort(a, 0, n - 1);
        long endTime = System.currentTimeMillis();

        System.out.println("\nElements of the array after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        System.out.println("\nTime taken: " + (endTime - startTime) / 1000.0 + " seconds");
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(a, low, high);
            quickSort(a, low, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }
}
