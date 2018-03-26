package pl.budyn.recipe_project.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.budyn.recipe_project.commands.IngredientCommand;
import pl.budyn.recipe_project.model.Ingredient;

/**
 * Created by Budyn on 20.02.2018.
 */
@Component
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {
    @Override
    public IngredientCommand convert(Ingredient source) {
        if(source == null) {
            return null;
        }
        final IngredientCommand ingredientCommand = new IngredientCommand();
        ingredientCommand.setAmount(source.getAmount());
        ingredientCommand.setId(source.getId());
        ingredientCommand.setDescription(source.getDescription());
        ingredientCommand.setUnitOfMeasure(source.getUom());
        return ingredientCommand;
    }
}
