package pascalcase;

public class coin {
	public static void main(String[] args) {ca(4.39,10.0);}
		
	public static void ca(double c, double a) {
		int b=(int)((a-c)*100);
		System.out.println(b);
		int twenty=0;
		int ten=0;
		int five=0;
		int two=0;
		int one=0;
		int fiftyp=0;
		int twentyp=0;
		int tenp=0;
		int fivep=0;
		int twop=0;
		int onep=0;
		while (b > 0) {
			if (b>=2000) {twenty++;b=b-2000;}
			else if (b>=1000) {ten++;b=b-1000;}
			else if (b>=500) {five++;b=b-500;}
			else if (b>=200) {two++;b=b-200;}
			else if (b>=100) {one++;b=b-100;}
			else if (b>=50) {fiftyp++;b=b-50;}
			else if (b>=20) {twentyp++;b=b-20;}
			else if (b>=10) {tenp++;b=b-10;}
			else if (b>=5) {fivep++;b=b-5;}
			else if (b>=2) {twop++;b=b-2;}
			else {onep++;b=b-1;}
		}
		System.out.println(twenty +" £20, " +ten +" £10, " +five +" £5, "+ two +" £2, " +one +" £1, "+ fiftyp +" 50p, "+twentyp +" 20p, "+tenp +" 10p, "+ fivep +" 5p, "+twop +" 2p, "+onep +" 1p");
	}
}