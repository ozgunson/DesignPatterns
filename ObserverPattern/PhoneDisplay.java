package ObserverPattern;

public class PhoneDisplay implements IObserver, IDisplay {

    WeatherStation station;

    public PhoneDisplay (WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        this.station.getTemperature();
    }

    @Override
    public void display() {
        System.out.println("--Phone Display--");
        System.out.println("The temperature is: " + station.getTemperature());
    }
}
