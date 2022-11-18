package co.pedrobelle.curso.Ex40;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Months: ");
        int months = scanner.nextInt();
        UsaInterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);
        System.out.println("Payment after " + months + " months");
        System.out.println(String.format("%.2f", payment));
        scanner.close();
    }

}
