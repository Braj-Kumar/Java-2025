import java.util.Scanner;

public class Ques4 {
    public static void main(String []args){
        System.out.println("Enter Your number");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        int result = (~num1);

        System.out.println(result);
    }    
}
