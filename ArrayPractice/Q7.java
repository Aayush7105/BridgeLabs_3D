
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
         for(int i=0; i<m; i++){
            arr[i] = sc.nextInt();
            }
        int n = arr.length;
        int[] freq = new int[n];
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(visited[i]) continue;
            int count = 1;  
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            freq[i] = count;
            visited[i] = true;
        }
        System.out.println("Element\tFrequency");
        for(int i=0; i<n; i++){
            if(visited[i]){
                System.out.println(arr[i] + "\t" + freq[i]);
            }
        }
    }
    
}