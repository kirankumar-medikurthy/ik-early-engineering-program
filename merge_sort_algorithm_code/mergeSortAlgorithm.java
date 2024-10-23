import java.util.Scanner;
class mergeSortAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        mergeSortHelper(0, size - 1, array);
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void mergeSortHelper(int start, int end, int[] array) {
        if(start == end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSortHelper(start, mid, array);
        mergeSortHelper(mid+1, end, array);
        merge(start, mid, end, array);
    }
    public static void merge(int start, int mid, int end, int[] array) {
        int i = start;
        int j = mid + 1;
        int k = start;
        int[] aux = new int[end+1];
        while(i <= mid && j <= end) {
            if(array[i] <= array[j]) {
                aux[k++] = array[i++];
            } else {
                aux[k++] = array[j++];
            }
        }
        while (i <= mid) {
            aux[k++] = array[i++];
        }
        while (j <= end) {
            aux[k++] = array[j++];
        }

        for (int l = start; l <= end; l++) {
            array[l] = aux[l];
        }
    }
}