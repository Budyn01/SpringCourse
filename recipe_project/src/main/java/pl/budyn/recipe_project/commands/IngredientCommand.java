package pl.budyn.recipe_project.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.budyn.recipe_project.model.Recipe;
import pl.budyn.recipe_project.model.UnitOfMeasure;

import java.math.BigDecimal;

/**
 * Created by Budyn on 20.02.2018.
 */
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private Long recipeId;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;
}
