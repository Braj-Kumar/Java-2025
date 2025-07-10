import java.util.Scanner;

public class Ques7{
    public static void main(String []args){
        System.out.println("print the factors of number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=1;
        while(i<=n/2){
            if(n%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}