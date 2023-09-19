package aca.spring.test.DependencyInjection.service;

import aca.spring.test.DependencyInjection.model.City;
import aca.spring.test.DependencyInjection.repository.CityRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements CrudCityInterface {

    /**
     * service sadrzi business logic i obavlja posao
     */

    @Autowired
    private CityRepostiory cityRepostiory;

    public boolean insertCity(City city) {
        if (city.getId() == null) {
            return false;
        } else {
            if(cityRepostiory.findById(city.getId()).isEmpty()) {
                cityRepostiory.save(city);
                return true;
            }
            return false;
        }
    }

    public List<City> findAll() {
        return cityRepostiory.findAll();
    }

    public boolean updateCity(City city) {
        if(cityRepostiory.findById(city.getId()).isEmpty())
            return false; // grad ne postoji

        cityRepostiory.save(city); // grad postoji -> uradi update
        return true;
    }
}
