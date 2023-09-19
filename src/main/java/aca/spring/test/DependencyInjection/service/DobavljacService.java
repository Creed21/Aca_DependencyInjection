package aca.spring.test.DependencyInjection.service;

import aca.spring.test.DependencyInjection.model.Dobavljac;
import aca.spring.test.DependencyInjection.repository.DobavljacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DobavljacService {

    @Autowired
    private DobavljacRepository dobavljacRepository;

    public boolean insertDobavljac(Dobavljac dobavljac) {
        Optional<Dobavljac> dobavljacDb = dobavljacRepository.findById(dobavljac.getId());
        if(dobavljacDb.isEmpty()) { // not found -> insert data
            dobavljacRepository.save(dobavljac);
            return true;
        } else { // found -> return
            return false;
        }
    }
}
