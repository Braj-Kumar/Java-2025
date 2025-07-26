import java.util.Scanner;

public class Ques3{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = input.nextInt();

        int []arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("print the even element in array");

        for(int i=0;i<size;i++){
            if(arr[i]%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}