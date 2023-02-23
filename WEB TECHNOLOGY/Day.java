import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a day !!!!");
        int day = sc.nextInt();
        day = day % 7;

        if (day == 1) {
            System.out.println("It is Monday !!!");
        } else if (day == 2) {
            System.out.println("It is Thusday !!!");
        } else if (day == 3) {
            System.out.println("It is Wednesday !!!");
        } else if (day == 4) {
            System.out.println("It is Thersday !!!");
        } else if (day == 5) {
            System.out.println("It is Friday !!!");
        } else if (day == 6) {
            System.out.println("It is Saterday !!!");
        } else if (day == 7) {
            System.out.println("It is Sunday !!!");
        } else {
            System.out.println("Wrong input !!!");
        }

    }
}
