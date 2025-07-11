import java.util.Scanner;

public class Ques4 {
    public static void main(String []args){
        System.out.println("Enter Your Number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int i=1;
        while(i<=n/2){
            if(n%i == 0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
