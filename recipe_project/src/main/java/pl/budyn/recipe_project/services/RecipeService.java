package pl.budyn.recipe_project.services;

import pl.budyn.recipe_project.model.Recipe;

import java.util.Set;

/**
 * Created by Budyn on 15.02.2018.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
