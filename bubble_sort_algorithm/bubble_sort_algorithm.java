package bubble_sort_algorithm;
import java.util.Scanner;
class bubble_sort_algorithm {
    public static void bubbleSort(int size, int[] arr) {
        for(int i = 0; i < size; i++) {
            for(int red = size - 1; red >= i+1; red--) {
                if(arr[red - 1] > arr[red]) {
                    int temp = arr[red - 1];
                    arr[red - 1] = arr[red];
                    arr[red] = temp;
                }
            }
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
        bubbleSort(size, array);
        printArray(size, array);
    }
}