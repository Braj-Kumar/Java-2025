import java.util.Scanner;

public class Ques1{
    public static void main(String []args){
        System.out.println("Print the number 1 to 10");
        Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();
        int i = 0;
        while(n != 0 ){
            System.out.println(i);
            i++;
            n--;
        }
    }
}
