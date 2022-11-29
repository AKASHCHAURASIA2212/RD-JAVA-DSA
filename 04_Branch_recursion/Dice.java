
public class Dice {
	
	public static  void getDice(String asf,int curr,int tar) {
		if(curr>tar) {
			return;
		}
		if(curr==tar) {
			System.out.print(asf+" ");
			return;
		}
		
		for(int i=1;i<=6;i++) {
			getDice(asf+i,curr+i,tar);
		}
	}
	public static void main(String[] args) {
	   getDice("",0,648);
	}

}
