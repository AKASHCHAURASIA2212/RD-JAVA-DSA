import java.util.*;
class Test{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Please Enter a password !!!!");

     int pwd = sc.nextInt();
     if(pwd==12345){
        System.out.println("Hello world !!!!");
     }else{
        System.out.println("try again !!!!");
     }
    }
}