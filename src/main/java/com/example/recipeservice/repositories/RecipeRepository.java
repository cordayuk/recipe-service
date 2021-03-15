package com.example.recipeservice.repositories;

import com.example.recipeservice.domain.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.UUID;

@RepositoryRestResource( collectionResourceRel = "recipes", path = "recipes")
public interface RecipeRepository extends MongoRepository<Recipe, UUID> {
    public Recipe findByName(@Param("name") final String name);
}
