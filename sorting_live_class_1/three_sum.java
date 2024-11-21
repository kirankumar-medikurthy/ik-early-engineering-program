import java.util.Scanner;
public class three_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        
        boolean[] visited = new boolean[10000];
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                int complement = 0 - array[i] - array[j];
                if(visited[complement]) {
                    System.out.println(array[i] + " " + array[j] + " " + complement);
                    return;
                }
                visited[array[j]] = true;
            }
        }
        System.out.println("No triplet found");
    }
}