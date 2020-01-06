public class Start {

    public static void main(String[] args) {
        Train train1 = new Train("101");
        Train train2 = new Train(4);

        TrainPrinter.printTrain(train1);
        TrainPrinter.printTrain(train2);
    }
}
