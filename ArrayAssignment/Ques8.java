package ArrayAssignment;

import java.util.Scanner;

public class Ques8 {
    public static double Average(int[] arr, int n){
        double sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return sum/n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();

        System.out.println("Enter the element");
        int []arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        double ans = Average(arr, size);
        System.out.println(ans);

    }
}
