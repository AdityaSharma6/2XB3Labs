package cas._2XB3.lab3.wt;

public class Euclid {
	
	public static int gcd(int p, int q) {
		// Base Case
		if (p == 0) {
			return q;
		}
		if (q == 0) {
			return p;
		}
		
		// Recursive Case
		if (p > q) {
			int modulus = p%q;
			return gcd(q, modulus);
		} else {
			int modulus = q%p;
			return gcd(p, modulus);
		}
	}
	
	public static int gcd2(int p, int q) {
		if ((p == 0) || (q == 0)) return 0;
		while (q != 0) {
			int modulus = p%q;
			p = q;
			q = modulus;
		}
		return p;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p =Integer.parseInt(args[0]);
		int q =Integer.parseInt(args[1]);
		int d  =gcd(p,q);
		int d2 =gcd2(p,q);
		System.out.println("gcd("+p +", "+q +") = "+d);
		System.out.println("gcd("+p +", "+q +") = "+d2);
	}

}
