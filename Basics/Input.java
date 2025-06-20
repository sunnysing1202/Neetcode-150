package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the message :)");
        String msg = sc.nextLine();

        System.out.print("The message you have entered is : ");
        System.out.println(msg);
    }
}
