package com.example.RecipeGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class RecipesInfo {
	
	public void setId1(String id1) throws IOException {
		this.id1=id1;
		
	}
	

    public void setOption(int option) throws IOException { 
    	this.option=option;	
    }
	
    private int option;
    public int getOption() {
      return option;
    }
    

    
    String res0;
    public String getRes0() {
        return res0;
      }

    
    private String used0;
    public String getUsed0() {
      return used0;
    }

    
    
    private String src0;
    public String getSrc0() {
        return src0;
      }

    
    private String titel0;
    public String getTitel0() {
        return titel0;
      }

    
    private String namn0;
    public String getNamn0() {
        return namn0;
      }

    
    private String content0;
    public String getContent0() {
      return content0;
    }
    
    private String id0;
    public String getId0() {
      return id0;
    }
    
    private String id1;
    public String getId1() {
      return id1;
    }
	
    public void execute() throws IOException { 

        System.setProperty("http.agent", "Firefox");

        URL url = new URL("https://api.spoonacular.com/recipes/324694/analyzedInstructions?apiKey=e672224c04114dcfbec9e42bad48afe3");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
       
        con.setDoOutput(true);
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        
        BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
        String output = "{results:"+br.readLine()+"}";
            
            JSONObject jsonobject0 = new JSONObject(output);
            JSONObject jsonobject1 = new JSONObject(output);

  	          JSONArray jsonarray0 = jsonobject0.getJSONArray("results");
  	        JSONArray jsonarray1 = jsonobject1.getJSONArray("results");

  	    	    jsonobject0 = jsonarray0.getJSONObject(0);
  	    	  jsonobject1 = jsonarray1.getJSONObject(1);

  	          	String id0 = jsonobject0.getString("name");
  	          	String id1 = jsonobject1.getString("name");

  	          	System.out.println("g"+id0+id1);
	          	

  		        JSONObject jsono0 = jsonobject0;
  		        
  		        JSONArray a0 = jsono0.getJSONArray("steps");
  		
  		        String namn0 = "";

  		        String used0 = "";
  		        
  		        for (int i = a0.length()-1; i >=0; i--) {
  		        	jsono0 = a0.getJSONObject(i);
  		        	if(i==0) {used0 = used0+jsono0.getString("step");}
  		          	else {used0 = used0+jsono0.getString("step")+", ";}}
  		        
  		        
  		        System.out.println(used0);


  	          	content0 = "1. "+titel0+", "+id0+"\r\n"+namn0+"\r\n";
  	          	
  	          	this.id0=id0;
  	          	this.id1=id1;
  	          		
  	          	this.res0 = res0;
  	          	
  	          	this.option = option;
  	          	
  		        this.content0 = content0;
  		        
  		        this.titel0 = titel0;
  		        
  		        this.namn0 = namn0;
  		        
  		        this.src0 = src0;
  		        
  		        this.used0 = used0;

            
      
      }
}
