package org.example;
import java.util.Scanner;
import java.util.List;
import org.example.dto.WeatherResponse;
import org.example.service.WeatherService;
import org.example.dto.Forecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    /*
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a city name: ");
        String city = scanner.nextLine();

        WeatherService service = new WeatherService();
        WeatherResponse weather = service.getWeather(city);
        List<Forecast> forecast = weather.getForecast();

        System.out.println("Temp: " + weather.getTemperature());
        System.out.println("Wind: " + weather.getWind());
        System.out.println("Description: " + weather.getDescription());
        System.out.println("Forecast: ");

        for (int i = 0; i < forecast.size(); i++) {
            Forecast f = forecast.get(i);
            System.out.println("\tDay: " + f.getDay());
            System.out.println("\tTemp: " + f.getTemperature());
            System.out.println("\tWind: " + f.getWind());
            System.out.println();
        }

    } */
}