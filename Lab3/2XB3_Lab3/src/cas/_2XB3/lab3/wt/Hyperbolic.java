package cas._2XB3.lab3.wt;

public class Hyperbolic {
	
	public static double cosh(double x) {
		return (Math.exp(x) + Math.exp(-x))/2;
	}
	
	public static double sinh(double x) {
		return (Math.exp(x) - Math.exp(-x))/2;
	}
	
	public static double tanh(double x) {
		return sinh(x)/cosh(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x= Double.parseDouble(args[0]);
		System.out.println("sinh("+ x+ ")" + "= " +sinh(x));
		System.out.println("sinh("+ x+ ")" + "= " +cosh(x));
		System.out.println("sinh("+ x+ ")" + "= " +tanh(x));
		//System.out.println("sinh(%f) = %f\n", x, sinh(x));
		//System.out.println("cosh(%f) = %f\n", x, cosh(x));
		//System.out.println("tanh(%f) = %f\n", x, tanh(x));
	}

}
