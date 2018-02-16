package pl.budyn.recipe_project.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.budyn.recipe_project.model.UnitOfMeasure;

import java.util.Optional;

/**
 * Created by Budyn on 14.02.2018.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
