package pl.budyn.recipe_project.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Budyn on 13.02.2018.
 */
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
