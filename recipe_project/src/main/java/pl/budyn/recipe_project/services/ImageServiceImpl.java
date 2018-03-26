package pl.budyn.recipe_project.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import pl.budyn.recipe_project.model.Recipe;
import pl.budyn.recipe_project.repositories.RecipeRepository;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Budyn on 23.02.2018.
 */
@Slf4j
@Service
public class ImageServiceImpl implements ImageService {

    private final RecipeRepository recipeRepository;

    public ImageServiceImpl(RecipeRepository recipeService) {
        this.recipeRepository = recipeService;
    }

    @Transactional
    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {
        try {
            Recipe recipe = recipeRepository.findById(recipeId).get();
            Byte image[] = new Byte[((int) file.getSize())];
            byte fileBytes[] = file.getBytes();
            Arrays.setAll(image, n -> fileBytes[n]);
            recipe.setImage(image);
            recipeRepository.save(recipe);
        } catch (IOException e) {
            log.error("Something went wrong in ImageService");
            e.printStackTrace();
        }
    }
}
