// package UsersInput;

import java.util.Scanner;

public class Ques1 {
    public static void main(String []args)
    {
        System.out.println("take a string from user");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = input.nextLine();
        System.out.println("hello jii "+ name);

    }
}
