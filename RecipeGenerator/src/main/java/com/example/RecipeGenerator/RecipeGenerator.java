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

public class RecipeGenerator {
	
    public void setContent(String content) throws IOException { 
    	this.content=content;	
    }
    private String content;
    public String getContent() {
      return content;
    }
	
    public void setTimeframe(String timeframe) throws IOException { 
    	this.timeframe=timeframe;	
    }
    private String timeframe;
    public String getTimeframe() {
      return timeframe;
    }
    
	public void setcalories(String calories) throws IOException {
		this.calories=calories;	
	}
    private String calories;
    public String getcalories() {
      return calories;
    }
    
	public void setdiet(String diet) throws IOException {
		this.diet=diet;	
	}
    private String diet;
    public String getdiet() {
      return diet;
    }
    
	public void setexclude(String exclude) throws IOException {
		this.exclude=exclude;	
	}
    private String exclude;
    public String getexclude() {
      return exclude;
    }
    

    
    String id0, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id13, id14, id15, id16, id17, id18, id19, id20, id21, id22, id23, id24, id25, id26, id27;
    public String getId0() {
        return id0;
      }
    public String getId1() {
        return id1;
      }
    public String getId2() {
        return id2;
      }
    public String getId3() {
        return id3;
      }
    public String getId4() {
        return id4;
      }
    public String getId5() {
        return id5;
      }
    public String getId6() {
        return id6;
      }
    public String getId7() {
        return id7;
      }
    public String getId8() {
        return id8;
      }
    public String getId9() {
        return id9;
      }
    public String getId10() {
        return id10;
      }
    public String getId11() {
        return id11;
      }
    public String getId12() {
        return id12;
      }
    public String getId13() {
        return id13;
      }
    public String getId14() {
        return id14;
      }
    public String getId15() {
        return id15;
      }
    public String getId16() {
        return id16;
      }
    public String getId17() {
        return id17;
      }
    public String getId18() {
        return id18;
      }
    public String getId19() {
        return id19;
      }
    public String getId20() {
        return id20;
      }
    public String getId21() {
        return id21;
      }
    public String getId22() {
        return id22;
      }
    public String getId23() {
        return id23;
      }
    public String getId24() {
        return id24;
      }
    public String getId25() {
        return id25;
      }
    public String getId26() {
        return id26;
      }
    public String getId27() {
        return id27;
      }
    
    String src0, src1, src2, src3, src4, src5, src6, src7, src8, src9, src10, src11, src12, src13, src14, src15, src16, src17, src18, src19, src20, src21, src22, src23, src24, src25, src26, src27;
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
    public String getSrc12() {
        return src12;
      }
    public String getSrc13() {
        return src13;
      }
    public String getSrc14() {
        return src14;
      }
    public String getSrc15() {
        return src15;
      }
    public String getSrc16() {
        return src16;
      }
    public String getSrc17() {
        return src17;
      }
    public String getSrc18() {
        return src18;
      }
    public String getSrc19() {
        return src19;
      }
    public String getSrc20() {
        return src20;
      }
    public String getSrc21() {
        return src21;
      }
    public String getSrc22() {
        return src22;
      }
    public String getSrc23() {
        return src23;
      }
    public String getSrc24() {
        return src24;
      }
    public String getSrc25() {
        return src25;
      }
    public String getSrc26() {
        return src26;
      }
    public String getSrc27() {
        return src27;
      }
    
    String img0, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16, img17, img18, img19, img20, img21, img22, img23, img24, img25, img26, img27;
    public String getImg0() {
        return img0;
      }
    public String getImg1() {
        return img1;
      }
    public String getImg2() {
        return img2;
      }
    public String getImg3() {
        return img3;
      }
    public String getImg4() {
        return img4;
      }
    public String getImg5() {
        return img5;
      }
    public String getImg6() {
        return img6;
      }
    public String getImg7() {
        return img7;
      }
    public String getImg8() {
        return img8;
      }
    public String getImg9() {
        return img9;
      }
    public String getImg10() {
        return img10;
      }
    public String getImg11() {
        return img11;
      }
    public String getImg12() {
        return img12;
      }
    public String getImg13() {
        return img13;
      }
    public String getImg14() {
        return img14;
      }
    public String getImg15() {
        return img15;
      }
    public String getImg16() {
        return img16;
      }
    public String getImg17() {
        return img17;
      }
    public String getImg18() {
        return img18;
      }
    public String getImg19() {
        return img19;
      }
    public String getImg20() {
        return img20;
      }
    public String getImg21() {
        return img21;
      }
    public String getImg22() {
        return img22;
      }
    public String getImg23() {
        return img23;
      }
    public String getImg24() {
        return img24;
      }
    public String getImg25() {
        return img25;
      }
    public String getImg26() {
        return img26;
      }
    public String getImg27() {
        return img27;
      }


    
    String title0, title1, title2, title3, title4, title5, title6, title7, title8, title9, title10, title11, title12, title13, title14, title15, title16, title17, title18, title19, title20, title21, title22, title23, title24, title25, title26, title27;
    public String getTitle0() {
        return title0;
      }
    public String getTitle1() {
        return title1;
      }
    public String getTitle2() {
        return title2;
      }
    public String getTitle3() {
        return title3;
      }
    public String getTitle4() {
        return title4;
      }
    public String getTitle5() {
        return title5;
      }
    public String getTitle6() {
        return title6;
      }
    public String getTitle7() {
        return title7;
      }
    public String getTitle8() {
        return title8;
      }
    public String getTitle9() {
        return title9;
      }
    public String getTitle10() {
        return title10;
      }
    public String getTitle11() {
        return title11;
      }
    public String getTitle12() {
        return title12;
      }
    public String getTitle13() {
        return title13;
      }
    public String getTitle14() {
        return title14;
      }
    public String getTitle15() {
        return title15;
      }
    public String getTitle16() {
        return title16;
      }
    public String getTitle17() {
        return title17;
      }
    public String getTitle18() {
        return title18;
      }
    public String getTitle19() {
        return title19;
      }
    public String getTitle20() {
        return title20;
      }
    public String getTitle21() {
        return title21;
      }
    public String getTitle22() {
        return title22;
      }
    public String getTitle23() {
        return title23;
      }
    public String getTitle24() {
        return title24;
      }
    public String getTitle25() {
        return title25;
      }
    public String getTitle26() {
        return title26;
      }
    public String getTitle27() {
        return title27;
      }
    
    String rim0, rim1, rim2, rim3, rim4, rim5, rim6, rim7, rim8, rim9, rim10, rim11, rim12, rim13, rim14, rim15, rim16, rim17, rim18, rim19, rim20, rim21, rim22, rim23, rim24, rim25, rim26, rim27;
    public String getRim0() {
        return rim0;
      }
    public String getRim1() {
        return rim1;
      }
    public String getRim2() {
        return rim2;
      }
    public String getRim3() {
        return rim3;
      }
    public String getRim4() {
        return rim4;
      }
    public String getRim5() {
        return rim5;
      }
    public String getRim6() {
        return rim6;
      }
    public String getRim7() {
        return rim7;
      }
    public String getRim8() {
        return rim8;
      }
    public String getRim9() {
        return rim9;
      }
    public String getRim10() {
        return rim10;
      }
    public String getRim11() {
        return rim11;
      }
    public String getRim12() {
        return rim12;
      }
    public String getRim13() {
        return rim13;
      }
    public String getRim14() {
        return rim14;
      }
    public String getRim15() {
        return rim15;
      }
    public String getRim16() {
        return rim16;
      }
    public String getRim17() {
        return rim17;
      }
    public String getRim18() {
        return rim18;
      }
    public String getRim19() {
        return rim19;
      }
    public String getRim20() {
        return rim20;
      }
    public String getRim21() {
        return rim21;
      }
    public String getRim22() {
        return rim22;
      }
    public String getRim23() {
        return rim23;
      }
    public String getRim24() {
        return rim24;
      }
    public String getRim25() {
        return rim25;
      }
    public String getRim26() {
        return rim26;
      }
    public String getRim27() {
        return rim27;
      }
    
    String calories0, calories1, calories2, calories3, calories4, calories5, calories6;
    public String getCalories0() {
        return calories0;
      }
    public String getCalories1() {
        return calories1;
      }
    public String getCalories2() {
        return calories2;
      }
    public String getCalories3() {
        return calories3;
      }
    public String getCalories4() {
        return calories4;
      }
    public String getCalories5() {
        return calories5;
      }
    public String getCalories6() {
        return calories6;
      }

    String protein0, protein1, protein2, protein3, protein4, protein5, protein6;
    public String getProtein0() {
        return protein0;
      }
    public String getProtein1() {
        return protein1;
      }
    public String getProtein2() {
        return protein2;
      }
    public String getProtein3() {
        return protein3;
      }
    public String getProtein4() {
        return protein4;
      }
    public String getProtein5() {
        return protein5;
      }
    public String getProtein6() {
        return protein6;
      }

    
    String fat0, fat1, fat2, fat3, fat4, fat5, fat6;
    public String getFat0() {
        return fat0;
      }
    public String getFat1() {
        return fat1;
      }
    public String getFat2() {
        return fat2;
      }
    public String getFat3() {
        return fat3;
      }
    public String getFat4() {
        return fat4;
      }
    public String getFat5() {
        return fat5;
      }
    public String getFat6() {
        return fat6;
      }

    
    String carbs0, carbs1, carbs2, carbs3, carbs4, carbs5, carbs6;
    public String getCarbs0() {
        return carbs0;
      }
    public String getCarbs1() {
        return carbs1;
      }
    public String getCarbs2() {
        return carbs2;
      }
    public String getCarbs3() {
        return carbs3;
      }
    public String getCarbs4() {
        return carbs4;
      }
    public String getCarbs5() {
        return carbs5;
      }
    public String getCarbs6() {
        return carbs6;
      }

    
//generera måltider baserat på val
    public void execute() throws IOException { 
    	
    exclude=exclude.replaceAll(", ", ",");
    exclude=exclude.replaceAll(" ", "");
      System.setProperty("http.agent", "Firefox");
      if(calories!="") {
      calories="&targetcal="+calories;}
      if(diet!="") {
 	  diet="&diet="+diet;}
      if(exclude!="") {
 	  exclude="&exclude="+exclude;}
      
      URL url = new URL("http://localhost:8081/RecipeGeneratorServer/rest/RecipeService/generate?timeframe="+timeframe+calories+diet+exclude);
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      System.out.println(url);
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
          			 jsonobject11 = new JSONObject(output),
          			 jsonobject12 = new JSONObject(output),
          			 jsonobject13 = new JSONObject(output),
          			 jsonobject14 = new JSONObject(output),
          			 jsonobject15 = new JSONObject(output),
          			 jsonobject16 = new JSONObject(output),
          			 jsonobject17 = new JSONObject(output),
          			 jsonobject18 = new JSONObject(output),
          			 jsonobject19 = new JSONObject(output),
          			 jsonobject20 = new JSONObject(output),
          			 jsonobject21 = new JSONObject(output),
          			 jsonobject22 = new JSONObject(output),
          			 jsonobject23 = new JSONObject(output),
          			 jsonobject24 = new JSONObject(output),
                     jsonobject25 = new JSONObject(output),
                     jsonobject26 = new JSONObject(output),
          			 jsonobject27 = new JSONObject(output);
          

	          JSONArray jsonarray0 = jsonobject0.getJSONArray("results");


	    	    jsonobject0 = jsonarray0.getJSONObject(0);
	    	    try {
	    	    jsonobject1 = jsonarray0.getJSONObject(1);
	    	    jsonobject2 = jsonarray0.getJSONObject(2);
	    	    jsonobject3 = jsonarray0.getJSONObject(3);
	          	jsonobject4 = jsonarray0.getJSONObject(4);
	          	jsonobject5 = jsonarray0.getJSONObject(5);
	          	jsonobject6 = jsonarray0.getJSONObject(6);
	          	jsonobject7 = jsonarray0.getJSONObject(7);
	          	jsonobject8 = jsonarray0.getJSONObject(8);
	          	jsonobject9 = jsonarray0.getJSONObject(9);
	          	jsonobject10 = jsonarray0.getJSONObject(10);
	          	jsonobject11 = jsonarray0.getJSONObject(11);
	          	jsonobject12 = jsonarray0.getJSONObject(12);
	    	    jsonobject13 = jsonarray0.getJSONObject(13);
	    	    jsonobject14 = jsonarray0.getJSONObject(14);
	    	    jsonobject15 = jsonarray0.getJSONObject(15);
	          	jsonobject16 = jsonarray0.getJSONObject(16);
	          	jsonobject17 = jsonarray0.getJSONObject(17);
	          	jsonobject18 = jsonarray0.getJSONObject(18);
	          	jsonobject19 = jsonarray0.getJSONObject(19);
	          	jsonobject20 = jsonarray0.getJSONObject(20);
	          	jsonobject21 = jsonarray0.getJSONObject(21);
	          	jsonobject22 = jsonarray0.getJSONObject(22);
	          	jsonobject23 = jsonarray0.getJSONObject(23);
	          	jsonobject24 = jsonarray0.getJSONObject(24);
	    	    jsonobject25 = jsonarray0.getJSONObject(25);
	    	    jsonobject26 = jsonarray0.getJSONObject(26);
	    	    jsonobject27 = jsonarray0.getJSONObject(27);
	    	    }catch(Exception e) {}
	    	    
	    	    try {
	          	String id0 = jsonobject0.getString("id");
	          	String id1 = jsonobject1.getString("id");
	          	String id2 = jsonobject2.getString("id");
	          	
		        this.id0 = id0;
		        this.id1 = id1;
		        this.id2 = id2;
	    	    }catch(Exception e) {}
	    	    try {
	          	String id4 = jsonobject4.getString("id");
	          	String id5 = jsonobject5.getString("id");
	          	String id6 = jsonobject6.getString("id");
	          	
		        this.id4 = id4;
		        this.id5 = id5;
		        this.id6 = id6;
	    	    }catch(Exception e) {}
	    	    try {
	          	String id8 = jsonobject8.getString("id");
	          	String id9 = jsonobject9.getString("id");
	          	String id10 = jsonobject10.getString("id");
	          	
	          	this.id8 = id8;
		        this.id9 = id9;
		        this.id10 = id10;
	    	    }catch(Exception e) {}
	    	    try {
	          	String id12 = jsonobject12.getString("id");
	          	String id13 = jsonobject13.getString("id");
	          	String id14 = jsonobject14.getString("id");
	          	
		        this.id12 = id12;
		        this.id13 = id13;
		        this.id14 = id14;
	    	    }catch(Exception e) {}
	    	    try {
	          	String id16 = jsonobject16.getString("id");
	          	String id17 = jsonobject17.getString("id");
	          	String id18 = jsonobject18.getString("id");
	          	
		        this.id16 = id16;
		        this.id17 = id17;
		        this.id18 = id18;
	    	    }catch(Exception e) {}
	    	    try {
	          	String id20 = jsonobject20.getString("id");
	          	String id21 = jsonobject21.getString("id");
	          	String id22 = jsonobject22.getString("id");
		        
		        this.id20 = id20;
		        this.id21 = id21;
		        this.id22 = id22;
	    	    }catch(Exception e) {}
	    	    try {
	          	String id24 = jsonobject24.getString("id");
	          	String id25 = jsonobject25.getString("id");
	          	String id26 = jsonobject26.getString("id");
		        
		        this.id24 = id24;
		        this.id25 = id25;
		        this.id26 = id26;
	    	    }catch(Exception e) {}

	          	try {
	          	String title0 = jsonobject0.getString("title");
		        this.title0 = title0;
	          	}catch(Exception e) {}
	    	    try {
	          	String title1 = jsonobject1.getString("title");
	          	String title2 = jsonobject2.getString("title");
		        
		        this.title1 = title1;
		        this.title2 = title2;
	          	}catch(Exception e) {}
	    	    try {
	          	String title4 = jsonobject4.getString("title");
	          	String title5 = jsonobject5.getString("title");
	          	String title6 = jsonobject6.getString("title");
	          	
		        this.title4 = title4;
		        this.title5 = title5;
		        this.title6 = title6;
	    	    }catch(Exception e) {}
	    	    try {
	          	String title8 = jsonobject8.getString("title");
	          	String title9 = jsonobject9.getString("title");
	          	String title10 = jsonobject10.getString("title");
	          	
		        
		        this.title8 = title8;
		        this.title9 = title9;
		        this.title10 = title10;
	    	    }catch(Exception e) {}
	    	    try {
	          	String title12 = jsonobject12.getString("title");
	          	String title13 = jsonobject13.getString("title");
	          	String title14 = jsonobject14.getString("title");
	          	
		        
		        this.title12 = title12;
		        this.title13 = title13;
		        this.title14 = title14;
	    	    }catch(Exception e) {}
	    	    try {
	          	String title16 = jsonobject16.getString("title");
	          	String title17 = jsonobject17.getString("title");
	          	String title18 = jsonobject18.getString("title");
		        
		        this.title16 = title16;
		        this.title17 = title17;
		        this.title18 = title18;
	    	    }catch(Exception e) {}
	    	    try {
	          	String title20 = jsonobject20.getString("title");
	          	String title21 = jsonobject21.getString("title");
	          	String title22 = jsonobject22.getString("title");
	          	
		        
		        this.title20 = title20;
		        this.title21 = title21;
		        this.title22 = title22;
	    	    }catch(Exception e) {}
	    	    try {
	          	String title24 = jsonobject24.getString("title");
	          	String title25 = jsonobject25.getString("title");
	          	String title26 = jsonobject26.getString("title");
	          	
		        this.title24 = title24;
		        this.title25 = title25;
		        this.title26 = title26;
	          	}catch(Exception e) {}
	          	
	          	try {
	          	String rim0 = jsonobject0.getString("rim");
	          	String rim1 = jsonobject1.getString("rim");
	          	String rim2 = jsonobject2.getString("rim");
	          	
		        this.rim0 = rim0;
		        this.rim1 = rim1;
		        this.rim2 = rim2;
	          	}catch(Exception e) {}
	    	    try {
	          	String rim4 = jsonobject4.getString("rim");
	          	String rim5 = jsonobject5.getString("rim");
	          	String rim6 = jsonobject6.getString("rim");
		        
		        this.rim4 = rim4;
		        this.rim5 = rim5;
		        this.rim6 = rim6;
	    	    }catch(Exception e) {}
	    	    try {
	          	String rim8 = jsonobject8.getString("rim");
	          	String rim9 = jsonobject9.getString("rim");
	          	String rim10 = jsonobject10.getString("rim");
		        
		        this.rim8 = rim8;
		        this.rim9 = rim9;
		        this.rim10 = rim10;
	    	    }catch(Exception e) {}
	    	    try {
	          	String rim12 = jsonobject12.getString("rim");
	          	String rim13 = jsonobject13.getString("rim");
	          	String rim14 = jsonobject14.getString("rim");
		        
		        this.rim12 = rim12;
		        this.rim13 = rim13;
		        this.rim14 = rim14;
	    	    }catch(Exception e) {}
	    	    try {
	          	String rim16 = jsonobject16.getString("rim");
	          	String rim17 = jsonobject17.getString("rim");
	          	String rim18 = jsonobject18.getString("rim");
		        
		        this.rim16 = rim16;
		        this.rim17 = rim17;
		        this.rim18 = rim18;
	    	    }catch(Exception e) {}
	    	    try {
	          	String rim20 = jsonobject20.getString("rim");
	          	String rim21 = jsonobject21.getString("rim");
	          	String rim22 = jsonobject22.getString("rim");
		        
		        this.rim20 = rim20;
		        this.rim21 = rim21;
		        this.rim22 = rim22;
	    	    }catch(Exception e) {}
	    	    try {
	          	String rim24 = jsonobject24.getString("rim");
	          	String rim25 = jsonobject25.getString("rim");
	          	String rim26 = jsonobject26.getString("rim");
		        
		        this.rim24 = rim24;
		        this.rim25 = rim25;
		        this.rim26 = rim26;
	          	}catch(Exception e) {}
	    	    
	    	    
	          	try {
	          	String img0 = jsonobject0.getString("img");
	          	String img1 = jsonobject1.getString("img");
	          	String img2 = jsonobject2.getString("img");
	          	
		        this.img0 = img0;
		        this.img1 = img1;
		        this.img2 = img2;
	          	}catch(Exception e) {}
	    	    try {
	          	String img4 = jsonobject4.getString("img");
	          	String img5 = jsonobject5.getString("img");
	          	String img6 = jsonobject6.getString("img");
		        
		        this.img4 = img4;
		        this.img5 = img5;
		        this.img6 = img6;
	    	    }catch(Exception e) {}
	    	    try {
	          	String img8 = jsonobject8.getString("img");
	          	String img9 = jsonobject9.getString("img");
	          	String img10 = jsonobject10.getString("img");
		        
		        this.img8 = img8;
		        this.img9 = img9;
		        this.img10 = img10;
	    	    }catch(Exception e) {}
	    	    try {
	          	String img12 = jsonobject12.getString("img");
	          	String img13 = jsonobject13.getString("img");
	          	String img14 = jsonobject14.getString("img");
		        
		        this.img12 = img12;
		        this.img13 = img13;
		        this.img14 = img14;
	    	    }catch(Exception e) {}
	    	    try {
	          	String img16 = jsonobject16.getString("img");
	          	String img17 = jsonobject17.getString("img");
	          	String img18 = jsonobject18.getString("img");
		        
		        this.img16 = img16;
		        this.img17 = img17;
		        this.img18 = img18;
	    	    }catch(Exception e) {}
	    	    try {
	          	String img20 = jsonobject20.getString("img");
	          	String img21 = jsonobject21.getString("img");
	          	String img22 = jsonobject22.getString("img");
		        
		        this.img20 = img20;
		        this.img21 = img21;
		        this.img22 = img22;
	    	    }catch(Exception e) {}
	    	    try {
	          	String img24 = jsonobject24.getString("img");
	          	String img25 = jsonobject25.getString("img");
	          	String img26 = jsonobject26.getString("img");
		        
		        this.img24 = img24;
		        this.img25 = img25;
		        this.img26 = img26;
	          	}catch(Exception e) {}
	    	    
	    	    try {
		          	String src0 = "https://spoonacular.com/recipeImages/"+id0+"-636x393."+img0;
		          	String src1 = "https://spoonacular.com/recipeImages/"+id1+"-636x393."+img1;
		          	String src2 = "https://spoonacular.com/recipeImages/"+id2+"-636x393."+img2;

			        this.src0 = src0;
			        this.src1 = src1;
			        this.src2 = src2;
		          	}catch(Exception e) {}
		    	    try {
		          	String src4 = "https://spoonacular.com/recipeImages/"+id4+"-636x393."+img4;
		          	String src5 = "https://spoonacular.com/recipeImages/"+id5+"-636x393."+img5;
		          	String src6 = "https://spoonacular.com/recipeImages/"+id6+"-636x393."+img6;
			        
			        this.src4 = src4;
			        this.src5 = src5;
			        this.src6 = src6;
		    	    }catch(Exception e) {}
		    	    try {
		          	String src8 = "https://spoonacular.com/recipeImages/"+id8+"-636x393."+img8;
		          	String src9 = "https://spoonacular.com/recipeImages/"+id9+"-636x393."+img9;
		          	String src10 = "https://spoonacular.com/recipeImages/"+id10+"-636x393."+img10;
			        
			        this.src8 = src8;
			        this.src9 = src9;
			        this.src10 = src10;
		    	    }catch(Exception e) {}
		    	    try {
		          	String src12 = "https://spoonacular.com/recipeImages/"+id12+"-636x393."+img12;
		          	String src13 = "https://spoonacular.com/recipeImages/"+id13+"-636x393."+img13;
		          	String src14 = "https://spoonacular.com/recipeImages/"+id14+"-636x393."+img14;
			        
			        this.src12 = src12;
			        this.src13 = src13;
			        this.src14 = src14;
		    	    }catch(Exception e) {}
		    	    try {
		          	String src16 = "https://spoonacular.com/recipeImages/"+id16+"-636x393."+img16;
		          	String src17 = "https://spoonacular.com/recipeImages/"+id17+"-636x393."+img17;
		          	String src18 = "https://spoonacular.com/recipeImages/"+id18+"-636x393."+img18;
			        
			        this.src16 = src16;
			        this.src17 = src17;
			        this.src18 = src18;
		    	    }catch(Exception e) {}
		    	    try {
		          	String src20 = "https://spoonacular.com/recipeImages/"+id20+"-636x393."+img20;
		          	String src21 = "https://spoonacular.com/recipeImages/"+id21+"-636x393."+img21;
		          	String src22 = "https://spoonacular.com/recipeImages/"+id22+"-636x393."+img22;
			        
			        this.src20 = src20;
			        this.src21 = src21;
			        this.src22 = src22;
		    	    }catch(Exception e) {}
		    	    try {
		          	String src24 = "https://spoonacular.com/recipeImages/"+id24+"-636x393."+img24;
		          	String src25 = "https://spoonacular.com/recipeImages/"+id25+"-636x393."+img25;
		          	String src26 = "https://spoonacular.com/recipeImages/"+id26+"-636x393."+img26;
			        
			        this.src24 = src24;
			        this.src25 = src25;
			        this.src26 = src26;
		          	}catch(Exception e) {}

	          	try {
	          	String calories0 = jsonobject3.getString("calories");
		        
		        this.calories0 = calories0;
	          	}catch(Exception e) {}
	    	    try {
	          	String calories1 = jsonobject7.getString("calories");
		        
		        this.calories1 = calories1;
	    	    }catch(Exception e) {}
	    	    try {
	          	String calories2 = jsonobject11.getString("calories");
		        
		        this.calories2 = calories2;
	    	    }catch(Exception e) {}
	    	    try {
	          	String calories3 = jsonobject15.getString("calories");
		        
		        this.calories3 = calories3;
	    	    }catch(Exception e) {}
	    	    try {
	          	String calories4 = jsonobject19.getString("calories");

		        this.calories4 = calories4;
	    	    }catch(Exception e) {}
	    	    try {
	          	String calories5 = jsonobject23.getString("calories");
		        
		        this.calories5 = calories5;
	    	    }catch(Exception e) {}
	    	    try {
	          	String calories6 = jsonobject27.getString("calories");

		        this.calories6 = calories6;
	          	}catch(Exception e) {}
	          	
	          	try {
	          	String protein0 = jsonobject3.getString("protein");
	          	
	          	this.protein0 = protein0;
	          	}catch(Exception e) {}
	    	    try {
	          	String protein1 = jsonobject7.getString("protein");
	          	
	          	this.protein1 = protein1;
	    	    }catch(Exception e) {}
	    	    try {
	          	String protein2 = jsonobject11.getString("protein");
	          	
	          	this.protein2 = protein2;
	    	    }catch(Exception e) {}
	    	    try {
	          	String protein3 = jsonobject15.getString("protein");
	          	
	          	this.protein3 = protein3;
	    	    }catch(Exception e) {}
	    	    try {
	          	String protein4 = jsonobject19.getString("protein");
	          	
	          	this.protein4 = protein4;
	    	    }catch(Exception e) {}
	    	    try {
	          	String protein5 = jsonobject23.getString("protein");
	          	
	          	this.protein5 = protein5;
	    	    }catch(Exception e) {}
	    	    try {
	          	String protein6 = jsonobject27.getString("protein");

	          	this.protein6 = protein6;
	          	}catch(Exception e) {}
	          	
	          	try {
	          	String fat0 = jsonobject3.getString("fat");
	          	
	          	this.fat0 = fat0;
	          	}catch(Exception e) {}
	    	    try {
	          	String fat1 = jsonobject7.getString("fat");
	          	
	          	this.fat1 = fat1;
	    	    }catch(Exception e) {}
	    	    try {
	          	String fat2 = jsonobject11.getString("fat");
	          	
	          	this.fat2 = fat2;
	    	    }catch(Exception e) {}
	    	    try {
	          	String fat3 = jsonobject15.getString("fat");
	          	
	          	this.fat3 = fat3;
	    	    }catch(Exception e) {}
	    	    try {
	          	String fat4 = jsonobject19.getString("fat");
	          	
	          	this.fat4 = fat4;
	    	    }catch(Exception e) {}
	    	    try {
	          	String fat5 = jsonobject23.getString("fat");
	          	
	          	this.fat5 = fat5;
	    	    }catch(Exception e) {}
	    	    try {
	          	String fat6 = jsonobject27.getString("fat");
	          	
	          	this.fat6 = fat6;
	          	}catch(Exception e) {}

	          	try {
	          	String carbs0 = jsonobject3.getString("carbs");
		        
		        this.carbs0 = carbs0;
	          	}catch(Exception e) {}
	    	    try {
	          	String carbs1 = jsonobject7.getString("carbs");
		        
		        this.carbs1 = carbs1;
	    	    }catch(Exception e) {}
	    	    try {
	          	String carbs2 = jsonobject11.getString("carbs");
		        
		        this.carbs2 = carbs2;
	    	    }catch(Exception e) {}
	    	    try {
	          	String carbs3 = jsonobject15.getString("carbs");
		        
		        this.carbs3 = carbs3;
	    	    }catch(Exception e) {}
	    	    try {
	          	String carbs4 = jsonobject19.getString("carbs");
		        
		        this.carbs4 = carbs4;
	    	    }catch(Exception e) {}
	    	    try {
	          	String carbs5 = jsonobject23.getString("carbs");
		        
		        this.carbs5 = carbs5;
	    	    }catch(Exception e) {}
	    	    try {
	          	String carbs6 = jsonobject27.getString("carbs");

		        this.carbs6 = carbs6;
	          	}catch(Exception e) {}
	    	    
	    	    
	    	    
		        
		        String content="content";
	    		this.content=content;
		        
    } 
}