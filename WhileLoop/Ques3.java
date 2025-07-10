import java.util.Scanner;

public class Ques3{
    public static void main(String []args){
        System.out.println("print the odd number");
        Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();
        int i=1;
        while(n!=0){
            if(i%2 != 0){
                System.out.print(i+" ");
            }
            i++;
            n--;
        }
    }
}
