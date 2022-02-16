package pascalcase;

public class unique {
	public static void main(String[] args) {
		int a=3;
		int b=1;
		int c=2;
		System.out.println(usum(a,b,c));
	}
	public static int usum(int a, int b, int c) {
		if (a !=b) {
			if (a==c) {
				return b;}
			else if (b==c) {return a;}	
			else {return a+b+c;}
		}
		else if(a != c) {return a+c;}
		else {return 0;}
	}
}
