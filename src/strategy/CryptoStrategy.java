package strategy;

public class CryptoStrategy implements IPaymentStrategy {

    private final String walletAddress;
    private final String currency;

    public CryptoStrategy(String walletAddress, String currency) {
        this.walletAddress = walletAddress;
        this.currency = currency;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата криптовалютой " + currency + " на кошелёк " + walletAddress + ": " + amount + " руб.");
    }
}
