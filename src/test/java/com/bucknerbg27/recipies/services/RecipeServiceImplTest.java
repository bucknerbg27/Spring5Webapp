package com.bucknerbg27.recipies.services;

import com.bucknerbg27.recipies.domain.Recipe;
import com.bucknerbg27.recipies.repositiories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp()throws Exception{
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipies() {
        Recipe recipe = new Recipe();
        HashSet recipeData = new HashSet();
        recipeData.add(recipe);

        when(recipeService.getRecipies()).thenReturn(recipeData);

        Set<Recipe> recipes = recipeService.getRecipies();

        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();

    }
}