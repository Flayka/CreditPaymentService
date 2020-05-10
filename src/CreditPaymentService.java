public class CreditPaymentService {
    public double calculate(double credit, double month) {
        double annualRate = 9.99d;
        double monthRate = annualRate/12/100;

        double annuityCoefficient = monthRate*Math.pow(1+monthRate,month)/(Math.pow(1+monthRate,month)-1);
        double periodicPayment = annuityCoefficient*credit;
    return periodicPayment;
    }
}