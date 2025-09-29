package org.example.service;

import org.example.dto.WeatherResponse;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.GsonBuilder;

@Service
public class WeatherService {
    public static final String API_ENDPOINT = "https://goweather.xyz/weather/";
    public static final HttpClient HTTP_CLIENT = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
        .followRedirects(HttpClient.Redirect.NORMAL)
        .build();

    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public WeatherResponse getWeather (String city) throws IOException, InterruptedException {

        String url = API_ENDPOINT + city;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = HTTP_CLIENT.send(
                request, HttpResponse.BodyHandlers.ofString());

        WeatherResponse weather = GSON.fromJson(response.body(), WeatherResponse.class);

        return weather;
    }

}
