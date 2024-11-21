import java.util.Scanner;
public class four_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        int targetSum = input.nextInt();
        for(int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                int k = j+1;
                int l = size - 1;
                while(k < l) {
                    int sum = array[i] + array[j] + array[k] + array[l];
                    if(sum == targetSum) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k] + " " + array[l]);
                        return;
                    }
                    else if(sum < targetSum) {
                        k++;
                    }
                    else {
                        l--;
                    }
                }
            }
        }
    }
}