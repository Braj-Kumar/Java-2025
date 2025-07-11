import java.util.Scanner;

public class Ques5{
    public static void main(String []args){
        System.out.println("Enter Your number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int result = n&1;
        if(result == 0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    }
}