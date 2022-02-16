package pascalcase;

public class flowchart {

	public static void main(String[] args) {
				int a=12;
				int b=9;
				boolean c= true;
				int ss=mul(a,b,c);
				System.out.println(ss);
	}

	public static int mul(int a,int b,boolean c) {
		if (c) {
			return a+b;
		}
		else {
			return a*b;
		}
	}

}
