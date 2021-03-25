package yan.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yan.spring5recipeapp.domain.Category;
import yan.spring5recipeapp.domain.UnitOfMeasure;
import yan.spring5recipeapp.repositories.CategoryRepository;
import yan.spring5recipeapp.repositories.UnitOfMeasureRepository;
import yan.spring5recipeapp.service.RecipeService;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
