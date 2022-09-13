package ObserverPattern;

public class WindowDisplay implements IObserver, IDisplay{

    WeatherStation station;

    public WindowDisplay (WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        this.station.getTemperature();
        // something else
    }

    @Override
    public void display() {
        System.out.println("--Window Display--");
        System.out.println("The temperature is: " + station.getTemperature());
    }
}
