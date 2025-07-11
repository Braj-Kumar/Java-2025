import java.util.Scanner;


public class Ques1{

    public static void Multipl(int num){
        int i=0;
        while(i<=10){
            System.out.println(num + "*" + i + " = "+ num*i);
            i++;
        }
    }
    public static void main(String []args){
        System.out.println("Enter Your number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Multipl(num);
    }
}