package pl.budyn.recipe_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.budyn.recipe_project.services.RecipeService;

/**
 * Created by Budyn on 17.02.2018.
 */
@Controller
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipe/show/{id}")
    public String getRecipePage(Model model, @PathVariable String id){
        model.addAttribute("recipe", recipeService.findById(new Long(id)));
        return "recipe/show";
    }
}




