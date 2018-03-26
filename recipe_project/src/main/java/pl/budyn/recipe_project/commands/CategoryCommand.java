package pl.budyn.recipe_project.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.budyn.recipe_project.model.Recipe;

import java.util.Set;

/**
 * Created by Budyn on 20.02.2018.
 */
@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
    private Long id;
    private String description;
}
