/**************************************************************
 * 
 * 	fibonacci
 * 
 * 		Computes the first n fibonacci numbers
 * 
 **************************************************************/

public class fibonacci {
	
	/**
	 * main
	 * 
	 * 
	 * @param args - args[0] is the number of fibonacci numbers to find
	 */
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("Please type a number after fibonacci the next time you run this program.");
			System.exit(0);
		}

		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println(args[0] + " is not a number.");
			System.exit(0);
		}
		if (n < 1) {
			System.out.println("The number must be greater than 0.");
			System.exit(0);
		}

		System.out.print("The fibonacci number at " + args[0] + " is: " + recursiveFibonacci(Integer.parseInt(args[0])));
		System.out.println();

		System.out.println("The sequence of fibonacci numbers at " + args[0] + " is: ");
		iterativeFibonacci(Integer.parseInt(args[0]));
		
	}


	/**
	 * iterativeFibonacci
	 * 		iteratively computes the first n fibonacci numbers
	 * 
	 * @param n - the number of fibonacci numbers to find. must be non-negative.
	 */
	public static void iterativeFibonacci(int n) {
		int fibo = 0;
		int fiba = 1;
		for(int i=0; i<n; i++) {
			int saveFibo = fibo;
			fibo = fiba;
			fiba = saveFibo + fiba;
			System.out.print(fibo + "  ");
		}
		System.out.println();
	}

	/**
	 * recursiveFibonacci
	 * 		recursively computes the first n fibonacci numbers
	 * 
	 * @param n - the number of fibonacci numbers to find. must be non-negative.
	 * @return and int of the fibonacci spot
	 */
	public static int recursiveFibonacci(int n) {
		if(n<2){
			return n;
		} else {
			return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
		}
	}

}