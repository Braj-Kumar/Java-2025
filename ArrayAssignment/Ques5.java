import java.util.Scanner;

public class Ques5{
    public static int eveElement(int []arr, int n){
            int count = 0;
            for(int i=0;i<n;i++){
                if(arr[i]%2 == 0){
                    count++;
                }
            }
            return count;
    }

    public static void main(String[]args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        int ans = eveElement(arr, size);
        System.out.println(ans);
    }
}