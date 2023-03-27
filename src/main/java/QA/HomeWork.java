package QA;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter your name");
        String userName = scanner.nextLine();
        System.out.println("Nice to meet you," + userName);

        System.out.println("What is your hobby," + userName);
        String hobby = scanner.nextLine();
        System.out.println( hobby + " is a very nice hobby of yours," + userName);

    }
}
