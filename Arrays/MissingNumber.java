package Arrays;
import java.util.Scanner;

class MissingNumber {
    public int missingNumber(int[] nums) {
        int flag = 0;
        for(int i=0;i<nums.length+1;i++){
            for(int j=0;j<nums.length;j++){
                flag = 0;
                if(i==nums[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        MissingNumber m1 = new MissingNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size=sc.nextInt();
        int nums[]=new int[size];
        System.out.println("Enter Elements in Array:");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(m1.missingNumber(nums));
    }
}