package pascalcase;

public class blackjack {
	public static void main(String[] args) {
	System.out.println(play(15, 15));
	}
	public static int play(int a, int b) {
		if (a<22 && a>0) {
			if (b<22 && b>0) {
				if (a >b){return a;}
				else {return b;}
				}
			else {return a;}
		}
		else if(b<22 && b>0){return b;}	
		else {return 0;}
			
		}

	}
