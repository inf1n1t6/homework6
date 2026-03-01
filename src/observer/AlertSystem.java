package observer;

public class AlertSystem implements IObserver {

    private final double threshold;

    public AlertSystem(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(String currency, double newRate) {
        if (newRate > threshold) {
            System.out.println("[Система оповещений] ВНИМАНИЕ! " + currency +
                    " превысил порог " + threshold + "! Текущий курс: " + newRate);
        }
    }
}
