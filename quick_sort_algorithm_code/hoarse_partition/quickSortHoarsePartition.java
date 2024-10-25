// package quick_sort_algorithm_code.hoarse_partition;

import java.util.Scanner;

public class quickSortHoarsePartition {
    public static void quickSortHoarsePartition(int[] array, int start, int end) {
        if(start >= end) {
            return;
        }
        int smaller = start;
        int bigger = end;
        while(smaller <= bigger) {
            if(array[smaller] < array[start] ) {
                smaller++;
            }else if(array[bigger] > array[start]) {
                bigger--;
            }else {
                int temp = array[smaller];
                array[smaller] = array[bigger];
                array[bigger] = temp;
                smaller++;
                bigger--;
            }
        }
        quickSortHoarsePartition(array, 0, start-1);
        quickSortHoarsePartition(array, start+1, end);
    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        quickSortHoarsePartition(array, 0, size - 1);
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
