import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your destination:");
        String destination = scanner.nextLine();

        System.out.println("Enter the number of tickets:");
        int numOfTickets = scanner.nextInt();

        System.out.println("Enter price per ticket:");
        double pricePerTicket = scanner.nextDouble();

        double totalPrice = numOfTickets * pricePerTicket;  //em
        System.out.println("Total price: " + totalPrice);  //inva

        System.out.println("Booking successful for " + name + " to " + destination + " for " + numOfTickets + " tickets.");
    }
}
