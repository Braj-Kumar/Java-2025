import java.util.Scanner;

public class Ques9{
    public static void main(String []args){
        System.out.println("Enter Your number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=0;
        int sum  = 0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}