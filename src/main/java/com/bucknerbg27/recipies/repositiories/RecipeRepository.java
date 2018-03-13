package com.bucknerbg27.recipies.repositiories;

import com.bucknerbg27.recipies.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long>{
}
