import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 12:30 to 16:00
        String input = scanner.nextLine();
        int pointerIndex = input.indexOf("to");

        System.out.println("middle point index : " + pointerIndex);
        String start = input.substring(0, pointerIndex);
        String end = input.substring(pointerIndex + 2);

        System.out.println("Total minutes : " + calculateDuration(start.trim(), end.trim()));
    }

    private static int calculateDuration(String start, String end) {
        return calculateMinutes(end) - calculateMinutes(start);
    }

    private static int calculateMinutes(String time) {
        int pointerIndex = time.indexOf(':');
        String hour = time.substring(0, pointerIndex);
        String min = time.substring(pointerIndex + 1);
        return Integer.parseInt(hour) * 60 + Integer.parseInt(min);
    }

}
