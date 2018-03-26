package pl.budyn.recipe_project.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.budyn.recipe_project.model.Recipe;

/**
 * Created by Budyn on 20.02.2018.
 */
@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private String recipeNotes;
}
