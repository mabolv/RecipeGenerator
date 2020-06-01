 package com.example.RecipeGenerator;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONObject;

public class EditRecipes {
	
    public void setUser(String user) {
    	this.user=user;
    }
    public String user;
    public String getUser() {
    	return user;
    }
	
    public void setId(String id) {
    	this.id=id;
    }
    public String id;
    public String getId() {
    	return id;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public String name;
    public String getName() {
    	return name;
    }
    
    public void setTitle0(String title0) {
    	this.title0=title0;
    }
    public String title0;
    public String getTitle0() {
    	return title0;
    }
    public void setTitle1(String title1) {
    	this.title1=title1;
    }
    public String title1;
    public String getTitle1() {
    	return title1;
    }
    public void setTitle2(String title2) {
    	this.title2=title2;
    }
    public String title2;
    public String getTitle2() {
    	return title2;
    }
    public void setTitle3(String title3) {
    	this.title3=title3;
    }
    public String title3;
    public String getTitle3() {
    	return title3;
    }
    public void setTitle4(String title4) {
    	this.title4=title4;
    }
    public String title4;
    public String getTitle4() {
    	return title4;
    }
    public void setTitle5(String title5) {
    	this.title5=title5;
    }
    public String title5;
    public String getTitle5() {
    	return title5;
    }
    public void setTitle6(String title6) {
    	this.title6=title6;
    }
    public String title6;
    public String getTitle6() {
    	return title6;
    }
    public void setTitle7(String title7) {
    	this.title7=title7;
    }
    public String title7;
    public String getTitle7() {
    	return title7;
    }
    public void setTitle8(String title8) {
    	this.title8=title8;
    }
    public String title8;
    public String getTitle8() {
    	return title8;
    }
    public void setTitle9(String title9) {
    	this.title9=title9;
    }
    public String title9;
    public String getTitle9() {
    	return title9;
    }
    
    public void setId0(String id0) {
    	this.id0=id0;
    }
    public String id0;
    public String getId0() {
    	return id0;
    }
    public void setId1(String id1) {
    	this.id1=id1;
    }
    public String id1;
    public String getId1() {
    	return id1;
    }
    public void setId2(String id2) {
    	this.id2=id2;
    }
    public String id2;
    public String getId2() {
    	return id2;
    }
    public void setId3(String id3) {
    	this.id3=id3;
    }
    public String id3;
    public String getId3() {
    	return id3;
    }
    public void setId4(String id4) {
    	this.id4=id4;
    }
    public String id4;
    public String getId4() {
    	return id4;
    }
    public void setId5(String id5) {
    	this.id5=id5;
    }
    public String id5;
    public String getId5() {
    	return id5;
    }
    public void setId6(String id6) {
    	this.id6=id6;
    }
    public String id6;
    public String getId6() {
    	return id6;
    }
    public void setId7(String id7) {
    	this.id7=id7;
    }
    public String id7;
    public String getId7() {
    	return id7;
    }
    public void setId8(String id8) {
    	this.id8=id8;
    }
    public String id8;
    public String getId8() {
    	return id8;
    }
    public void setId9(String id9) {
    	this.id9=id9;
    }
    public String id9;
    public String getId9() {
    	return id9;
    }
    
    public void setDelete0(String delete0) {
    	this.delete0=delete0;
    }
    public String delete0;
    public String getDelete0() {
    	return delete0;
    }
    public void setDelete1(String delete1) {
    	this.delete1=delete1;
    }
    public String delete1;
    public String getDelete1() {
    	return delete1;
    }
    public void setDelete2(String delete2) {
    	this.delete2=delete2;
    }
    public String delete2;
    public String getDelete2() {
    	return delete2;
    }
    public void setDelete3(String delete3) {
    	this.delete3=delete3;
    }
    public String delete3;
    public String getDelete3() {
    	return delete3;
    }
    public void setDelete4(String delete4) {
    	this.delete4=delete4;
    }
    public String delete4;
    public String getDelete4() {
    	return delete4;
    }
    public void setDelete5(String delete5) {
    	this.delete5=delete5;
    }
    public String delete5;
    public String getDelete5() {
    	return delete5;
    }
    public void setDelete6(String delete6) {
    	this.delete6=delete6;
    }
    public String delete6;
    public String getDelete6() {
    	return delete6;
    }
    public void setDelete7(String delete7) {
    	this.delete7=delete7;
    }
    public String delete7;
    public String getDelete7() {
    	return delete7;
    }
    public void setDelete8(String delete8) {
    	this.delete8=delete8;
    }
    public String delete8;
    public String getDelete8() {
    	return delete8;
    }
    public void setDelete9(String delete9) {
    	this.delete9=delete9;
    }
    public String delete9;
    public String getDelete9() {
    	return delete9;
    }
    
    public void setNew0(String new0) {
    	this.new0=new0;
    }
    public String new0;
    public String getNew0() {
    	return new0;
    }
    public void setNew1(String new1) {
    	this.new1=new1;
    }
    public String new1;
    public String getNew1() {
    	return new1;
    }
    public void setNew2(String new2) {
    	this.new2=new2;
    }
    public String new2;
    public String getNew2() {
    	return new2;
    }
    public void setNew3(String new3) {
    	this.new3=new3;
    }
    public String new3;
    public String getNew3() {
    	return new3;
    }
    public void setNew4(String new4) {
    	this.new4=new4;
    }
    public String new4;
    public String getNew4() {
    	return new4;
    }
    public void setNew5(String new5) {
    	this.new5=new5;
    }
    public String new5;
    public String getNew5() {
    	return new5;
    }
    public void setNew6(String new6) {
    	this.new6=new6;
    }
    public String new6;
    public String getNew6() {
    	return new6;
    }
    public void setNew7(String new7) {
    	this.new7=new7;
    }
    public String new7;
    public String getNew7() {
    	return new7;
    }
    public void setNew8(String new8) {
    	this.new8=new8;
    }
    public String new8;
    public String getNew8() {
    	return new8;
    }
    public void setNew9(String new9) {
    	this.new9=new9;
    }
    public String new9;
    public String getNew9() {
    	return new9;
    }
    
    //se sparade recept
    public void savedRecipes() throws IOException {

		URL url = new URL("http://localhost:8081/RecipeGeneratorServer/rest/RecipeService/savedrecipes?user="+user);
		
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

	             String title0, title1, title2, title3, title4, title5, title6, title7, title8, title9;
	             String id0, id1, id2, id3, id4, id5, id6, id7, id8, id9;

	             try {
	            	 jsonarray = jsonobject.getJSONArray("results");
		        	 JSONObject json = new JSONObject();
		        	 json=jsonarray.getJSONObject(0);
                  	 id0 = json.getString("id");
                  	 title0 = json.getString("titel");
                  	title0=title0.replaceAll(" ", "_");
    			    title0=title0.replaceAll("&", "@");
    			    String delete0="Delete";
                   	this.delete0=delete0;
                  	 this.id0=id0;this.title0=title0;
    				 }catch(Exception e) {
    					id0=""; title0=""; delete0="";
    					this.delete0=delete0;this.id0=id0;this.title0=title0;
    				 }
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
       	        	 JSONObject json = new JSONObject();
    	             json = jsonarray.getJSONObject(1);
                  	 id1 = json.getString("id");
                  	 title1 = json.getString("titel");
                  	title1=title1.replaceAll(" ", "_");
    			    title1=title1.replaceAll("&", "@");
                  	String delete1="Delete";
                   	this.delete1=delete1;
                  	this.id1=id1;this.title1=title1;
                  	 }catch(Exception e) {
                  		id1=""; title1=""; delete1="";
    					this.delete1=delete1;this.id1=id1;this.title1=title1;
                  	 }
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
       	        	 JSONObject json = new JSONObject();
    	             json = jsonarray.getJSONObject(2);
                  	 id2 = json.getString("id");
                  	 title2 = json.getString("titel");
                  	title2=title2.replaceAll(" ", "_");
    			    title2=title2.replaceAll("&", "@");
                  	String delete2="Delete";
                   	this.delete2=delete2;
                  	this.id2=id2;this.title2=title2;
                  	}catch(Exception e) {
                  		id2=""; title2=""; delete2="";
    					this.delete2=delete2;this.id2=id2;this.title2=title2;
                  	}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
       	        	 JSONObject json = new JSONObject();
    	             json = jsonarray.getJSONObject(3);
                  	 id3 = json.getString("id");
                  	 title3 = json.getString("titel");
                  	title3=title3.replaceAll(" ", "_");
    			    title3=title3.replaceAll("&", "@");
                  	String delete3="Delete";
                   	this.delete3=delete3;
                  	this.id3=id3;this.title3=title3;
                  	}catch(Exception e) {
                  		id3=""; title3=""; delete3="";
    					this.delete3=delete3;this.id3=id3;this.title3=title3;
                  	}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
       	        	 JSONObject json = new JSONObject();
    	             json = jsonarray.getJSONObject(4);
                  	 id4 = json.getString("id");
                  	 title4 = json.getString("titel");
                  	title4=title4.replaceAll(" ", "_");
    			    title4=title4.replaceAll("&", "@");
                  	String delete4="Delete";
                   	this.delete4=delete4;
                  	this.id4=id4;this.title4=title4;
                  	}catch(Exception e) {
                  		id4=""; title4=""; delete4="";
    					this.delete4=delete4;this.id4=id4;this.title4=title4;
                  	}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
       	        	 JSONObject json = new JSONObject();
    	             json = jsonarray.getJSONObject(5);
                  	 id5 = json.getString("id");
                  	 title5 = json.getString("titel");
                  	title5=title5.replaceAll(" ", "_");
    			    title5=title5.replaceAll("&", "@");
                  	String delete5="Delete";
                   	this.delete5=delete5;
                  	this.id5=id5;this.title5=title5;
                  	}catch(Exception e) {
                  		id5=""; title5=""; delete5="";
    					this.delete5=delete5;this.id5=id5;this.title5=title5;
                  	}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
       	        	 JSONObject json = new JSONObject();
    	             json = jsonarray.getJSONObject(6);
                  	 id6 = json.getString("id");
                  	 title6 = json.getString("titel");
                  	title6=title6.replaceAll(" ", "_");
    			    title6=title6.replaceAll("&", "@");
                  	String delete6="Delete";
                   	this.delete6=delete6;
                  	this.id6=id6;this.title6=title6;
                  	}catch(Exception e) {
                  		id6=""; title6=""; delete6="";
    					this.delete6=delete6;this.id6=id6;this.title6=title6;
                  	}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
       	        	 JSONObject json = new JSONObject();
    	             json = jsonarray.getJSONObject(7);
                  	 id7 = json.getString("id");
                  	 title7 = json.getString("titel");
                  	title7=title7.replaceAll(" ", "_");
    			    title7=title7.replaceAll("&", "@");
                  	String delete7="Delete";
                   	this.delete7=delete7;
                  	this.id7=id7;this.title7=title7;
                  	}catch(Exception e) {
                  		id7=""; title7=""; delete7="";
    					this.delete7=delete7;this.id7=id7;this.title7=title7;
                  	}
                  	 try {
                  	 jsonarray = jsonobject.getJSONArray("results");
       	        	 JSONObject json = new JSONObject();
    	             json = jsonarray.getJSONObject(8);
                  	 id8 = json.getString("id");
                  	 title8 = json.getString("titel");
                  	title8=title8.replaceAll(" ", "_");
    			    title8=title8.replaceAll("&", "@");
                  	String delete8="Delete";
                   	this.delete8=delete8;
                  	this.id8=id8;this.title8=title8;
                  	}catch(Exception e) {
                  		id8=""; title8=""; delete8="";
    					this.delete8=delete8;this.id8=id8;this.title8=title8;
                  	}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
       	        	 JSONObject json = new JSONObject();
       	        	 json=jsonarray.getJSONObject(9);
                  	 id9 = json.getString("id");
                  	 title9 = json.getString("titel");
                  	title9=title9.replaceAll(" ", "_");
    			    title9=title9.replaceAll("&", "@");
                  	String delete9="Delete";
                   	this.delete9=delete9;
                  	this.id9=id9;this.title9=title9;
                  	}catch(Exception e) {
                  		id9=""; title9=""; delete9="";
    					this.delete9=delete9;this.id9=id9;this.title9=title9;
                  	}
        }
    //ta bort sparat recept
    public void deleteRecipe(int id, String name) throws IOException {

		URL url = new URL("http://localhost:8081/RecipeGeneratorServer/rest/RecipeService/deleterecipe?id="+id+"&name="+name+"&user="+user);
		
	     HttpURLConnection con = (HttpURLConnection) url.openConnection();
	     con.setDoOutput(true);
	     con.setRequestMethod("GET");
	     con.setRequestProperty("Content-Type", "application/json");
	     BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
	     String output = br.readLine();
	     output = "{results:"+output+"}";
	     
	     JSONObject jsonobject = new JSONObject();
	             
	             String title0, title1, title2, title3, title4, title5, title6, title7, title8, title9;
	             String id0, id1, id2, id3, id4, id5, id6, id7, id8, id9;
	             
	             try {
	            	 jsonobject = new JSONObject(output);
	    	         JSONArray jsonarray = new JSONArray();
	            	 jsonarray = jsonobject.getJSONArray("results");
		        	 JSONObject jsono = new JSONObject();
		        	 jsono=jsonarray.getJSONObject(0);
                  	 id0 = jsono.getString("id");
                  	 title0 = jsono.getString("titel");
                  	title0=title0.replaceAll(" ", "_");
    			    title0=title0.replaceAll("&", "@");
                    	String delete0="Delete";
                       	this.delete0=delete0;
                  	 this.id0=id0;this.title0=title0;
	             }catch(Exception e) {
	            	 id0=""; title0=""; delete0="";
 					this.delete0=delete0;this.id0=id0;this.title0=title0;
	             }
                  	 try {
                  		jsonobject = new JSONObject(output);
           	         JSONArray jsonarray = new JSONArray();
                  	 jsonarray = jsonobject.getJSONArray("results");
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(1);
                  	 id1 = jsono.getString("id");
                  	 title1 = jsono.getString("titel");
                  	title1=title1.replaceAll(" ", "_");
    			    title1=title1.replaceAll("&", "@");
                  	String delete1="Delete";
                   	this.delete1=delete1;
                  	this.id1=id1;this.title1=title1;
                  	 }catch(Exception e) {id1=""; title1=""; delete1="";
 					this.delete1=delete1;this.id1=id1;this.title1=title1;}
                  	 try {
                  		jsonobject = new JSONObject(output);
           	         JSONArray jsonarray = new JSONArray();
                  		jsonarray = jsonobject.getJSONArray("results");
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(2);
                  	 id2 = jsono.getString("id");
                  	 title2 = jsono.getString("titel");
                  	title2=title2.replaceAll(" ", "_");
    			    title2=title2.replaceAll("&", "@");
                  	String delete2="Delete";
                   	this.delete2=delete2;
                  	this.id2=id2;this.title2=title2;
                  	}catch(Exception e) {id2=""; title2=""; delete2="";
					this.delete2=delete2;this.id2=id2;this.title2=title2;}
                  	 try {
                  		jsonobject = new JSONObject(output);
           	         JSONArray jsonarray = new JSONArray();
                  		jsonarray = jsonobject.getJSONArray("results");
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(3);
                  	 id3 = jsono.getString("id");
                  	 title3 = jsono.getString("titel");
                  	title3=title3.replaceAll(" ", "_");
    			    title3=title3.replaceAll("&", "@");
                  	String delete3="Delete";
                   	this.delete3=delete3;
                  	this.id3=id3;this.title3=title3;
                  	}catch(Exception e) {id3=""; title3=""; delete3="";
					this.delete3=delete3;this.id3=id3;this.title3=title3;}
                  	 try {
                  		jsonobject = new JSONObject(output);
           	         JSONArray jsonarray = new JSONArray();
                  		jsonarray = jsonobject.getJSONArray("results");
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(4);
                  	 id4 = jsono.getString("id");
                  	 title4 = jsono.getString("titel");
                  	title4=title4.replaceAll(" ", "_");
    			    title4=title4.replaceAll("&", "@");
                  	String delete4="Delete";
                   	this.delete4=delete4;
                  	this.id4=id4;this.title4=title4;
                  	}catch(Exception e) {id4=""; title4=""; delete4="";
					this.delete4=delete4;this.id4=id4;this.title4=title4;}
                  	 try {
                  		jsonobject = new JSONObject(output);
           	         JSONArray jsonarray = new JSONArray();
                  		jsonarray = jsonobject.getJSONArray("results");
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(5);
                  	 id5 = jsono.getString("id");
                  	 title5 = jsono.getString("titel");
                  	title5=title5.replaceAll(" ", "_");
    			    title5=title5.replaceAll("&", "@");
                  	String delete5="Delete";
                   	this.delete5=delete5;
                  	this.id5=id5;this.title5=title5;
                  	}catch(Exception e) {id5=""; title5=""; delete5="";
					this.delete5=delete5;this.id5=id5;this.title5=title5;}
                  	 try {
                  		jsonobject = new JSONObject(output);
           	         JSONArray jsonarray = new JSONArray();
                  		jsonarray = jsonobject.getJSONArray("results");
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(6);
                  	 id6 = jsono.getString("id");
                  	 title6 = jsono.getString("titel");
                  	title6=title6.replaceAll(" ", "_");
    			    title6=title6.replaceAll("&", "@");
                  	String delete6="Delete";
                   	this.delete6=delete6;
                  	this.id6=id6;this.title6=title6;
                  	}catch(Exception e) {id6=""; title6=""; delete6="";
					this.delete6=delete6;this.id6=id6;this.title6=title6;}
                  	 try {
                  		jsonobject = new JSONObject(output);
           	         JSONArray jsonarray = new JSONArray();
                  		jsonarray = jsonobject.getJSONArray("results");
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(7);
                  	 id7 = jsono.getString("id");
                  	 title7 = jsono.getString("titel");
                  	title7=title7.replaceAll(" ", "_");
    			    title7=title7.replaceAll("&", "@");
                  	String delete7="Delete";
                   	this.delete7=delete7;
                  	this.id7=id7;this.title7=title7;
                  	}catch(Exception e) {id7=""; title7=""; delete7="";
					this.delete7=delete7;this.id7=id7;this.title7=title7;}
                  	 try {
                  		jsonobject = new JSONObject(output);
           	         JSONArray jsonarray = new JSONArray();
                  		jsonarray = jsonobject.getJSONArray("results");
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(8);
                  	 id8 = jsono.getString("id");
                  	 title8 = jsono.getString("titel");
                  	title8=title8.replaceAll(" ", "_");
    			    title8=title8.replaceAll("&", "@");
                  	String delete8="Delete";
                   	this.delete8=delete8;
                  	this.id8=id8;this.title8=title8;
                  	}catch(Exception e) {id8=""; title8=""; delete8="";
					this.delete8=delete8;this.id8=id8;this.title8=title8;}
                  	 try {
                  		jsonobject = new JSONObject(output);
           	         JSONArray jsonarray = new JSONArray();
                  		jsonarray = jsonobject.getJSONArray("results");
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(9);
                  	 id9 = jsono.getString("id");
                  	 title9 = jsono.getString("titel");
                  	title9=title9.replaceAll(" ", "_");
    			    title9=title9.replaceAll("&", "@");
                  	String delete9="Delete";
                   	this.delete9=delete9;
                  	this.id9=id9;this.title9=title9;
                  	}catch(Exception e) {id9=""; title9=""; delete9="";
					this.delete9=delete9;this.id9=id9;this.title9=title9;}  
        }

    //spara recept
	public void addRecipe(int id, String name) throws IOException {
		
		 URL url = new URL("http://localhost:8081/RecipeGeneratorServer/rest/RecipeService/addrecipe?id="+id+"&name="+name+"&user="+user);
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
	             
	             String title0, title1, title2, title3, title4, title5, title6, title7, title8, title9;
	             String id0, id1, id2, id3, id4, id5, id6, id7, id8, id9;
	             String new0 = "NEW", new1 = "NEW", new2 = "NEW", new3 = "NEW", new4 = "NEW", new5 = "NEW", new6 = "NEW", new7 = "NEW", new8 = "NEW", new9 = "NEW";

	             try {
	            	 jsonarray = jsonobject.getJSONArray("results");
	            	 if(jsonarray.length()==1) {
	            	 }else {new0="";}this.new0=new0;
		        	 JSONObject jsono = new JSONObject();
	             jsono = jsonarray.getJSONObject(0);
                  	 id0 = jsono.getString("id");
                  	 title0 = jsono.getString("titel");
     			    title0=title0.replaceAll(" ", "_");
    			    title0=title0.replaceAll("&", "@");
    			    String delete0="Delete";
                   	this.delete0=delete0;
                  	 this.id0=id0;this.title0=title0;
	             	 }catch(Exception e) {id0=""; title0=""; delete0="";
						this.delete0=delete0;this.id0=id0;this.title0=title0;}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
   	            	 if(jsonarray.length()==2) {
	            	 }else {new1="";}this.new1=new1;
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(1);
                  	 id1 = jsono.getString("id");
                  	 title1 = jsono.getString("titel");
     			    title1=title1.replaceAll(" ", "_");
    			    title1=title1.replaceAll("&", "@");
    			    String delete1="Delete";
                   	this.delete1=delete1;
                  	this.id1=id1;this.title1=title1;
                  	 }catch(Exception e) {id1=""; title1=""; delete1="";
 					this.delete1=delete1;this.id1=id1;this.title1=title1;}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
   	            	 if(jsonarray.length()==3) {
	            	 }else{new2="";}this.new2=new2;
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(2);
                  	 id2 = jsono.getString("id");
                  	 title2 = jsono.getString("titel");
     			    title2=title2.replaceAll(" ", "_");
    			    title2=title2.replaceAll("&", "@");
    			    String delete2="Delete";
                   	this.delete2=delete2;
                  	this.id2=id2;this.title2=title2;
                  	}catch(Exception e) {id2=""; title2=""; delete2="";
					this.delete2=delete2;this.id2=id2;this.title2=title2;}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
   	            	 if(jsonarray.length()==4) {	            		 
	            	 }else {new3="";}this.new3=new3;
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(3);
                  	 id3 = jsono.getString("id");
                  	 title3 = jsono.getString("titel");
     			    title3=title3.replaceAll(" ", "_");
    			    title3=title3.replaceAll("&", "@");
    			    String delete3="Delete";
                   	this.delete3=delete3;
                  	this.id3=id3;this.title3=title3;
                  	}catch(Exception e) {id3=""; title3=""; delete3="";
					this.delete3=delete3;this.id3=id3;this.title3=title3;}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
   	            	 if(jsonarray.length()==5) {	            		
	            	 }else {new4="";}this.new4=new4;
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(4);
                  	 id4 = jsono.getString("id");
                  	 title4 = jsono.getString("titel");
     			    title4=title4.replaceAll(" ", "_");
    			    title4=title4.replaceAll("&", "@");
    			    String delete4="Delete";
                   	this.delete4=delete4;
                  	this.id4=id4;this.title4=title4;
                  	}catch(Exception e) {id4=""; title4=""; delete4="";
					this.delete4=delete4;this.id4=id4;this.title4=title4;}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
   	            	 if(jsonarray.length()==6) {	            		 
	            	 }else {new5="";}this.new5=new5;
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(5);
                  	 id5 = jsono.getString("id");
                  	 title5 = jsono.getString("titel");
     			    title5=title5.replaceAll(" ", "_");
    			    title5=title5.replaceAll("&", "@");
    			    String delete5="Delete";
                   	this.delete5=delete5;
                  	this.id5=id5;this.title5=title5;
                  	}catch(Exception e) {id5=""; title5=""; delete5="";
					this.delete5=delete5;this.id5=id5;this.title5=title5;}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
   	            	 if(jsonarray.length()==7) {	            		 
	            	 }else {new6="";}this.new6=new6;
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(6);
                  	 id6 = jsono.getString("id");
                  	 title6 = jsono.getString("titel");
     			    title6=title6.replaceAll(" ", "_");
    			    title6=title6.replaceAll("&", "@");
    			    String delete6="Delete";
                   	this.delete6=delete6;
                  	this.id6=id6;this.title6=title6;
                  	}catch(Exception e) {id6=""; title6=""; delete6="";
					this.delete6=delete6;this.id6=id6;this.title6=title6;}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
   	            	 if(jsonarray.length()==8) {	            		 
	            	 }else {new7="";}this.new7=new7;
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(7);
                  	 id7 = jsono.getString("id");
                  	 title7 = jsono.getString("titel");
     			    title7=title7.replaceAll(" ", "_");
    			    title7=title7.replaceAll("&", "@");
    			    String delete7="Delete";
                   	this.delete7=delete7;
                  	this.id7=id7;this.title7=title7;
                  	}catch(Exception e) {id7=""; title7=""; delete7="";
					this.delete7=delete7;this.id7=id7;this.title7=title7;}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
   	            	 if(jsonarray.length()==9) {	            		 
	            	 }else {new8="";}this.new8=new8;
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(8);
                  	 id8 = jsono.getString("id");
                  	 title8 = jsono.getString("titel");
     			    title8=title8.replaceAll(" ", "_");
    			    title8=title8.replaceAll("&", "@");
    			    String delete8="Delete";
                   	this.delete8=delete8;
                  	this.id8=id8;this.title8=title8;
                  	}catch(Exception e) {id8=""; title8=""; delete8="";
					this.delete8=delete8;this.id8=id8;this.title8=title8;}
                  	 try {
                  		jsonarray = jsonobject.getJSONArray("results");
   	            	 if(jsonarray.length()==10) {	            		 
	            	 }else {new9="";}this.new9=new9;
   		        	 JSONObject jsono = new JSONObject();
    	             jsono = jsonarray.getJSONObject(9);
                  	 id9 = jsono.getString("id");
                  	 title9 = jsono.getString("titel");
     			    title9=title9.replaceAll(" ", "_");
    			    title9=title9.replaceAll("&", "@");
    			    String delete9="Delete";
                   	this.delete9=delete9;
                  	this.id9=id9;this.title9=title9;
                  	}catch(Exception e) {id9=""; title9=""; delete9="";
					this.delete9=delete9;this.id9=id9;this.title9=title9;}
                  	 
                  	
        }
	}
