package com.onrcnk.spring5recipeapp.services;

import com.onrcnk.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}