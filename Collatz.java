// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int highestSeed = Integer.parseInt(args[0]);
		String mode = args[1];
		if (highestSeed < 1) {
		    System.out.println("Highest seed must be a positive integer");
		    return;
		}

		for (int i = 1; i <= highestSeed; i++){
			int steps = 0;
			long n = i;
			if (n == 1){
				if (mode.charAt(0) == 'v'){
					System.out.print(n + " ");
				}
				n = n * 3 + 1;
				steps++;
			}
			while (n!= 1){
				if (n % 2 == 0){
					if (mode.charAt(0) == 'v'){
					System.out.print(n + " ");
				}
					n /= 2;
					steps++;
				}
				else {
				if (mode.charAt(0) == 'v'){
					System.out.print(n + " ");
				}
					n = n * 3 + 1;
					steps++;
				}
			}

			if (mode.charAt(0) == 'v'){
				System.out.print(1 + " ");
				steps++;
				System.out.println("(" + steps + ")");
			}

		}
		if (mode.charAt(0) == 'v'){
			System.out.println("");
		}
		System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");

	}
}
