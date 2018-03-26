package pl.budyn.recipe_project.services;

import pl.budyn.recipe_project.commands.UnitOfMeasureCommand;
import pl.budyn.recipe_project.model.UnitOfMeasure;

import java.util.Set;

/**
 * Created by Budyn on 24.02.2018.
 */
public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
