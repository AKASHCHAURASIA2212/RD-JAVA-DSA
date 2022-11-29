package JC1611;
import java.util.HashMap;
import java.util.Scanner;
public class FrequencyCountUsingRecursion {
	public static HashMap<Character,Integer> CountFreq(String str,int idx){
		if(idx==str.length()) {
			return new HashMap<Character,Integer>();
		}
		HashMap<Character,Integer> rans = CountFreq(str,idx+1);
		
		if(rans.get(str.charAt(idx))==null) {
			rans.put(str.charAt(idx), 1);
		}else {
			int val = rans.get(str.charAt(idx));
			rans.put(str.charAt(idx), val+1);
		}
		return rans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<Character,Integer> hm = new HashMap<>();
		hm = CountFreq(str,0);
		System.out.println(hm);

	}

}
