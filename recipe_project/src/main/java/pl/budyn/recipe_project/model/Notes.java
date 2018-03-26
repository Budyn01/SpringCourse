package pl.budyn.recipe_project.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Budyn on 13.02.2018.
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}


