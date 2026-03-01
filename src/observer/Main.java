package observer;

public class Main {

    public static void main(String[] args) {
        CurrencyExchange exchange = new CurrencyExchange();

        SimpleTrader trader = new SimpleTrader("Иван");
        AlertSystem alert = new AlertSystem(90.0);
        MobileApp app = new MobileApp("Мария");

        exchange.subscribe(trader);
        exchange.subscribe(alert);
        exchange.subscribe(app);

        exchange.setRate("USD", 85.0);
        exchange.setRate("USD", 92.0);
        exchange.setRate("EUR", 95.0);

        System.out.println("\n--- Иван отписывается ---");
        exchange.unsubscribe(trader);
        exchange.setRate("USD", 88.0);
    }
}
