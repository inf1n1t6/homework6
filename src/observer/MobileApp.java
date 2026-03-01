package observer;

public class MobileApp implements IObserver {

    private final String userName;

    public MobileApp(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String currency, double newRate) {
        System.out.println("[Мобильное приложение] Уведомление для " + userName +
                ": курс " + currency + " изменился на " + newRate);
    }
}
