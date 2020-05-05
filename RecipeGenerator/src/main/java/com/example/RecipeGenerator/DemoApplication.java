package com.example.RecipeGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.ui.Model;
import org.json.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
public class DemoApplication {
	
	
	@GetMapping("/recipe")
    public String RecipeForm(Model model) {
      model.addAttribute("recipe", new recipe());
      return "recipe";
    }
    @PostMapping("/recipe")
    public String tmdbSubmit(@ModelAttribute recipe recipe) throws IOException {
      return "result";
    }
    
	@GetMapping("/recipes")
    public String RecipesForm(Model model) {
      model.addAttribute("Recipes", new Recipes());
          return "recipes";
    }
	@PostMapping("/recipes")
    public String RecipeSubmit(@ModelAttribute Recipes recipes) throws IOException {
    	recipes.execute();

    	return "recipes_result";
    	
    }

	@PostMapping("/recipesinfo")
    public String RecipeSubmit2(@ModelAttribute RecipesInfo repinfo) throws IOException {
    	repinfo.execute();

    	return "recipesinfo_result";
    	
    }
    
	/*@GetMapping("/recipesinfo")
    public String RecipesInfoForm(Model model) {
      model.addAttribute("RecipesInfo", new RecipesInfo());
          return "recipesinfo";
    }
    @PostMapping("/recipesinfo")
    public String RecipeInfoForm(@ModelAttribute RecipesInfo repinfo) throws IOException {
    
    	repinfo.execute();
    	return "recipesinfo_result";
    }*/
	
	@GetMapping("/index")
	public String Index(Model model) {
	      //model.addAttribute("recipe", new recipe());
      return "index";
    }
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
		
    }        
}