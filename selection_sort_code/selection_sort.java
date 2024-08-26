package selection_sort_code;
import java.util.Scanner;
class selection_sort {
    public static void selectionSort(int size, int[] arr) {
        for(int i = 0; i < size; i++) {
            int min_index = i;
            int min_value = arr[i];
            for(int red = i+1; red < size; red++) {
                if(arr[red] < min_value) {
                    min_index = red;
                    min_value = arr[red];
                }
            }
            int temp = arr[i];
            arr[i] = min_value;
            arr[min_index] = temp;
        }
    }
    public static void printArray(int size, int[] arr) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for(int k = 0; k < size; k++) {
            array[k] = input.nextInt();
        }
        selectionSort(size, array);
        printArray(size, array);
    }
}