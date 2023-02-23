import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        System.out.println("--------------WELCOME TO R D RESTORENT------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Password");
        int pwd = sc.nextInt();

        System.out.println("--------------WELCOME TO R D RESTORENT------------");
        System.out.println("1.BreakFast");
        System.out.println("2.Launch");
        System.out.println("3.Dinner");
        System.out.println("Enter Your choice !!!!!!!!!!!");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("--------------WELCOME TO R D RESTORENT------------");
                System.out.println("1.Tea ------- 50 rupee");
                System.out.println("2.Coffee-------- 100 ruppee");
                System.out.println("3.Sammose-------50 ruppee");
                System.out.println("4.Milk-------25 ruppee");
                System.out.println("Enter Your choice !!!!!!!!!!!");
                int breakChoice = sc.nextInt();
                if (breakChoice == 1) {
                    System.out.println("Enter Quantity of Tea ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 50;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }

                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else if (breakChoice == 2) {
                    System.out.println("Enter Quantity of Coffee ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 100;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }

                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else if (breakChoice == 3) {
                    System.out.println("Enter Quantity of Sammose ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 50;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }

                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else if (breakChoice == 4) {
                    System.out.println("Enter Quantity of Milk ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 25;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }

                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else {
                    System.out.println("Wrong Input !!!!!!!!");
                }
                break;
            }

            case 2: {
                System.out.println("--------------WELCOME TO R D RESTORENT------------");
                System.out.println("1.Rice ------- 50 rupee");
                System.out.println("2.Paneer-------- 100 ruppee");
                System.out.println("3.Daal Makhni-------50 ruppee");
                System.out.println("4.Allu Pradha-------25 ruppee");
                System.out.println("Enter Your choice !!!!!!!!!!!");
                int breakChoice = sc.nextInt();
                if (breakChoice == 1) {
                    System.out.println("Enter Quantity of Rice ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 50;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }

                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else if (breakChoice == 2) {
                    System.out.println("Enter Quantity of Paneer ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 100;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }

                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else if (breakChoice == 3) {
                    System.out.println("Enter Quantity of Daal Makhni ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 50;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }

                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else if (breakChoice == 4) {
                    System.out.println("Enter Quantity of Allu Pradha ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 25;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }
                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else {
                    System.out.println("Wrong Input !!!!!!!!");
                }
                break;
            }

            case 3: {
                System.out.println("--------------WELCOME TO R D RESTORENT------------");
                System.out.println("1.Daal Roti ------- 50 rupee");
                System.out.println("2.Chicken-------- 100 ruppee");
                System.out.println("3.Fafada-------50 ruppee");
                System.out.println("4.Chole cawal-------25 ruppee");
                System.out.println("Enter Your choice !!!!!!!!!!!");
                int breakChoice = sc.nextInt();
                if (breakChoice == 1) {
                    System.out.println("Enter Quantity of Daal Roti ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 50;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }
                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else if (breakChoice == 2) {
                    System.out.println("Enter Quantity of Chicken ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 100;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }

                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else if (breakChoice == 3) {
                    System.out.println("Enter Quantity of Fafada ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 50;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }

                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else if (breakChoice == 4) {
                    System.out.println("Enter Quantity of Chole cawal ");
                    int quntity = sc.nextInt();
                    int totalAmount = quntity * 25;
                    System.out.println("Do you want discount y/n ?");
                    char check = sc.next().charAt(0);
                    int discount = 0;
                    if (check == 'y') {
                        discount = totalAmount / 4;
                    }

                    System.out.println("amount -- " + totalAmount);
                    totalAmount = totalAmount - discount;
                    System.out.println("Discount amount -- " + discount);
                    System.out.println("Total amount -- " + totalAmount);

                } else {
                    System.out.println("Wrong Input !!!!!!!!");
                }
                break;
            }

        }

    }
}
