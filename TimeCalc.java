public class TimeCalc {
    public static void main(String[] args) {
        String timeGiven = args[0]; // e.g., "02:30 PM"
        int minutesToAdd = Integer.parseInt(args[1]); // e.g., 150
        int hours;
        int minutes;
        if (timeGiven.length() == 0) {
            System.out.println("Invalid time format");
            return;
        }
        else if (timeGiven.charAt(2) != ':'){
            System.out.println("Invalid time format");
            return;
        }
        else {
            hours = Integer.parseInt("" + timeGiven.charAt(0) + timeGiven.charAt(1));
            minutes = Integer.parseInt("" + timeGiven.charAt(3) + timeGiven.charAt(4));
        }
        if (hours < 0 || hours > 24 || minutes < 0 || minutes > 59) {
            System.out.println("Time out of range");
            return;
        }
        int totalMinutes = hours * 60 + minutes + minutesToAdd;
        hours = totalMinutes / 60;
        minutes = totalMinutes - (hours * 60);
        System.out.printf("%02d:%02d\n", hours % 24, minutes);
    }
}
