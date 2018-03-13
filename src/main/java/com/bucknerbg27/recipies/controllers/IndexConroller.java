package com.bucknerbg27.recipies.controllers;

import com.bucknerbg27.recipies.domain.Category;
import com.bucknerbg27.recipies.domain.UnitOfMeasure;
import com.bucknerbg27.recipies.repositiories.CategoryRepository;
import com.bucknerbg27.recipies.repositiories.UnitOfMeasureRepository;
import com.bucknerbg27.recipies.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexConroller {

    private final RecipeService recipeService;

    public IndexConroller(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes",recipeService.getRecipies());
        log.debug("Getting Index Page");
        return "index";
    }
}
