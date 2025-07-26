package ArrayAssignment;

import java.util.Scanner;


public class Ques9 {
    public static void greaterElem(int []arr, int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=(sum/n)){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the element");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        
        greaterElem(arr, size);
    }
}
