package problem1;

public class SeatPlan {

    private final boolean[][] seats;

    public SeatPlan(int rows, int columns) {
        seats = new boolean[rows][columns];
    }

    public boolean reserve(String seatNumber) throws IllegalArgumentException {
        String safeSeat = seatNumber.toUpperCase();
        int column = safeSeat.charAt(0) - 'A';
        int row = safeSeat.charAt(1) - '1';

        // Check if seat is out of bounds
        if (row >= seats.length || column >= seats[0].length) {
            throw new IllegalArgumentException("Seat is out of bounds");
        }

        // If already reserved
        if (seats[row][column]) {
            return false;
        } else {
            seats[row][column] = true;
            return true;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // Header
        sb.append(String.format("%-2s%-2s", "", " "));
        for (int column = 0; column < seats[0].length; column++) {
            sb.append(String.format("%-2s%-2s", "", (char) ('A' + column)));
        }
        sb.append("\n");

        for (int row = 0; row < seats.length; row++) {
            boolean[] seat = seats[row];
            // Row number
            sb.append(String.format("%-2s%-2d", "", row + 1));
            for (int column = 0; column < seats[0].length; column++) {
                if (seat[column]) {
                    sb.append(String.format("%-2s%-2s", "|", "x"));
                } else {
                    sb.append(String.format("%-2s%-2s", "|", " "));
                }
            }
            sb.append(String.format("%-2s", "|"));
            sb.append('\n');
        }
        return sb.toString();
    }
}
