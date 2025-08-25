

public class Q4 {
   
    public static void main(String[] args) {
        iint arr[]=new int [n];
        System.out.println("Enter elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}