package JC1611;

import java.util.ArrayList;

public class Substr {
	
	static ArrayList<String> getSubStr(String str){
//		if(str.length()==0) {
//			var al = new ArrayList<String>();
//			al.add("");
//			return al;
//		}
//		var myAns = new ArrayList<String>();
//		var ch = str.charAt(0);
//		var rans = getSubStr(str.substring(1));
//		
//		for(int i=0;i<rans.size();i++) {
//			myAns.add(rans.get(i));
////			myAns.add(ch+rans.get(i));
//		}
//		
//		for(int i=0;i<rans.size();i++) {
//			myAns.add(ch+rans.get(i));
//		}
//		return myAns;	
		ArrayList<String> ans = new ArrayList<>();
		ans.add("");
		for(int i=0;i<str.length();i++) {
			String mystr = "";
			for(int j=i+1;j<=str.length();j++) {
				mystr+=str.substring(i,j);
				ans.add(mystr);
				mystr="";
				}
		}
		return ans;
	}

	public static void main(String[] args) {
          var ans = getSubStr("abc");
          System.out.println(ans);
	}

}
