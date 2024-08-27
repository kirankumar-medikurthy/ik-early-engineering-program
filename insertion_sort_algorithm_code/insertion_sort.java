import java.util.Scanner;
class insertion_sort {
    public static void insertionSort(int size, int[] arr) {
        for(int i = 0; i < size; i++) {
            int temp = arr[i];
            int red = i - 1;
            while(red >= 0 && arr[red] > temp) {
                arr[red+1] = arr[red];
                red--;
            }
            arr[red+1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        insertionSort(size, array);
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}