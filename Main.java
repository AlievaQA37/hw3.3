import javax.naming.spi.DirStateFactory.Result;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double p = 9.99; // проценты
        double m = 12; // срок в месяцах
        double s = 1_000_000; // сумма
        double e = service.calculate(p, m, s);
        System.out.println("сумма платежа = " + Math.round(e));
    }
}
