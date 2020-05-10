public class Main {
    public static void main(String[] args) {
        double credit = 1_000_000;
        double month;

        CreditPaymentService service = new CreditPaymentService();

        double periodicPaymentFor12MonthPeriod = service.calculate(credit, 12);
        System.out.println(Math.round(periodicPaymentFor12MonthPeriod));

        double periodicPaymentFor24MonthPeriode = service.calculate(credit, 24);
        System.out.println(Math.round(periodicPaymentFor24MonthPeriode));

        double periodicPaymentFor36MonthPeriod = service.calculate(credit, 36);
        System.out.println(Math.round(periodicPaymentFor36MonthPeriod));
}
}