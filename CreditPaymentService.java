public class CreditPaymentService {
    public double calculate(double p, double m, double s) {
        double i = p / (12 *100); // проценты в месяц
        double a = Math.pow(1 + i, m); // возведение в степень
        double k = (i * a)/(a-1);
        double e = s * k;
        return e;
    }
}