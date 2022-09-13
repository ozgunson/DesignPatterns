package ObserverPattern;

import java.util.ArrayList;

public class WeatherStation implements IObservable {

    private ArrayList<IObserver> observers = new ArrayList<>();
    private int temperature;

    public WeatherStation (int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void add(IObserver o) {
        observers.add(o);
    }

    @Override
    public void remove(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
