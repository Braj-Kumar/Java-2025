import java.util.Scanner;

public class Secnd {
    public static int isFound(int []arr, int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int []arr = {6,21,3,4,6,7,89, 91};
        System.out.println("Enter your number");
        int num = input.nextInt();
        
        int ans = isFound(arr, num);
        System.out.println(ans);
    }
}
