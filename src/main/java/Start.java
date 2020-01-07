import java.util.Scanner;

public class Start {

    private static Scanner scanner = new Scanner(System.in);

    public static void printIntro(Train train) {
        System.out.println("Hello and welcome to the train booking system. Below you can book seats for a train" +
                "going to Kvarnamåla just in time for the tractor convention you all have been waiting for!");

        TrainPrinter.printTrain(train);
    }

    public static void main(String[] args) {
        Train train = new Train("X22", "101");
        printIntro(train);

        TrainPrinter.printTrain(train);
    }

    public static void mainMenu() {
        System.out.println("'b' to book");
        System.out.println("'c' to cancel a booking");
        System.out.println("'v' to view train seats");
        System.out.println("'h' to see available commands again");
        System.out.println("'q' to quit");

        String line = scanner.nextLine().strip();
        switch (line) {
            case "b":
//                book();
            case "c":
        }
    }

    public static void bookMenu() {
        System.out.println("Here are your options");
        System.out.println("1. Book first best ticket");
        System.out.println("2. Choose seat to book");

    }
}
