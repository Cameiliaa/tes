package TicketBooking;

import java.util.Scanner;

public class TicketBookingafter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter your destination:");
        String destination = scanner.nextLine();

        System.out.println("Enter the number of tickets:");
        int numberOfTickets = scanner.nextInt();

        System.out.println("Enter price per ticket:");
        double ticketPrice = scanner.nextDouble();

        Booking booking = new Booking(customerName, destination, numberOfTickets, ticketPrice);
        booking.printBookingDetails();

        calculateTotalPrice(numberOfTickets, ticketPrice);
    }

    public static void calculateTotalPrice(int tickets, double price) { //em
        System.out.println("Total price: " + (tickets * price)); //inlv
    }
}


class Booking {  //kelas boking
    private String name; //rename
    private String destination; //encapsulation file
    private int numOfTickets;
    private double pricePerTicket;

    public Booking(String costumername, String destination, int numOfTickets, double pricePerTicket) {
        this.name = costumername;
        this.destination = destination;
        this.numOfTickets = numOfTickets;
        this.pricePerTicket = pricePerTicket;
    }

    public void printBookingDetails() {
        System.out.println("Booking successful for " + name + " to " + destination + " for " + numOfTickets + " tickets.");
    }
}


