package org.example.controller;

import jakarta.validation.Valid;
import org.example.entity.SavedCity;
import org.example.repository.SavedCityRepository;
import org.example.dto.SavedCityRequest;
import org.example.service.WeatherService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/saved-cities")
@SecurityRequirement(name = "bearerAuth")
public class SavedCityController {

    @Autowired
    private SavedCityRepository repo;

    @Autowired
    private WeatherService weatherService;

    @PostMapping("/save")
    public SavedCity saveCity(@Valid @RequestBody SavedCityRequest request) throws IOException, InterruptedException {
        SavedCity city = new SavedCity();
        city.setCityName(request.getCityName());
        city.setNickName(request.getNickName());
        return repo.save(city);
    }

    @GetMapping
    public List<SavedCity> getAllCities() {
        return repo.findAll();
    }

    @PutMapping("/{id}")
    public SavedCity updateCity(@PathVariable Long id, @NotNull @RequestBody SavedCity updated) {
        SavedCity city = repo.findById(id).orElseThrow();
        city.setCityName(updated.getCityName());
        city.setNickName(updated.getNickName());
        return repo.save(city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
