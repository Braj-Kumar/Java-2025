import java.util.Scanner;

public class Ques2{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = input.nextInt();
        System.out.println("Enter the element");
        int []arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("print the element");
        for(int i=0;i<size;i++){
            System.out.print(i+" ");
        }
    }
}