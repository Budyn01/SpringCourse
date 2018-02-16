package pl.budyn.recipe_project.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.budyn.recipe_project.model.Recipe;
import pl.budyn.recipe_project.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Budyn on 15.02.2018.
 */
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes(){
        log.debug("I am in the service! ");
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
