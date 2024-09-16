package in.Cdac.Array;

import java.util.Scanner;

class Airplane {
    private char[][] seats;  

    public Airplane(int rows, int columns) {
        seats = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = 'A';  
            }
        }
    }

    public void bookSeat(int row, int column) {
        if (seats[row][column] == 'A') {
            seats[row][column] = 'O';  
            System.out.println("Seat booked.");
        } else {
            System.out.println("Seat already booked.");
        }
    }

    public void cancelBooking(int row, int column) {
        if (seats[row][column] == 'O') {
            seats[row][column] = 'A';  
            System.out.println("Booking cancelled.");
        } else {
            System.out.println("Seat is not booked.");
        }
    }

    public void checkSeat(int row, int column) {
        if (seats[row][column] == 'A') {
            System.out.println("Seat is available.");
        } else {
            System.out.println("Seat is occupied.");
        }
    }

    public void showSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
    public boolean processChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                showSeats();  
                break;
            case 2:
                System.out.print("Enter row to book: ");
                int bookRow = scanner.nextInt();
                System.out.print("Enter column to book: ");
                int bookColumn = scanner.nextInt();
                bookSeat(bookRow, bookColumn);  
                break;
            case 3:
                System.out.print("Enter row to cancel booking: ");
                int cancelRow = scanner.nextInt();
                System.out.print("Enter column to cancel booking: ");
                int cancelColumn = scanner.nextInt();
                cancelBooking(cancelRow, cancelColumn);  
                break;
            case 4:
                System.out.print("Enter row to check availability: ");
                int checkRow = scanner.nextInt();
                System.out.print("Enter column to check availability: ");
                int checkColumn = scanner.nextInt();
                checkSeat(checkRow, checkColumn);  
                break;
            case 5:
                return false; 
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
        return true; 
    }
}

public class Program_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        Airplane airplane = new Airplane(rows, columns);  

        int choice;
        boolean continueRunning = true;
        while (continueRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Display seating chart");
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel a booking");
            System.out.println("4. Check seat availability");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            continueRunning = airplane.processChoice(choice, scanner);
        }

        System.out.println("Exiting...");
        scanner.close();
    }
}
