import java.util.Scanner;

public class Ques7{
    public static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter Your number");
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }
}