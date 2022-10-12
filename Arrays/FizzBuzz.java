package Arrays;
import java.util.*;
class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<String>();
        for(int i = 1; i<=n; i++){
            if(i%3==0 && i%5==0){
                list.add(i-1, "FizzBuzz");
            }
            else if(i%3==0){
                list.add(i-1, "Fizz");
            }
            else if(i%5==0){
                list.add(i-1, "Buzz");
            }
            else{
                list.add(i-1, Integer.toString(i));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        FizzBuzz f1 = new FizzBuzz();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        List<String> list = f1.fizzBuzz(num);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}