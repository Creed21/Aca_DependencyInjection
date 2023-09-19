package aca.spring.test.DependencyInjection.repository;

import aca.spring.test.DependencyInjection.model.Dobavljac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DobavljacRepository extends JpaRepository<Dobavljac, Integer> {
}
