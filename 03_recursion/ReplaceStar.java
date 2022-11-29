
import java.util.Scanner;

public class ReplaceStar {

	public static String replaceStar(String str) {
		if(str.length()<=2)
		{
			if(str.equals("xx") || str.equals("yy")) {
				return str.charAt(0)+"*"+str.charAt(1);
			}
			return str;
		}
		
		String sb = str.substring(0,2);
		
		if(sb.equals("xx")) {
			return "x*x"+replaceStar(str.substring(2));
		}
		else if(sb.equals(("yy")))
				{
			return "y*y"+replaceStar(str.substring(2));
		}else {
			return str.charAt(0)+replaceStar(str.substring(1));
		}
		  
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = replaceStar(str);
		System.out.println(ans);

	}

}
