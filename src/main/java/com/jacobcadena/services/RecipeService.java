package com.jacobcadena.services;

import com.jacobcadena.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}