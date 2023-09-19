package aca.spring.test.DependencyInjection.controller;

import aca.spring.test.DependencyInjection.model.City;
import aca.spring.test.DependencyInjection.service.CrudCityInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CrudCityInterface cityService;


    @GetMapping("/city")
    public List<City> getAll() {
        return cityService.findAll();
    }

    @PostMapping("/city")
    public String insertCity(@RequestBody City city) {
        if (cityService.insertCity(city)) {
            return "success";
        }else{
            return "error";
        }
    }

    @PutMapping("/city")
    public String updateCity(@RequestBody City city) {
        if(cityService.updateCity(city))
            return "successful City update";
        return "error City update";
    }

}
