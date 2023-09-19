package aca.spring.test.DependencyInjection.controller;

import aca.spring.test.DependencyInjection.model.Dobavljac;
import aca.spring.test.DependencyInjection.service.DobavljacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DobavljacController {

    @Autowired
    private DobavljacService dobavljacService;

    @PostMapping("/dobavljac")
    public boolean insertDobavljac(@RequestBody Dobavljac dobavljac) {
        return dobavljacService.insertDobavljac(dobavljac);
    }
}
