import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();


        System.out.println();
        System.out.println("срок кредита: 1 год / сумма кредита: 1_000_000 р. / процентная ставка: 9,99%");
        System.out.println("ежемесячный платеж: " + service.calculate(1_000_000, 1));

        System.out.println();
        System.out.println("срок кредита: 2 года / сумма кредита: 1_000_000 р. / процентная ставка: 9,99%");
        System.out.println("ежемесячный платеж: " + service.calculate(1_000_000, 2));

        System.out.println();
        System.out.println("срок кредита: 3 года / сумма кредита: 1_000_000 р. / процентная ставка: 9,99%");
        System.out.println("ежемесячный платеж: " + service.calculate(1_000_000, 3));
    }
}