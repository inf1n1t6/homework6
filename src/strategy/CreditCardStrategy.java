package strategy;

public class CreditCardStrategy implements IPaymentStrategy {

    private final String cardNumber;
    private final String owner;

    public CreditCardStrategy(String cardNumber, String owner) {
        this.cardNumber = cardNumber;
        this.owner = owner;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата банковской картой " + cardNumber + " на имя " + owner + ": " + amount + " руб.");
    }
}
