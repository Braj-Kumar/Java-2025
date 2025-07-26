import java.util.Scanner;

public class Ques1{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your size");
        int size = input.nextInt();
        int []arr = new int[size];
        System.out.println("enter your element");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();

        }
        System.out.println("print the element");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}