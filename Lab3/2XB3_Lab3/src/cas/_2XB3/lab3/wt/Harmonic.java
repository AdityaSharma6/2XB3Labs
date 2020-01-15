package cas._2XB3.lab3.wt;

public class Harmonic {
	public static double harmonic(int n) {
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += 1.0/i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			int arg = Integer.parseInt(args[i]);
			double sum = harmonic(arg);
			System.out.println(sum);
		}
	}

}
