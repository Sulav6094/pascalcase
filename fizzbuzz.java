package pascalcase;

public class fizzbuzz {
	public static void main(String[] args) {
		int a=15;
		String b= fhf(a);
		System.out.println(b);
	}
	public static String fhf(int a) {
		String b;
		if(a%3==0) {
			b="Fizz";
			if (a%5==0) {b=b+"Buzz";}	
		}	
		else if(a%5==0) {b="Buzz";}
		else {b=String.valueOf(a);}
		return b;
	}

}
