package pascalcase;

public class HelloWorld {

	public static void main(String[] args) {
		String s = printMessage();
		System.out.println("This is our first project");
		System.out.println(summ(5,6));
		System.out.println(mul(5,6));
		System.out.println(sub(5,6));
		System.out.println(div(14,5));
		System.out.println(blackjack.play(1, 20));
		results.pe(230);

	}
	public static int summ(int a,int b) {
		return a+b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static double div(double a,double b) {
		if (a<b) {
		return b/a;
		}
		else {
			System.out.println("can't divide");
					}
		return b;
	}
	
	 public static String printMessage() {
	     String message = "Hello World!";
	     return message;
	 }
}
