import java.util.Scanner;

public class Ques2{
    public static void main(String args[]){
        System.out.println("Enter Your number");
        Scanner input1 = new Scanner(System.in);
        int n  = input1.nextInt();
        while(n != 0){
            int rem = n%10;
            System.out.println(rem);
            n = n/10;
        }
    }
}