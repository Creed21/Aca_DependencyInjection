package aca.spring.test.DependencyInjection.service;

import aca.spring.test.DependencyInjection.model.City;
import aca.spring.test.DependencyInjection.repository.CityRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class CityServiceImpl2 implements CrudCityInterface {
    @Autowired
    private CityRepostiory cityRepostiory;

    @Override
    public boolean insertCity(City city) {
        return cityRepostiory.save(city).getId() != null;
    }

    @Override
    public List<City> findAll() {
        return cityRepostiory.findAll();
    }

    @Override
    public boolean updateCity(City city) {
        return cityRepostiory.save(city).getId() != null;
    }
}
