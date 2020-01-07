public class TrainPrinter {

    public static void printTrain(Train train) {

        for (int i = 0; i < train.seatCount(); i++) {
            if (train.isSeatAvailable(i)) {
                System.out.print(" " + (i + 1) + " ");
            } else if (train.isSeatBooked(i)) {
                System.out.print("*" + (i + 1) + "*");
            } else {
                System.out.print("?" + (i + 1) + "?");
            }
        }
        System.out.println("");
    }

}
