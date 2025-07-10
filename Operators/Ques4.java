import java.util.Scanner;

public class Ques4{
    public static void main(String args[]){
        System.out.println("Enter your First number");
        Scanner input1 = new Scanner(System.in);
        int a = input1.nextInt();
        System.out.println("Enter Your Second Number: ");
        Scanner input2 = new Scanner(System.in);
        int b = input2.nextInt();
        System.out.println("Enter Your Third number");
        Scanner input3 = new Scanner(System.in);
        int c = input3.nextInt();

        b = a+b;
        a = b-a;
        c = b-a;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}
