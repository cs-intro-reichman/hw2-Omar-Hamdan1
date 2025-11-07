// Computes an approximation of PI.
public class CalcPi {
    public static void main(String[] args) {
        int times = Integer.parseInt(args[0]);
        double piApproximation = 0.0;
        double numerator = 3.0;
        for (int i = 0; i < times; i++) {
            // We subtract the even terms and add the odd terms
            if (i % 2 == 0) {
                piApproximation -= 1.0/numerator;
            } else {
                piApproximation += 1.0/numerator;
            }
            numerator += 2.0;
        }
        piApproximation *= 4;
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + piApproximation);
	}
}
