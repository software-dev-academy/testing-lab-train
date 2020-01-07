


public class Train {

    /**
     * Array representing seats. Each seat's status is given by the integer value.
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

    /**
     * Return true if seat given by index is available.
     * @param seatIndex
     * @return
     */
    public boolean isSeatAvailable(int seatIndex) {
        return seats[seatIndex] == 0;
    }

    /**
     * Return true if seat given by index is booked.
     * @param seatIndex
     * @return
     */
    public boolean isSeatBooked(int seatIndex) {
        return seats[seatIndex] == 1;
    }

    /**
     * Return the amount of seats.
     * @return
     */
    public int seatCount() {
        return seats.length;
    }

    /**
     * Return the amount of booked seats.
     * @return
     */
    public int bookedSeatCount() {
        int c = 0;
        for (int i = 0; i < seats.length; i++) {
            if (isSeatBooked(i)) {
                c++;
            }
        }
        return c;
    }

    public int availableSeatCount() {
        return seatCount() - bookedSeatCount();
    }

    /**
     * Book seat at specified index. Return false if seat is already booked, true otherwise.
     * @return false if the seat is already booked, true otherwise.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= seatCount())
     */
    public boolean bookSeat(int index) {
        if (index < 0 || index >= seatCount()) {
            throw new IndexOutOfBoundsException();
        }

        if (isSeatBooked(index)) {
            return false;
        }

        seats[index] = 1;
        return true;
    }

    /**
     * Book first n available seats where n is the specified number. Returns false if no seats were booked. This happens
     * if the amount of seats to be booked is larger than the amount of available seats or if the amount of seats to be
     * booked is less than 1.
     * @param seatsToBook
     */
    public boolean bookFirstAvailableSeats(int seatsToBook) {
        if (seatsToBook > availableSeatCount() || seatsToBook < 1) {
            return false;
        }

        int seatsBooked = 0;
        int index = 0;
        while (seatsBooked < seatsToBook && index < seatCount()) {
            // TODO insert index++ bug here
            if (isSeatAvailable(index)) {
                bookSeat(index);
                seatsBooked++;
            }
            index++;
        }
        return true;
    }



}
