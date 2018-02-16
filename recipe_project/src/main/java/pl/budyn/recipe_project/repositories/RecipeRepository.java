package pl.budyn.recipe_project.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.budyn.recipe_project.model.Recipe;

/**
 * Created by Budyn on 14.02.2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
