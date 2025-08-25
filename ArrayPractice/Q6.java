
import java.util.*;
public class Q6 {
    // 6.Merge two arrays into a single array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
         for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
         }
         int m = sc.nextInt();
        int[] arr2 = new int [m];
         for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
         }
        int[] mergedArr = new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++){
            mergedArr[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            mergedArr[arr1.length + i] = arr2[i];
        }
        System.out.println("The merged array is:");
        for(int i=0; i<mergedArr.length; i++){
            System.out.print(mergedArr[i] + " ");
        }
    }
}