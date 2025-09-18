
package com.example.Recipe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Recipe.model.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    public List<Recipe> findByTitle(String title);
    public List<Recipe> findByCuisine(String cuisine);
    public List<Recipe> findByTitleAndCuisine(String title, String cuisine);
}