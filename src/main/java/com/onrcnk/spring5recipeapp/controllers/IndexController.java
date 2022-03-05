package com.onrcnk.spring5recipeapp.controllers;

import com.onrcnk.spring5recipeapp.domain.Category;
import com.onrcnk.spring5recipeapp.domain.Recipe;
import com.onrcnk.spring5recipeapp.domain.UnitOfMeasure;
import com.onrcnk.spring5recipeapp.repositories.CategoryRepository;
import com.onrcnk.spring5recipeapp.repositories.UnitOfMeasureRepository;
import com.onrcnk.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        Set<Recipe> recipeHash = recipeService.getRecipes();
        model.addAttribute("recipes", recipeHash);

        return "index";
    }
}
