package pl.budyn.recipe_project.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Budyn on 23.02.2018.
 */
public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}
