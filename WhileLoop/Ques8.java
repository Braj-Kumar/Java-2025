import java.util.Scanner;

public class Ques8{
    public static void main(String []args){
        System.out.println("Coutn the factors");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=1;
        int count=0;
        while(i<n){
            if(n%i == 0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
