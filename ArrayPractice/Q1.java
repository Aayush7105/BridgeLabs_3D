import java.util.*;

public class Q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size :");
        int n=sc.nextInt();
        int c=0;
        int arr[]=new int [n];
        System.out.println("Enter elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target :");
        int target=sc.nextInt();
        for(int j:arr){
            if(j==target){
               c++;
            }
        }
        System.out.println("The target number "+target+" occurs "+c+" times");
    }
}