package Arrays;
import java.util.Scanner;

public class PlusOne {
    public int[] plusOne(int digits[]){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int arr[] = new int[digits.length+1];
        arr[0]=1;
        return arr;
    }

    public static void main(String[] args) {
        PlusOne p1 = new PlusOne();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array: ");
            int size = sc.nextInt();
            int digits[] = new int[size];
            System.out.print("Enter Numbers in Array: ");
            for(int i=0;i<size;i++){
                digits[i]=sc.nextInt();
            }
            int ans[]=p1.plusOne(digits);
            System.out.print("Answer Array: ");
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
        }
    }
}
