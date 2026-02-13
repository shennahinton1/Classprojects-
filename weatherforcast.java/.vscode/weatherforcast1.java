**
 * The WeatherForecast class represents a simple weather forecast.
 * It stores temperature in Fahrenheit and sky conditions.
 * 
 * Default temperature is 70°F.
 * Default sky condition is "sunny".
 * 
 * @author YourName
 * @version 1.0
 */
public class WeatherForecast {

    /** Temperature in Fahrenheit */
    private double temperature;

    /** Sky condition (sunny, snowy, cloudy, rainy) */
    private String skyCondition;

        /**
        * Constructs a WeatherForecast with default values.
    
      
     * Default constructor.
     * Sets temperature to 70°F and sky condition to "sunny".
     */
    public WeatherForecast() {
        this.temperature = 70.0;
        this.skyCondition = "sunny";
    }

    /**
     * Overloaded constructor.
     * 
     * @param temperature Temperature in Fahrenheit
     * @param skyCondition Sky condition (sunny, snowy, cloudy, rainy)
     */
    public WeatherForecast(double temperature, String skyCondition) {
        this.temperature = temperature;
        this.skyCondition = skyCondition;
    }

    /**
     * Returns the temperature in Fahrenheit.
     * 
     * @return temperature in Fahrenheit
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Sets the temperature in Fahrenheit.
     * 
     * @param temperature the new temperature
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Returns the sky condition.
     * 
     * @return sky condition
     */
    public String getSkyCondition() {
        return skyCondition;
    }

    /**
     * Sets the sky condition.
     * 
     * @param skyCondition the new sky condition
     */
    public void setSkyCondition(String skyCondition) {
        this.skyCondition = skyCondition;
    }

    /**
     * Converts the current Fahrenheit temperature to Celsius.
     * 
     * Formula: (F - 32) * 5 / 9
     * 
     * @return temperature in Celsius
     */
    public double convertToCelsius() {
        return (temperature - 32) * 5.0 / 9.0;
    }

    /**
     * Returns a string representation of the weather forecast.
     * 
     * @return formatted weather information
     */
    @Override
    public String toString() {
        return "Temperature: " + temperature + "°F (" 
                + convertToCelsius() + "°C), Sky: " + skyCondition;
    }
}javadoc WeatherForecast.java


