import java.util.*;
public class largestelement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int[] arr=new int[n];   
        for(int i =0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The largest element in the array is: " + arr[n-1]);
    }
}