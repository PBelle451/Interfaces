package co.pedrobelle.curso.Ex38;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);
}
