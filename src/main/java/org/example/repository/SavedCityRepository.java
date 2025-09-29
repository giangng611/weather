package org.example.repository;

import org.example.entity.SavedCity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavedCityRepository extends JpaRepository<SavedCity, Long> {
}
