
import java.util.ArrayList;

public class getPermutation {
	
	
	static ArrayList<String> getStr(String str){
		if(str.length()==0) {
			var al = new ArrayList<String>();
			al.add("");
			return al;
		}
		var myAns = new ArrayList<String>();
		
		var ch = str.charAt(0);
		
		var rans = getStr(str.substring(1));
		// loop for trevers recursive list
		for(int i=0;i<rans.size();i++) {
                // loop for place before and after
				StringBuffer sb = new StringBuffer(rans.get(i));
				StringBuffer temp = sb ;
				int len  = sb.length();
				for(int j=0;j<=len;j++){
					sb = new StringBuffer(rans.get(i));
					sb.insert(j,ch);
					myAns.add(sb.toString());
				}
		}
		
		return myAns;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
          var ans = getStr("ABC");
          System.out.println(ans);
          System.out.println(ans.size());
	}

}

