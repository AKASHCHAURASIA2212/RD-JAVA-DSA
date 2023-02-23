package Proj3;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        String name = "Akash";
        int pwd = 12345;
        int amount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome TO SBI Banking System");

        System.out.println("Enter Your Name");
        String username = sc.nextLine();
        System.out.println("Enter Your password");
        int userpwd = sc.nextInt();

        if (name.equals(username) && pwd == userpwd) {

            while (true) {
                System.out.println("Welcome " + username);
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Balance");
                System.out.println("4. Exit");
                System.out.println("Enter Your choice");
                int choice = sc.nextInt();
                boolean temp = false;
                switch (choice) {

                    case 1: {
                        System.out.println("Enter Amount :");
                        int currAmount = sc.nextInt();
                        amount += currAmount;
                        break;
                    }

                    case 2: {
                        System.out.println("Enter Amount to Withdraw:");
                        int currAmount = sc.nextInt();
                        if (amount <= 0 || currAmount > amount) {
                            System.out.println("Sorry Cannot Withdraw Balance is Low !!!!!!!!!!!!!");
                            break;
                        }
                        amount -= currAmount;
                        break;
                    }
                    case 3: {
                        System.out.println("Your Current Balance is " + amount);
                        break;
                    }
                    case 4: {
                        temp = true;
                    }

                }

                if (temp) {
                    break;
                }

            }
        } else {
            System.out.println("Invalid User Login !!!!!!!!!!");
        }
        sc.close();

    }
}
