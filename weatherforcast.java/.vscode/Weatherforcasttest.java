public class WeatherForecastTest {
    public static void main(String[] args) {
        WeatherForecast w1 = new WeatherForecast();
        WeatherForecast w2 = new WeatherForecast(32, "snowy");

        System.out.println("Default temp: " + w1.getTemperature());
        System.out.println("Celsius: " + w1.convertToCelsius());

        w2.setTemperature(100);
        w2.setSkyCondition("cloudy");

        System.out.println(w2.getTemperature());
        System.out.println(w2.getSkyCondition());
    }
}javadoc WeatherForecast.java WeatherForecastTest.java
/**
 * The WeatherForecast class represents a weather forecast with temperature and sky condition.
 */
public class WeatherForecast 