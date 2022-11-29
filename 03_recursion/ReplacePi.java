
public class ReplacePi {

	public static String replacePi(String str,int idx) {
		if(idx==str.length())
		{
			return "";
		}
		
		if(str.charAt(idx)=='p' && str.charAt(idx+1)=='i') {
			return "3.14"+replacePi(str,idx+2);
		}else {
			return str.charAt(idx)+replacePi(str,idx+1);
		}
		
	}
	public static void main(String[] args) {
		
		String ans = replacePi("pi&d$^pi",0);
		System.out.println(ans);

	}

}
