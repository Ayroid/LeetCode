package Arrays;
import java.util.*;
public class Twosum {
    public static int[] twoSum(int nums[], int target){
        int arr[]= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size=sc.nextInt();
        int nums[]=new int[size];
        System.out.println("Enter Elements in Array:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter Value of Target: ");
        int target=sc.nextInt();
        sc.close();
        int arr[]=twoSum(nums,target);
        System.out.print("["+arr[0]+","+arr[1]+"]");
    }
}
