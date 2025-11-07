//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String cheer = args[0];
	int times = Integer.parseInt(args[1]);
        
        // Convert the cheer string to uppercase to handle both cases
        cheer = cheer.toUpperCase();

        // Loop to print the cheer of every character in the string
        for (int i = 0; i < cheer.length(); i++) {
                if (cheer.charAt(i) == 'A' || cheer.charAt(i) == 'E' || cheer.charAt(i) == 'F' || cheer.charAt(i) == 'H' || cheer.charAt(i) == 'I' || cheer.charAt(i) == 'L' || cheer.charAt(i) == 'M' || cheer.charAt(i) == 'N' || cheer.charAt(i) == 'O' || cheer.charAt(i) == 'R' || cheer.charAt(i) == 'S' || cheer.charAt(i) == 'X') {
                        System.out.println("Give me an " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!");
                }
                else {
                        System.out.println("Give me a  " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!");      
                }
        }
        
        System.out.println("What does that spell?");

        // Loop to print the cheer multiple times
        for (int j = 0; j < times; j++) {
                System.out.println(cheer + "!!!");
        }


        }
}
