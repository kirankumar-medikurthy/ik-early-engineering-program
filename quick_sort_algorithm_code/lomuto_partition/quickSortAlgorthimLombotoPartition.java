package quick_sort_algorithm_code.lomuto_partition;
import java.util.Scanner;

class quickSortAlgorthimLombotoPartition {
    public static void quickSort(int start, int end, int[] array) {
        if (start >= end) {
            return;
        }
        int smaller = start;
        for (int bigger = start + 1; bigger <= end; bigger++) {
            if (array[bigger] < array[start]) {
                smaller += 1;
                int temp = array[smaller];
                array[smaller] = array[bigger];
                array[bigger] = temp;
            }
        }
        int temp = array[start];
        array[start] = array[smaller];
        array[smaller] = temp;
        quickSort(0, start - 1, array);
        quickSort(start + 1, end, array);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        quickSort(0, size - 1, array);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}