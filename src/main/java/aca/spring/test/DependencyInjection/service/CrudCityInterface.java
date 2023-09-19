package aca.spring.test.DependencyInjection.service;

import aca.spring.test.DependencyInjection.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface CrudCityInterface {
    boolean insertCity(City city);
    List<City> findAll();
    boolean updateCity(City city);
}
