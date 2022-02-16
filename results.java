package pascalcase;

public class results {
	

		public static void main(String[] args) {
			double p= 100;
			double c=57;
			double b= 45;
			double t=total (p,c,b);
		    pe(t);
		}
		public static void pe(double t) {
			System.out.print("%: ");
			System.out.println(t/4.5);
			double pp=t/4.5;
			if (pp<60) {
				System.out.println("failed in percentage");
			}

		}
		public static double total(double a, double b, double c) {
			System.out.print("Physics: ");
			System.out.println(a);
			System.out.print("Chemistry: ");
			System.out.println(b);
			System.out.print("Biology: ");
			System.out.println(c);
			double to=a+b+c;
			int count=0;
			if (a<90) {
				count++;
			}
			if (b<90) {
				count++;
			}
			if (c<90) {
				count++;
			}
			if(count>0) {
				System.out.println("failed "+ count);
			}
			System.out.print("Total: ");
			System.out.println(to);
			return to;
		}
		

}
