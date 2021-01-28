package pkg_learning;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {
	
	static HashMap<Integer,BigInteger> abc = new HashMap<Integer,BigInteger>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner obj = new Scanner(System.in);
		/*
		 * Fibonacci.abc.put(3,455L); Fibonacci.abc.put(2,496L);
		 * Fibonacci.abc.put(0,456L); Fibonacci.abc.put(20,156L);
		 * System.out.println(Fibonacci.abc);
		 */
		
		  for (int i=1;i<500;i++) { System.out.println(i+": "+Fibonacci.Fibo(i)); }
		 
		
	}
	
	public static BigInteger Fibo(int n) {
		BigInteger valuereturn;
		for (int iter : Fibonacci.abc.keySet()) {
			if (iter == n)
				return Fibonacci.abc.get(n);			
		}
		if (n==1) {			
			valuereturn = BigInteger.ZERO;			
		}		
		else if (n==2) {
			valuereturn =  BigInteger.ONE;
		}
		else {
			valuereturn = Fibo(n-1).add(Fibo(n-2));
		}
		Fibonacci.abc.put(n, valuereturn);
		return valuereturn;
		
		
		
	}

}
