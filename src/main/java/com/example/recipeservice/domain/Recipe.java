package com.example.recipeservice.domain;

import lombok.*;
import org.bson.conversions.Bson;
import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Recipe {

    @Id
    private UUID id;

    private String name;

    private String cookingTime;

    private String servings;

    private List<String> method;

    private List<String> ingredients;


}
