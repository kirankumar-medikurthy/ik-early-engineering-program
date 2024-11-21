import java.util.Scanner;
public class two_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        int targetSum = input.nextInt();
        for(int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        
        boolean[] visited = new boolean[10000];
        for(int i = 0; i < size; i++) {
            int complement = targetSum - array[i];
            if(visited[complement]) {
                System.out.println(array[i] + " " + complement);
                return;
            }
            visited[array[i]] = true;
        }
        System.out.println("No pair found");
    }
}