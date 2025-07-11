import java.util.Scanner;

public class Ques11 {
    public static void main(String []args){
        System.out.println("Enter Your number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=0;
        int sum = 0;
        while(i<=n){
            if(i%2 != 0){
                sum+=i;
            }
            i++;
        }
        System.out.println("Sum of odd numbers are: "+ sum);
    }
}
