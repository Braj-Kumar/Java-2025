import java.util.Scanner;

public class Ques1 {
    public static void main(String []args){
        System.out.println("Enter Your number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int i=1;
        while(i<=n){
            sum+=(i*i);
            i++;
        }

        System.out.println(sum);
    }
}
