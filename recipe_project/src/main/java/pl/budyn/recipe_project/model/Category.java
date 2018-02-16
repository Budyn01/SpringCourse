package pl.budyn.recipe_project.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Budyn on 13.02.2018.
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
