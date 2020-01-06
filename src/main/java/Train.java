public class Train {

    /**
     * Array representing seats. Seat number is given by index (+1) and the seat status is given by the integer.
     * 0 is available, 1 is booked.
     */
    private int[] seats;

    /**
     * Create a train with the specified number of seats. All seats will be available.
     * @param seats
     */
    public Train(int seats) {
        this.seats = new int[seats];
    }

    /**
     * Create a train according to the specified seat map. The seat map is a string which must be a series of '0's or
     * '1's without any separator. There will be an equal amount of seats as the string length and each seat will be
     * assigned a status according to the corresponding character. For example, input "101" creates a train with three
     * seats where seat 1 is booked, seat 2 is available and seat 3 is booked.
     * @param seatMap
     * @throws IllegalArgumentException if the string can not be parsed as a valid seat map.
     */
    public Train(String seatMap) {
        this.seats = new int[seatMap.length()];
        for (int i = 0; i < seatMap.length(); i++) {
            if (seatMap.charAt(i) == '0') {
                seats[i] = 0;
            } else if (seatMap.charAt(i) == '1') {
                seats[i] = 1;
            } else {
                throw new IllegalArgumentException("Seat map string contains illegal character at index " + i);
            }
        }
    }



}
