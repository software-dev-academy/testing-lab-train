public class TrainPrinter {

    public static void printTrain(Train train) {
        for (int i = 0; i < train.size(); i++) {
            if (train.isSeatAvailable(i)) {
                System.out.println(" " + (i + 1) + " ");
            } else if (train.isSeatBooked(i)) {
                System.out.println("*" + (i + 1) + "*");
            } else {
                System.out.println("?" + (i + 1) + "?");
            }
        }
    }

}
