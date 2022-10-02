// Sliding Window
import java.util.*;
class MaxSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, maxWindow=0, currWindow=0;
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter Consequtive Number: ");
        int k = sc.nextInt();
        System.out.print("Enter Elements in Array: ");
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<k;i++)
            maxWindow+=arr[i];
        for(i=k;i<size;i++){
            currWindow=maxWindow-arr[i-k]+arr[i];
            maxWindow=Math.max(maxWindow, currWindow);
        }
        System.out.println(maxWindow);
    }
}