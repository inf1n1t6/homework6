package strategy;

public class PaymentContext {

    private IPaymentStrategy strategy;

    public void setStrategy(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Способ оплаты не выбран!");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше 0!");
        }
        strategy.pay(amount);
    }
}
