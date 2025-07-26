import java.net.SocketPermission;
import java.util.Scanner;

public class Third{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }

        System.out.print("print the array");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
