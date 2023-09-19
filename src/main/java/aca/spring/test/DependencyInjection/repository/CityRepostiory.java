package aca.spring.test.DependencyInjection.repository;

import aca.spring.test.DependencyInjection.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepostiory extends JpaRepository<City, Integer> {
}
