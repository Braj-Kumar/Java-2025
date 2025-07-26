import java.util.Scanner;

public class Ques6{
    public static int digitCount(int n){
        int count = 0;
        while(n !=0){
            int rem = n%10;
            count++;
            n = n/10;
        }
        return count;
    }
    public static int threedigit(int []arr, int n){
        int count = 0;
        for(int i=0;i<n;i++){
            if(digitCount(arr[i]) == 3){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println(" ");

        System.out.println("count of three digit number");
        return count;
  
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        System.out.println("Enter the element");
        int []arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        int ans = threedigit(arr, size);
        System.out.println(ans+" ");
    }
}