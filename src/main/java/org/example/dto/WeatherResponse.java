package org.example.dto;

import java.util.List;

public class WeatherResponse {
    private String temperature;
    private String wind;
    private String description;
    private List<Forecast> forecast;

    public String getTemperature() { return temperature; }
    public String getWind() { return wind; }
    public String getDescription() { return description; }
    public List<Forecast> getForecast() { return forecast; }
}
