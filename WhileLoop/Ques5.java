import java.util.Scanner;

public class Ques5{
    public static void main(String []args){
        System.out.println("print the number that is divisible by 7 or End with 7");
        Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();
        int i=1;
        while(n!=0){
            if(i%7 == 0 || i%10 == 7){
                System.out.print(i+ " ");
            }
            i++;
            n--;
        }
    }
}