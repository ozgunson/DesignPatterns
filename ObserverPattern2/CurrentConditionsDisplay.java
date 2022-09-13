package ObserverPattern2;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private ISubject weatherData;

    public CurrentConditionsDisplay () {
        weatherData = new WeatherData();
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float hum, float pres) {
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = pres;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " C degrees and " + humidity +
                " % humidity and pressure: " + pressure);
    }
}
