package pl.budyn.recipe_project.services;

import pl.budyn.recipe_project.commands.IngredientCommand;

/**
 * Created by Budyn on 23.02.2018.
 */
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
    IngredientCommand saveIngredientCommand(IngredientCommand command);
    void deleteById(Long recipeId, Long idToDelete);
}
