package com.example.RecipeGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.GZIPInputStream;

import org.json.JSONArray;
import org.json.JSONObject;

public class recipe {
    private String content;
    public String getContent() {
      return content;
    }
    private int id;
    public int getId() {
        return id;
      }
    
    public void setContent(String content) throws IOException { 
      System.setProperty("http.agent", "Chrome");
      URL url = new URL("https://api.spoonacular.com/recipes/search?apiKey=d7f8cb83e0f048ee922b6ffdfce36e50&query="+content);

      HttpURLConnection con = (HttpURLConnection) url.openConnection();

      con.setDoOutput(true);
      con.setRequestMethod("GET");
      con.setRequestProperty("Content-Type", "application/json");

      BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
      String output = br.readLine();
          
          JSONObject jsonobject = new JSONObject(output);
          JSONArray jsonarray = jsonobject.getJSONArray("results");
          content="\n"+"Your search: "+content;
          
          int id=0;
          
          for (int i = jsonarray.length()-1; i >=0; i--) {
          	jsonobject = jsonarray.getJSONObject(i);
          	
          	id = jsonobject.getInt("id");
          	String titel = jsonobject.getString("title");
          	

          	content=i+1+". "+titel+", "+id+"\r\n"+content;
          	this.content = content;

          }
          this.id = id;
    }
    
}