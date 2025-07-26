import java.util.Scanner;

public class Ques7{
    public static int sumofArray(int []arr, int n){
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        System.out.println("enter the element");
        int []arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
         }

         int ans = sumofArray(arr, size);
         System.out.println(ans);
    }
}