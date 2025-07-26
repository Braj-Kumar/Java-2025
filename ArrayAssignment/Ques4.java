import java.util.Scanner;

public class Ques4{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the size of array");
         int size = input.nextInt();
         System.out.println("enter the element of array");
         int []arr = new int[size];

         for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
         }

         for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
         }
    }
}