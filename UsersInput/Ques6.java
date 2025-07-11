import java.util.Scanner;

public class Ques6 {
    public static void main(String []args){
        System.out.println("Enter Your number: ");
        Scanner input = new Scanner(System.in);
        int i=0;
        while(i<5){
            int n = input.nextInt();
            System.out.println("number is: "+n);
            i++;
        }
    }
}
