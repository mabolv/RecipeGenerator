package com.example.RecipeGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.ui.Model;
import org.json.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
	
	//sätter värde här vid in/utloggning
	public void setLogin(String login) {
		save.setUser(login);
		e.setUser(login);
		ed.setUser(login);
    	this.login=login;
    }
    public String login;
    public String getLogin() {
    	return login;
    }
	
	EditRecipes save = new EditRecipes();
	@RequestMapping("/savedrecipes") 
	public String savedRecipe(Model model) throws IOException{
	save.savedRecipes();
	model.addAttribute("editrecipe", save);
	
    try {
  	  if(getLogin()==null){
  	  return "notloggedin";
  	  }
  	  else {
  		  return "saved";}
    }catch(Exception e) {
return "saved";
    }
	 
	}  
	
	EditRecipes e = new EditRecipes();
	@RequestMapping("/deleterecipe") 
	public String deleteRecipe(@RequestParam("id") int id, @RequestParam("name") String name, Model model) throws IOException{
	e.deleteRecipe(id, name);
	e.getId();
	e.getName();	
	model.addAttribute("editrecipe", e);
	
    try {
  	  if(getLogin()==null){
  	  return "notloggedin";
  	  }
  	  else {
  		  return "saved";}
    }catch(Exception e) {
return "saved";
    }
	
	}  
	
	EditRecipes ed = new EditRecipes();
	@RequestMapping("/addrecipe") 
	public String addRecipe(@RequestParam("id") int id, @RequestParam("name") String name, Model model) throws IOException{
	ed.addRecipe(id, name);
	ed.getId();
	ed.getName();	
	model.addAttribute("editrecipe", ed);
	
    try {
  	  if(getLogin()==null){
  	  return "notloggedin";
  	  }
  	  else {
  		  return "saved";}
    }catch(Exception e) {
return "saved";
    }
	}  
	
	RecipesInfo repinfo = new RecipesInfo();
	@RequestMapping("/recipesinfo")
	public String getInfo (@RequestParam("id") int id, Model model) throws IOException {
		repinfo.execute(id);
		repinfo.getName0();repinfo.getName1();repinfo.getName2();repinfo.getName3();repinfo.getName4();repinfo.getName5();repinfo.getName6();repinfo.getName7();repinfo.getName8();repinfo.getName9();repinfo.getName10();repinfo.getName11();
		repinfo.getImage0();repinfo.getImage1();repinfo.getImage2();repinfo.getImage3();repinfo.getImage4();repinfo.getImage5();repinfo.getImage6();repinfo.getImage7();repinfo.getImage8();repinfo.getImage9();repinfo.getImage10();repinfo.getImage11();
		repinfo.getIngrName0();repinfo.getIngrName1();repinfo.getIngrName2();repinfo.getIngrName3();repinfo.getIngrName4();repinfo.getIngrName5();repinfo.getIngrName6();repinfo.getIngrName7();repinfo.getIngrName8();repinfo.getIngrName9();repinfo.getIngrName10();repinfo.getIngrName11();repinfo.getIngrName12();repinfo.getIngrName13();repinfo.getIngrName14();repinfo.getIngrName15();repinfo.getIngrName16();repinfo.getIngrName17();repinfo.getIngrName18();repinfo.getIngrName19();repinfo.getIngrName20();repinfo.getIngrName21();repinfo.getIngrName22();repinfo.getIngrName23();repinfo.getIngrName24();repinfo.getIngrName25();repinfo.getIngrName26();repinfo.getIngrName27();repinfo.getIngrName28();repinfo.getIngrName29();repinfo.getIngrName30();repinfo.getIngrName31();repinfo.getIngrName32();
		repinfo.getIngrImage0();repinfo.getIngrImage1();repinfo.getIngrImage2();repinfo.getIngrImage3();repinfo.getIngrImage4();repinfo.getIngrImage5();repinfo.getIngrImage6();repinfo.getIngrImage7();repinfo.getIngrImage8();repinfo.getIngrImage9();repinfo.getIngrImage10();repinfo.getIngrImage11();repinfo.getIngrImage12();repinfo.getIngrImage13();repinfo.getIngrImage14();repinfo.getIngrImage15();repinfo.getIngrImage16();repinfo.getIngrImage17();repinfo.getIngrImage18();repinfo.getIngrImage19();repinfo.getIngrImage20();repinfo.getIngrImage21();repinfo.getIngrImage22();repinfo.getIngrImage23();repinfo.getIngrImage24();repinfo.getIngrImage25();repinfo.getIngrImage26();repinfo.getIngrImage27();repinfo.getIngrImage28();repinfo.getIngrImage29();repinfo.getIngrImage30();repinfo.getIngrImage31();repinfo.getIngrImage32();
		repinfo.getTitle();repinfo.getRim();repinfo.getServ();repinfo.getRimage();repinfo.getSum();repinfo.getPairwine();repinfo.getPairtext();repinfo.getWinetitle();repinfo.getDesc();repinfo.getImageurl();repinfo.getAm();repinfo.getUnit();
		model.addAttribute("recipesinfo", repinfo);
		
	      try {
	    	  if(getLogin()==null){
	    	  return "notloggedin";
	    	  }
	    	  else {
	    		  return "recipesinfo_result";}
	      }catch(Exception e) {
      return "recipesinfo_result";
	      }
	 }

    
	@GetMapping("/recipes")
    public String RecipesForm(Model model) {
      model.addAttribute("Recipes", new Recipes());
      
      try {
    	  if(getLogin()==null){
    	  return "notloggedin";
    	  }
    	  else {
    		  return "recipes";}
      }catch(Exception e) {
  return "recipes";
      }
      
    }
	@PostMapping("/recipes")
    public String RecipeSubmit(@ModelAttribute Recipes recipes) throws IOException {
    	recipes.execute();

    	return "recipes_result";	
    }
	
	@GetMapping("/generate")
    public String GenerateForm(Model model) {
      model.addAttribute("RecipeGenerator", new RecipeGenerator());
      
      try {
    	  if(getLogin()==null){
    	  return "notloggedin";
    	  }
    	  else {
    		  return "generate";}
      }catch(Exception e) {
  return "generate";
      }

    }
	@PostMapping("/generate")
    public String GenerateSubmit(@ModelAttribute RecipeGenerator recipegenerator) throws IOException {
    	recipegenerator.execute();
    	if(recipegenerator.getTimeframe().equals("day")) {
    		return "generate_day";
    	}
    	else {
    	return "generate_result";	
    	}
    }
	
	@GetMapping("/")
	public String Index2(Model model) {
		model.addAttribute("Log", log);
		return "login";
	}
	
	@GetMapping("/index")
	public String Index(Model model) {

	      try {
	    	  if(getLogin()==null){
	    	  return "notloggedin";
	    	  }
	    	  else {
	    		  return "index";}
	      }catch(Exception e) {
      return "index";
	      }
    }
	
	@GetMapping("/register")
    public String RegisterForm(Model model) {
      model.addAttribute("Register", new Login());
          return "register";
    }
	@PostMapping("/register")
    public String RegisterSubmit(@ModelAttribute Login login) throws IOException {
    	if(login.Register()=="true") {
    		return "register_success";	
    	}
    	else {
    		return "register_fail";
    	}
    	
    }
	
	Login log = new Login();
	@GetMapping("/login")
    public String LoginForm(Model model) {
      model.addAttribute("Log", log);
          return "login";
    }
	@PostMapping("/login")
    public String LoginSubmit(@ModelAttribute Login log) throws IOException {
    	log.LoginUser();
    	if(log.LoginUser()!="false") {
    		String s=log.LoginUser();
    		setLogin(s);
    	return "index";	
    	}
    	return "login_fail";
    }
	
	
	@GetMapping("/logout")
    public String LogoutForm(Model model) {
		model.addAttribute("Log", log);
      setLogin(null);
          return "login";
    }
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
		
    }        
}