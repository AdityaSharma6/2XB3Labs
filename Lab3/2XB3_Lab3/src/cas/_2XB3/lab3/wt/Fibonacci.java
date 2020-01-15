package cas._2XB3.lab3.wt;

public class Fibonacci {
	
	public static long fibonacci(int n) {
		if (n==0) return 1;
		if (n == 1) return 1;
		if (n < 0) return 0;
		return (fibonacci(n-1)) + (fibonacci(n-2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fib = fibonacci(5);
		System.out.println(fib);
	}

}
