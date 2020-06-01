package com.example.RecipeGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class Login {
	
	public void setLogin(String login) throws IOException {
		this.login=login;
	}
    private String login;
    public String getLogin() {
      return login;
    }
	
    public void setUser(String user) throws IOException { 
    	this.user=user;	
    }
	
	public void setPass(String pass) throws IOException {
		this.pass=pass;
	}
	
    private String user;
    public String getUser() {
      return user;
    }

	
    private String pass;
    public String getPass() {
      return pass;
    }
	//registrera användare
	public String Register() throws IOException{
		
		URL url = new URL("http://localhost:8081/RecipeGeneratorServer/rest/RecipeService/register?user="+user+"&pass="+pass);
	     HttpURLConnection con = (HttpURLConnection) url.openConnection();
	     con.setDoOutput(true);
	     con.setRequestMethod("GET");
	     con.setRequestProperty("Content-Type", "application/json");
	     BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
	     String output = br.readLine();
	     output = "{results:"+output+"}";
	     
	     JSONObject jsonobject = new JSONObject();
	    	 jsonobject = new JSONObject(output);
	         JSONArray jsonarray = new JSONArray();


	            	 jsonarray = jsonobject.getJSONArray("results");
		        	 JSONObject json = new JSONObject();
		        	 json=jsonarray.getJSONObject(0);
                 	 String g = json.getString("login");
                 	 System.out.println(g);
                 	 if(g.equals("Success")) {
                 		 return "true";
                 	 }

		
		return "false";
	}
	//inloggning
public String LoginUser() throws IOException{
		
		URL url = new URL("http://localhost:8081/RecipeGeneratorServer/rest/RecipeService/login?user="+user+"&pass="+pass);
	     HttpURLConnection con = (HttpURLConnection) url.openConnection();
	     con.setDoOutput(true);
	     con.setRequestMethod("GET");
	     con.setRequestProperty("Content-Type", "application/json");
	     BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
	     String output = br.readLine();
	     output = "{results:"+output+"}";
	     JSONObject jsonobject = new JSONObject();
	    	 jsonobject = new JSONObject(output);
	         JSONArray jsonarray = new JSONArray();


	            	 jsonarray = jsonobject.getJSONArray("results");
		        	 JSONObject json = new JSONObject();
		        	 json=jsonarray.getJSONObject(0);
                 	 String g = json.getString("login");
                 	 if(g.contains("Welcome")) {
                 		 g=g.replace("Welcome ", "");
                 		 return g;
                 	 }

		
		return "false";
	}


}
