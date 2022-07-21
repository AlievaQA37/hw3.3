public class CreditPaymentService {
    public double calculate(double persent, double month, double sum) {
        double monthlyInterest = persent / (12 * 100); // проценты в месяц
        double i = Math.pow(1 + monthlyInterest, month); // возведение в степень
        double annuity = (monthlyInterest * i) / (i - 1);
        double payment = sum * annuity;
        return payment;
    }
}