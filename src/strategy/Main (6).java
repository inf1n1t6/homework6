package strategy;

public class Main {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardStrategy("4111-1111-1111-1111", "Иван Иванов"));
        context.executePayment(1500.0);

        context.setStrategy(new PayPalStrategy("ivan@example.com"));
        context.executePayment(750.50);

        context.setStrategy(new CryptoStrategy("0xABC123DEF456", "Bitcoin"));
        context.executePayment(3200.0);

        System.out.println("\n--- Переключение стратегии на лету ---");
        context.setStrategy(new CreditCardStrategy("5500-0000-0000-0004", "Мария Петрова"));
        context.executePayment(500.0);

        System.out.println("\n--- Обработка ошибок ---");
        try {
            context.setStrategy(null);
            context.executePayment(100.0);
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            context.setStrategy(new PayPalStrategy("test@test.com"));
            context.executePayment(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
