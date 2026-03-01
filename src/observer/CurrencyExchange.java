package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyExchange implements ISubject {

    private final Map<String, Double> rates = new HashMap<>();
    private final List<IObserver> observers = new ArrayList<>();

    @Override
    public void subscribe(IObserver observer) {
        observers.add(observer);
        System.out.println("[Биржа] " + observer.getClass().getSimpleName() + " подписан");
    }

    @Override
    public void unsubscribe(IObserver observer) {
        observers.remove(observer);
        System.out.println("[Биржа] " + observer.getClass().getSimpleName() + " отписан");
    }

    @Override
    public void notifyObservers(String currency, double newRate) {
        for (IObserver observer : observers) {
            observer.update(currency, newRate);
        }
    }

    public void setRate(String currency, double newRate) {
        double oldRate = rates.getOrDefault(currency, 0.0);
        rates.put(currency, newRate);
        System.out.println("\n[Биржа] Курс " + currency + ": " + oldRate + " → " + newRate);
        notifyObservers(currency, newRate);
    }
}
