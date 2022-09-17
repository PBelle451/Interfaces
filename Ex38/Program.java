package co.pedrobelle.curso.Ex38;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter contract data: ");
        System.out.println("Number: ");
        int number = scanner.nextInt();
        System.out.println("Date (dd/mm/yyyy): ");
        Date date = sdf.parse(scanner.next());
        System.out.println("Contract value: ");
        double totalValue = scanner.nextDouble();
        Contract contract = new Contract(number, date, totalValue);
        System.out.println("Enter number of installments: ");
        int n = scanner.nextInt();
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, n);
        System.out.println("Installments: ");
        for(Installment x : contract.getInstallments()){
            System.out.println(x);
        }
        scanner.close();
    }
}
