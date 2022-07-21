import javax.naming.spi.DirStateFactory.Result;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double persent = 9.99; // проценты
        double month = 36; // срок в месяцах
        double sum = 1_000_000; // сумма
        double payment = service.calculate(p, m, s);
        System.out.println("сумма платежа = " + Math.round(payment));
    }
}
