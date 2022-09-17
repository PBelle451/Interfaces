package co.pedrobelle.curso.Interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        System.out.println("Enter rental data: ");
        System.out.println("Car model: ");
        String carModel = scanner.nextLine();
        System.out.println("Pickup (dd/MM/yyyy hh:ss): ");
        Date start = sdf.parse(scanner.nextLine());
        System.out.println("Return (dd/MM/yyyy hh:ss): ");
        Date finish = sdf.parse(scanner.nextLine());
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        System.out.println("Enter price per hour: ");
        double pricePerHour = scanner.nextDouble();
        System.out.println("Enter price per day: ");
        double pricePerDay = scanner.nextDouble();
        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        rentalService.processInvoice(cr);
        System.out.println("Invoice: ");
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().totalPayment()));
        scanner.close();
    }
}
