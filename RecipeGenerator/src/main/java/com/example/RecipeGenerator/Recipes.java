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

public class Recipes {
	
	
    public void setOption(int option) throws IOException { 
    	this.option=option;	
    }
	
	public void setContent(String content) throws IOException {
		this.content=content;
	}
	
    private int option;
    public int getOption() {
      return option;
    }

	
    private String content;
    public String getContent() {
      return content;
    }
    

    
    String res0, res1, res2, res3, res4, res5, res6, res7, res8, res9, res10, res11;
    public String getRes0() {
        return res0;
      }
    public String getRes1() {
        return res1;
      }
    public String getRes2() {
        return res2;
      }
    public String getRes3() {
        return res3;
      }
    public String getRes4() {
        return res4;
      }
    public String getRes5() {
        return res5;
      }
    public String getRes6() {
        return res6;
      }
    public String getRes7() {
        return res7;
      }
    public String getRes8() {
        return res8;
      }
    public String getRes9() {
        return res9;
      }
    public String getRes10() {
        return res10;
      }
    public String getRes11() {
        return res11;
      }
    
    private String used0, used1, used2, used3, used4, used5, used6, used7, used8, used9, used10, used11;
    public String getUsed0() {
      return used0;
    }
    public String getUsed1() {
        return used1;
      }
    public String getUsed2() {
        return used2;
      }
    public String getUsed3() {
        return used3;
      }
    public String getUsed4() {
        return used4;
      }
    public String getUsed5() {
        return used5;
      }
    public String getUsed6() {
        return used6;
      }
    public String getUsed7() {
        return used7;
      }
    public String getUsed8() {
        return used8;
      }
    public String getUsed9() {
        return used9;
      }
    public String getUsed10() {
        return used10;
      }
    public String getUsed11() {
        return used11;
      }
    
    private String missed0, missed1, missed2, missed3, missed4, missed5, missed6, missed7, missed8, missed9, missed10, missed11;
    public String getMissed0() {
      return missed0;
    }
    public String getMissed1() {
        return missed1;
      }
    public String getMissed2() {
        return missed2;
      }
    public String getMissed3() {
        return missed3;
      }
    public String getMissed4() {
        return missed4;
      }
    public String getMissed5() {
        return missed5;
      }
    public String getMissed6() {
        return missed6;
      }
    public String getMissed7() {
        return missed7;
      }
    public String getMissed8() {
        return missed8;
      }
    public String getMissed9() {
        return missed9;
      }
    public String getMissed10() {
        return missed10;
      }
    public String getMissed11() {
        return missed11;
      }
    
    private String src0, src1, src2, src3, src4, src5, src6, src7, src8, src9, src10, src11;
    public String getSrc0() {
        return src0;
      }
    public String getSrc1() {
        return src1;
      }
    public String getSrc2() {
        return src2;
      }
    public String getSrc3() {
        return src3;
      }
    public String getSrc4() {
        return src4;
      }
    public String getSrc5() {
        return src5;
      }
    public String getSrc6() {
        return src6;
      }
    public String getSrc7() {
        return src7;
      }
    public String getSrc8() {
        return src8;
      }
    public String getSrc9() {
        return src9;
      }
    public String getSrc10() {
        return src10;
      }
    public String getSrc11() {
        return src11;
      }
    
    private String titel0, titel1, titel2, titel3, titel4, titel5, titel6, titel7, titel8, titel9, titel10, titel11;
    public String getTitel0() {
        return titel0;
      }
    public String getTitel1() {
        return titel1;
      }
    public String getTitel2() {
        return titel2;
      }
    public String getTitel3() {
        return titel3;
      }
    public String getTitel4() {
        return titel4;
      }
    public String getTitel5() {
        return titel5;
      }
    public String getTitel6() {
        return titel6;
      }
    public String getTitel7() {
        return titel7;
      }
    public String getTitel8() {
        return titel8;
      }
    public String getTitel9() {
        return titel9;
      }
    public String getTitel10() {
        return titel10;
      }
    public String getTitel11() {
        return titel11;
      }
    
    private int id0, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11;
    public int getId0() {
        return id0;
      }
    public int getId1() {
        return id1;
      }
    public int getId2() {
        return id2;
      }
    public int getId3() {
        return id3;
      }
    public int getId4() {
        return id4;
      }
    public int getId5() {
        return id5;
      }
    public int getId6() {
        return id6;
      }
    public int getId7() {
        return id7;
      }
    public int getId8() {
        return id8;
      }
    public int getId9() {
        return id9;
      }
    public int getId10() {
        return id10;
      }
    public int getId11() {
        return id11;
      }
    
    
//sökning på recept efter inmatade ingredienser
    public void execute() throws IOException { 
    	try {
      System.setProperty("http.agent", "Firefox");
      content = content.replaceAll(" ", "%20");
      
      URL url = new URL("http://localhost:8081/RecipeGeneratorServer/rest/RecipeService/recipes?content="+content+"&option="+option);
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
     
      con.setDoOutput(true);
      con.setRequestMethod("GET");
      con.setRequestProperty("Content-Type", "application/json");
      
      BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
      String output = "{results:"+br.readLine()+"}";
      
      
      
      

      	
      	JSONObject jsonobject = new JSONObject(output);
      	
      	JSONArray jsonarray = new JSONArray();
        jsonarray = jsonobject.getJSONArray("results");
      	
      	jsonobject = jsonarray.getJSONObject(0);


      
      
      
          
          JSONObject jsonobject0 = new JSONObject(output),
          			 jsonobject1 = new JSONObject(output),
          			 jsonobject2 = new JSONObject(output),
          			 jsonobject3 = new JSONObject(output),
          			 jsonobject4 = new JSONObject(output),
          			 jsonobject5 = new JSONObject(output),
          			 jsonobject6 = new JSONObject(output),
          			 jsonobject7 = new JSONObject(output),
          			 jsonobject8 = new JSONObject(output),
          			 jsonobject9 = new JSONObject(output),
          			 jsonobject10 = new JSONObject(output),
          			 jsonobject11 = new JSONObject(output);

	          JSONArray jsonarray0 = jsonobject0.getJSONArray("results"),
	        		    jsonarray1 = jsonobject1.getJSONArray("results"),
	        		    jsonarray2 = jsonobject2.getJSONArray("results"),
	    	        	jsonarray3 = jsonobject3.getJSONArray("results"),
	    	        	jsonarray4 = jsonobject4.getJSONArray("results"),
	    	        	jsonarray5 = jsonobject5.getJSONArray("results"),
	    	        	jsonarray6 = jsonobject6.getJSONArray("results"),
	    	        	jsonarray7 = jsonobject7.getJSONArray("results"),
	    	        	jsonarray8 = jsonobject8.getJSONArray("results"),
	        		    jsonarray9 = jsonobject9.getJSONArray("results"),
	          			jsonarray10 = jsonobject10.getJSONArray("results"),
	          			jsonarray11 = jsonobject11.getJSONArray("results");
	          
	          content = content.replaceAll("%20", " ");
	          content="\n"+"Your search: "+content;

	    	    jsonobject0 = jsonarray0.getJSONObject(0);
	    	    jsonobject1 = jsonarray1.getJSONObject(1);
	    	    jsonobject2 = jsonarray2.getJSONObject(2);
	    	    jsonobject3 = jsonarray3.getJSONObject(3);
	          	jsonobject4 = jsonarray4.getJSONObject(4);
	          	jsonobject5 = jsonarray5.getJSONObject(5);
	          	jsonobject6 = jsonarray6.getJSONObject(6);
	          	jsonobject7 = jsonarray7.getJSONObject(7);
	          	jsonobject8 = jsonarray8.getJSONObject(8);
	          	jsonobject9 = jsonarray9.getJSONObject(9);
	          	jsonobject10 = jsonarray10.getJSONObject(10);
	          	jsonobject11 = jsonarray11.getJSONObject(11);
	          	
	          	
	          	String src0 = jsonobject0.getString("image");
	          	String src1 = jsonobject1.getString("image");
	          	String src2 = jsonobject2.getString("image");
	          	String src3 = jsonobject3.getString("image");
	          	String src4 = jsonobject4.getString("image");
	          	String src5 = jsonobject5.getString("image");
	          	String src6 = jsonobject6.getString("image");
	          	String src7 = jsonobject7.getString("image");
	          	String src8 = jsonobject8.getString("image");
	          	String src9 = jsonobject9.getString("image");	
	          	String src10 = jsonobject10.getString("image");
	          	String src11 = jsonobject11.getString("image");
	          	
	          	String titel0 = jsonobject0.getString("title");
	          	String titel1 = jsonobject1.getString("title");
	          	String titel2 = jsonobject2.getString("title");
	          	String titel3 = jsonobject3.getString("title");
	          	String titel4 = jsonobject4.getString("title");
	          	String titel5 = jsonobject5.getString("title");
	          	String titel6 = jsonobject6.getString("title");
	          	String titel7 = jsonobject7.getString("title");
	          	String titel8 = jsonobject8.getString("title");
	          	String titel9 = jsonobject9.getString("title");
	          	String titel10 = jsonobject10.getString("title");
	          	String titel11 = jsonobject11.getString("title");

	          	String res0 = jsonobject0.getString("res");
	          	String res1 = jsonobject1.getString("res");
	          	String res2 = jsonobject2.getString("res");
	          	String res3 = jsonobject3.getString("res");
	          	String res4 = jsonobject4.getString("res");
	          	String res5 = jsonobject5.getString("res");
	          	String res6 = jsonobject6.getString("res");
	          	String res7 = jsonobject7.getString("res");
	          	String res8 = jsonobject8.getString("res");
	          	String res9 = jsonobject9.getString("res");
	          	String res10 = jsonobject10.getString("res");
	          	String res11 = jsonobject11.getString("res");
	          	
	          	String used0 = jsonobject0.getString("usedIngredients");
	          	String used1 = jsonobject1.getString("usedIngredients");
	          	String used2 = jsonobject2.getString("usedIngredients");
	          	String used3 = jsonobject3.getString("usedIngredients");
	          	String used4 = jsonobject4.getString("usedIngredients");
	          	String used5 = jsonobject5.getString("usedIngredients");
	          	String used6 = jsonobject6.getString("usedIngredients");
	          	String used7 = jsonobject7.getString("usedIngredients");
	          	String used8 = jsonobject8.getString("usedIngredients");
	          	String used9 = jsonobject9.getString("usedIngredients");	
	          	String used10 = jsonobject10.getString("usedIngredients");
	          	String used11 = jsonobject11.getString("usedIngredients");
	          	
	          	String missed0 = jsonobject0.getString("missedIngredients");
	          	String missed1 = jsonobject1.getString("missedIngredients");
	          	String missed2 = jsonobject2.getString("missedIngredients");
	          	String missed3 = jsonobject3.getString("missedIngredients");
	          	String missed4 = jsonobject4.getString("missedIngredients");
	          	String missed5 = jsonobject5.getString("missedIngredients");
	          	String missed6 = jsonobject6.getString("missedIngredients");
	          	String missed7 = jsonobject7.getString("missedIngredients");
	          	String missed8 = jsonobject8.getString("missedIngredients");
	          	String missed9 = jsonobject9.getString("missedIngredients");	
	          	String missed10 = jsonobject10.getString("missedIngredients");
	          	String missed11 = jsonobject11.getString("missedIngredients");

	          	int id0 = jsonobject0.getInt("id");
	          	int id1 = jsonobject1.getInt("id");
	          	int id2 = jsonobject2.getInt("id");
	          	int id3 = jsonobject3.getInt("id");
	          	int id4 = jsonobject4.getInt("id");
	          	int id5 = jsonobject5.getInt("id");
	          	int id6 = jsonobject6.getInt("id");
	          	int id7 = jsonobject7.getInt("id");
	          	int id8 = jsonobject8.getInt("id");
	          	int id9 = jsonobject9.getInt("id");
	          	int id10 = jsonobject10.getInt("id");
	          	int id11 = jsonobject11.getInt("id");
	          	
	          	
	          	
		        this.src0 = src0;
		        this.src1 = src1;
		        this.src2 = src2;
		        this.src3 = src3;
		        this.src4 = src4;
		        this.src5 = src5;
		        this.src6 = src6;
		        this.src7 = src7;
		        this.src8 = src8;
		        this.src9 = src9;
		        this.src10 = src10;
		        this.src11 = src11;
		        
		        this.titel0 = titel0;
		        this.titel1 = titel1;
		        this.titel2 = titel2;
		        this.titel3 = titel3;
		        this.titel4 = titel4;
		        this.titel5 = titel5;
		        this.titel6 = titel6;
		        this.titel7 = titel7;
		        this.titel8 = titel8;
		        this.titel9 = titel9;
		        this.titel10 = titel10;
		        this.titel11 = titel11;
	          	
	          	this.res0 = res0;
	          	this.res1 = res1;
	          	this.res2 = res2;
	          	this.res3 = res3;
	          	this.res4 = res4;
	          	this.res5 = res5;
	          	this.res6 = res6;
	          	this.res7 = res7;
	          	this.res8 = res8;
	          	this.res9 = res9;
	          	this.res10 = res10;
	          	this.res11 = res11;
		        
		        this.used0 = used0;
		        this.used1 = used1;
		        this.used2 = used2;
		        this.used3 = used3;
		        this.used4 = used4;
		        this.used5 = used5;
		        this.used6 = used6;
		        this.used7 = used7;
		        this.used8 = used8;
		        this.used9 = used9;
		        this.used10 = used10;
		        this.used11 = used11;
		        
		        this.missed0 = missed0;
		        this.missed1 = missed1;
		        this.missed2 = missed2;
		        this.missed3 = missed3;
		        this.missed4 = missed4;
		        this.missed5 = missed5;
		        this.missed6 = missed6;
		        this.missed7 = missed7;
		        this.missed8 = missed8;
		        this.missed9 = missed9;
		        this.missed10 = missed10;
		        this.missed11 = missed11;
          
		        this.id0 = id0;
		        this.id1 = id1;
		        this.id2 = id2;
		        this.id3 = id3;
		        this.id4 = id4;
		        this.id5 = id5;
		        this.id6 = id6;
		        this.id7 = id7;
		        this.id8 = id8;
		        this.id9 = id9;
		        this.id10 = id10;
		        this.id11 = id11;
		        
		        
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		content="Invalid search!";
    	}
    }

    
}