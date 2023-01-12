package app.recipesbook.controller.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/recipe")
public class ApiRecipeController {
    @GetMapping("/data")
    public String data(){
        return "Opaa";
    }
}
