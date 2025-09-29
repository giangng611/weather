package org.example.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.example.dto.WeatherResponse;
import org.example.service.WeatherService;
import org.example.repository.SavedCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("api/weather")
@SecurityRequirement(name = "bearerAuth")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private SavedCityRepository savedCityRepository;

    @GetMapping
    public WeatherResponse getWeather (@RequestParam String city) throws IOException, InterruptedException {
        return weatherService.getWeather(city);
    }


}
