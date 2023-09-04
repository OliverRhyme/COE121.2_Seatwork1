package problem1;

import java.util.Scanner;

public class Problem1 {

    private static final int COLUMNS = 10;
    private static final int ROWS = 4;

    public static void main(String[] args) {
        SeatPlan seatPlan = new SeatPlan(ROWS, COLUMNS);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter seat numbers separated by commas (e.g. A1,B2,C3):");
        String input = scanner.nextLine();
        String[] seats = input.split(",");

        try {
            for (String seatNumber : seats) {
                String cleanSeatNumber = seatNumber.trim();
                boolean isAlreadyReserved = !seatPlan.reserve(cleanSeatNumber);
                if (isAlreadyReserved) {
                    System.out.println("Seat " + seatNumber + " is already reserved");
                }
            }
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }

        System.out.println("Seat plan:");
        System.out.println(seatPlan);
    }
}