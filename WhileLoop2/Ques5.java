import java.util.Scanner;

public class Ques5 {
    public static void main(String []args){
        System.out.println("Enter Your number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = n;
        int i = 1;
        int sum = 0;
        while(i<=n/2){
            if(n%i == 0){
                sum = sum+i;
            }
            i++;
        }

        if(sum == num){
            System.out.println("this is the perfect number");
        }
        else{
             System.out.println("This is not the perfect number");
        }
    }
}
