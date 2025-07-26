import java.util.Scanner;

public class Ques9 {
    public static boolean isPalindrome(int num){
        int ans = 0;
        int n = num;
        while(n !=0){
            int rem = n%10;
            ans = ans *10 + rem;
            n = n/10;
        }
        return num == ans;
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int num = input.nextInt();
        System.out.println(isPalindrome(num));
    }
}
