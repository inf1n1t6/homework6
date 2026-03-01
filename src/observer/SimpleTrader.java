package observer;

public class SimpleTrader implements IObserver {

    private final String name;

    public SimpleTrader(String name) {
        this.name = name;
    }

    @Override
    public void update(String currency, double newRate) {
        System.out.println("[Трейдер " + name + "] Получено обновление: " + currency + " = " + newRate);
    }
}
