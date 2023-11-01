public class CreditPaymentService {
    public int calculate(int credit, int term) {
        int n = term*12;
        double persent = 9.99;
        double m = persent/12/100;

        double annuity =  m * Math.pow((1 + m), n)/(Math.pow((1 + m), n) - 1);
        double payment = credit*annuity;
        return (int) payment;




    }

}
