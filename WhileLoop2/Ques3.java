import java.util.Scanner;

public class Ques3 {
    public static void main(String []args){
        System.out.println("Enter Your number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        if(n == 0 || n==1){
            System.out.println(1);
        }
        else{
            for(int i=1;i<=n;i++){
                fact = fact*i;
            }
        }
        System.out.println(fact);
    }
}
