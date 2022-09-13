package ObserverPattern;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation(23);
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        weatherStation.add(phoneDisplay);
        phoneDisplay.display();
        weatherStation.setTemperature(25);
        phoneDisplay.display();

    }
}
