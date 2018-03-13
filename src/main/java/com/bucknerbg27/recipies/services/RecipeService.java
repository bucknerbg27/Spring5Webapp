package com.bucknerbg27.recipies.services;

import com.bucknerbg27.recipies.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;
public interface RecipeService {
    Set<Recipe> getRecipies();
}
