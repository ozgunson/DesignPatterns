package ObserverPattern2;

import java.util.ArrayList;

public class WeatherData implements ISubject {

    private ArrayList<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private boolean changed;

    public WeatherData () {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void setChanged() {
        changed = true;
    }

    @Override
    public void notifyObservers() {

        if(changed) {
            for (IObserver observer : observers) {
                observer.update(temperature, humidity, pressure);
            }
        }
        changed = false;
    }

    public void measurementsChanged () {
        setChanged();
        notifyObservers();
    }

    public void setMeaurements (float temp, float hum, float pres) {
        temperature = temp;
        humidity = hum;
        pressure = pres;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity () {
        return humidity;
    }

    public float getPressure () {
        return pressure;
    }
}
