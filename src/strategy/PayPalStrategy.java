package strategy;

public class PayPalStrategy implements IPaymentStrategy {

    private final String email;

    public PayPalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal (" + email + "): " + amount + " руб.");
    }
}
