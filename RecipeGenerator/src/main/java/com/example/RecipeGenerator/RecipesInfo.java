package com.example.RecipeGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class RecipesInfo {
	
	public void setLink(String link) {
    	this.link=link;
    }
    public String link;
    public String getLink() {
    	return link;
    }
	
    public void setTitle(String title) {
    	this.title=title;
    }
    public String title;
    public String getTitle() {
    	return title;
    }
    public void setRim(String rim) {
    	this.rim=rim;
    }
    public String rim;
    public String getRim() {
    	return rim;
    }
    public void setServ(String serv) {
    	this.serv=serv;
    }
    public String serv;
    public String getServ() {
    	return serv;
    }
    public void setRimage(String rimage) {
    	this.rimage=rimage;
    }
    public String rimage;
    public String getRimage() {
    	return rimage;
    }
    public void setSum(String sum) {
    	this.sum=sum;
    }
    public String sum;
    public String getSum() {
    	return sum;
    }
    public void setPairwine(String pairwine) {
    	this.pairwine=pairwine;
    }
    public String pairwine;
    public String getPairwine() {
    	return pairwine;
    }
    public void setPairtext(String pairtext) {
    	this.pairtext=pairtext;
    }
    public String pairtext;
    public String getPairtext() {
    	return pairtext;
    }
    public void setWinetitle(String winetitle) {
    	this.winetitle=winetitle;
    }
    public String winetitle;
    public String getWinetitle() {
    	return winetitle;
    }
    public void setDesc(String desc) {
    	this.desc=desc;
    }
    public String desc;
    public String getDesc() {
    	return desc;
    }
    public void setImageurl(String imageurl) {
    	this.imageurl=imageurl;
    }
    public String imageurl;
    public String getImageurl() {
    	return imageurl;
    }
    public void setAm(String am) {
    	this.am=am;
    }
    public String am;
    public String getAm() {
    	return am;
    }
    public void setUnit(String unit) {
    	this.unit=unit;
    }
    public String unit;
    public String getUnit() {
    	return unit;
    }
	
    public void setStep(String step) throws IOException { 
    	this.step=step;	
    }
	
    private String step;
    public String getStep() {
      return step;
    }

    public void setId(int id) throws IOException { 
    	this.id=id;	
    }
	
    private int id;
    public int getId() {
      return id;
    }
    
    public void setName0(String name0) {
    	this.name0=name0;
    }
    public String name0;
    public String getName0() {
    	return name0;
    }
    public void setName1(String name1) {
    	this.name1=name1;
    }
    public String name1;
    public String getName1() {
    	return name1;
    }
    public void setName2(String name2) {
    	this.name2=name2;
    }
    public String name2;
    public String getName2() {
    	return name2;
    }
    public void setName3(String name3) {
    	this.name3=name3;
    }
    public String name3;
    public String getName3() {
    	return name3;
    }
    public void setName4(String name4) {
    	this.name4=name4;
    }
    public String name4;
    public String getName4() {
    	return name4;
    }
    public void setName5(String name5) {
    	this.name5=name5;
    }
    public String name5;
    public String getName5() {
    	return name5;
    }
    public void setName6(String name6) {
    	this.name6=name6;
    }
    public String name6;
    public String getName6() {
    	return name6;
    }
    public void setName7(String name7) {
    	this.name7=name7;
    }
    public String name7;
    public String getName7() {
    	return name7;
    }
    public void setName8(String name8) {
    	this.name8=name8;
    }
    public String name8;
    public String getName8() {
    	return name8;
    }
    public void setName9(String name9) {
    	this.name9=name9;
    }
    public String name9;
    public String getName9() {
    	return name9;
    }
    public void setName10(String name10) {
    	this.name10=name10;
    }
    public String name10;
    public String getName10() {
    	return name10;
    }
    public void setName11(String name11) {
    	this.name11=name11;
    }
    public String name11;
    public String getName11() {
    	return name11;
    }
    
    
    public void setImage0(String image0) {
    	this.image0=image0;
    }
    public String image0;
    public String getImage0() {
    	return image0;
    }
    public void setImage1(String image1) {
    	this.image1=image1;
    }
    public String image1;
    public String getImage1() {
    	return image1;
    }
    public void setImage2(String image2) {
    	this.image2=image2;
    }
    public String image2;
    public String getImage2() {
    	return image2;
    }
    public void setImage3(String image3) {
    	this.image3=image3;
    }
    public String image3;
    public String getImage3() {
    	return image3;
    }
    public void setImage4(String image4) {
    	this.image4=image4;
    }
    public String image4;
    public String getImage4() {
    	return image4;
    }
    public void setImage5(String image5) {
    	this.image5=image5;
    }
    public String image5;
    public String getImage5() {
    	return image5;
    }
    public void setImage6(String image6) {
    	this.image6=image6;
    }
    public String image6;
    public String getImage6() {
    	return image6;
    }
    public void setImage7(String image7) {
    	this.image7=image7;
    }
    public String image7;
    public String getImage7() {
    	return image7;
    }
    public void setImage8(String image8) {
    	this.image8=image8;
    }
    public String image8;
    public String getImage8() {
    	return image8;
    }
    public void setImage9(String image9) {
    	this.image9=image9;
    }
    public String image9;
    public String getImage9() {
    	return image9;
    }
    public void setImage10(String image10) {
    	this.image10=image10;
    }
    public String image10;
    public String getImage10() {
    	return image10;
    }
    public void setImage11(String image11) {
    	this.image11=image11;
    }
    public String image11;
    public String getImage11() {
    	return image11;
    }
    
    public void setIngrName0(String ingrname0) {
    	this.ingrname0=ingrname0;
    }
    public String ingrname0;
    public String getIngrName0() {
    	return ingrname0;
    }
    public void setIngrName1(String ingrname1) {
    	this.ingrname1=ingrname1;
    }
    public String ingrname1;
    public String getIngrName1() {
    	return ingrname1;
    }
    public void setIngrName2(String ingrname2) {
    	this.ingrname2=ingrname2;
    }
    public String ingrname2;
    public String getIngrName2() {
    	return ingrname2;
    }
    public void setIngrName3(String ingrname3) {
    	this.ingrname3=ingrname3;
    }
    public String ingrname3;
    public String getIngrName3() {
    	return ingrname3;
    }
    public void setIngrName4(String ingrname4) {
    	this.ingrname4=ingrname4;
    }
    public String ingrname4;
    public String getIngrName4() {
    	return ingrname4;
    }
    public void setIngrName5(String ingrname5) {
    	this.ingrname5=ingrname5;
    }
    public String ingrname5;
    public String getIngrName5() {
    	return ingrname5;
    }
    public void setIngrName6(String ingrname6) {
    	this.ingrname6=ingrname6;
    }
    public String ingrname6;
    public String getIngrName6() {
    	return ingrname6;
    }
    public void setIngrName7(String ingrname7) {
    	this.ingrname7=ingrname7;
    }
    public String ingrname7;
    public String getIngrName7() {
    	return ingrname7;
    }
    public void setIngrName8(String ingrname8) {
    	this.ingrname8=ingrname8;
    }
    public String ingrname8;
    public String getIngrName8() {
    	return ingrname8;
    }
    public void setIngrName9(String ingrname9) {
    	this.ingrname9=ingrname9;
    }
    public String ingrname9;
    public String getIngrName9() {
    	return ingrname9;
    }
    public void setIngrName10(String ingrname10) {
    	this.ingrname10=ingrname10;
    }
    public String ingrname10;
    public String getIngrName10() {
    	return ingrname10;
    }
    public void setIngrName11(String ingrname11) {
    	this.ingrname11=ingrname11;
    }
    public String ingrname11;
    public String getIngrName11() {
    	return ingrname11;
    }
    public void setIngrName12(String ingrname12) {
    	this.ingrname12=ingrname12;
    }
    public String ingrname12;
    public String getIngrName12() {
    	return ingrname12;
    }
    public void setIngrName13(String ingrname13) {
    	this.ingrname13=ingrname13;
    }
    public String ingrname13;
    public String getIngrName13() {
    	return ingrname13;
    }
    public void setIngrName14(String ingrname14) {
    	this.ingrname14=ingrname14;
    }
    public String ingrname14;
    public String getIngrName14() {
    	return ingrname14;
    }
    public void setIngrName15(String ingrname15) {
    	this.ingrname15=ingrname15;
    }
    public String ingrname15;
    public String getIngrName15() {
    	return ingrname15;
    }
    public void setIngrName16(String ingrname16) {
    	this.ingrname16=ingrname16;
    }
    public String ingrname16;
    public String getIngrName16() {
    	return ingrname16;
    }
    public void setIngrName17(String ingrname17) {
    	this.ingrname17=ingrname17;
    }
    public String ingrname17;
    public String getIngrName17() {
    	return ingrname17;
    }
    public void setIngrName18(String ingrname18) {
    	this.ingrname18=ingrname18;
    }
    public String ingrname18;
    public String getIngrName18() {
    	return ingrname18;
    }
    public void setIngrName19(String ingrname19) {
    	this.ingrname19=ingrname19;
    }
    public String ingrname19;
    public String getIngrName19() {
    	return ingrname19;
    }
    public void setIngrName20(String ingrname20) {
    	this.ingrname20=ingrname20;
    }
    public String ingrname20;
    public String getIngrName20() {
    	return ingrname20;
    }
    public void setIngrName21(String ingrname21) {
    	this.ingrname21=ingrname21;
    }
    public String ingrname21;
    public String getIngrName21() {
    	return ingrname21;
    }
    public void setIngrName22(String ingrname22) {
    	this.ingrname22=ingrname22;
    }
    public String ingrname22;
    public String getIngrName22() {
    	return ingrname22;
    }
    public void setIngrName23(String ingrname23) {
    	this.ingrname23=ingrname23;
    }
    public String ingrname23;
    public String getIngrName23() {
    	return ingrname23;
    }
    public void setIngrName24(String ingrname24) {
    	this.ingrname24=ingrname24;
    }
    public String ingrname24;
    public String getIngrName24() {
    	return ingrname24;
    }
    public void setIngrName25(String ingrname25) {
    	this.ingrname25=ingrname25;
    }
    public String ingrname25;
    public String getIngrName25() {
    	return ingrname25;
    }
    public void setIngrName26(String ingrname26) {
    	this.ingrname26=ingrname26;
    }
    public String ingrname26;
    public String getIngrName26() {
    	return ingrname26;
    }
    public void setIngrName27(String ingrname27) {
    	this.ingrname27=ingrname27;
    }
    public String ingrname27;
    public String getIngrName27() {
    	return ingrname27;
    }
    public void setIngrName28(String ingrname28) {
    	this.ingrname28=ingrname28;
    }
    public String ingrname28;
    public String getIngrName28() {
    	return ingrname28;
    }
    public void setIngrName29(String ingrname29) {
    	this.ingrname29=ingrname29;
    }
    public String ingrname29;
    public String getIngrName29() {
    	return ingrname29;
    }
    public void setIngrName30(String ingrname30) {
    	this.ingrname30=ingrname30;
    }
    public String ingrname30;
    public String getIngrName30() {
    	return ingrname30;
    }
    public void setIngrName31(String ingrname31) {
    	this.ingrname31=ingrname31;
    }
    public String ingrname31;
    public String getIngrName31() {
    	return ingrname31;
    }
    public void setIngrName32(String ingrname32) {
    	this.ingrname32=ingrname32;
    }
    public String ingrname32;
    public String getIngrName32() {
    	return ingrname32;
    }
    
    
    public void setIngrImage0(String ingrimage0) {
    	this.ingrimage0=ingrimage0;
    }
    public String ingrimage0;
    public String getIngrImage0() {
    	return ingrimage0;
    }
    public void setIngrImage1(String ingrimage1) {
    	this.ingrimage1=ingrimage1;
    }
    public String ingrimage1;
    public String getIngrImage1() {
    	return ingrimage1;
    }
    public void setIngrImage2(String ingrimage2) {
    	this.ingrimage2=ingrimage2;
    }
    public String ingrimage2;
    public String getIngrImage2() {
    	return ingrimage2;
    }
    public void setIngrImage3(String ingrimage3) {
    	this.ingrimage3=ingrimage3;
    }
    public String ingrimage3;
    public String getIngrImage3() {
    	return ingrimage3;
    }
    public void setIngrImage4(String ingrimage4) {
    	this.ingrimage4=ingrimage4;
    }
    public String ingrimage4;
    public String getIngrImage4() {
    	return ingrimage4;
    }
    public void setIngrImage5(String ingrimage5) {
    	this.ingrimage5=ingrimage5;
    }
    public String ingrimage5;
    public String getIngrImage5() {
    	return ingrimage5;
    }
    public void setIngrImage6(String ingrimage6) {
    	this.ingrimage6=ingrimage6;
    }
    public String ingrimage6;
    public String getIngrImage6() {
    	return ingrimage6;
    }
    public void setIngrImage7(String ingrimage7) {
    	this.ingrimage7=ingrimage7;
    }
    public String ingrimage7;
    public String getIngrImage7() {
    	return ingrimage7;
    }
    public void setIngrImage8(String ingrimage8) {
    	this.ingrimage8=ingrimage8;
    }
    public String ingrimage8;
    public String getIngrImage8() {
    	return ingrimage8;
    }
    public void setIngrImage9(String ingrimage9) {
    	this.ingrimage9=ingrimage9;
    }
    public String ingrimage9;
    public String getIngrImage9() {
    	return ingrimage9;
    }
    public void setIngrImage10(String ingrimage10) {
    	this.ingrimage10=ingrimage10;
    }
    public String ingrimage10;
    public String getIngrImage10() {
    	return ingrimage10;
    }
    public void setIngrImage11(String ingrimage11) {
    	this.ingrimage11=ingrimage11;
    }
    public String ingrimage11;
    public String getIngrImage11() {
    	return ingrimage11;
    }
    public void setIngrImage12(String ingrimage12) {
    	this.ingrimage12=ingrimage12;
    }
    public String ingrimage12;
    public String getIngrImage12() {
    	return ingrimage12;
    }
    public void setIngrImage13(String ingrimage13) {
    	this.ingrimage13=ingrimage13;
    }
    public String ingrimage13;
    public String getIngrImage13() {
    	return ingrimage13;
    }
    public void setIngrImage14(String ingrimage14) {
    	this.ingrimage14=ingrimage14;
    }
    public String ingrimage14;
    public String getIngrImage14() {
    	return ingrimage14;
    }
    public void setIngrImage15(String ingrimage15) {
    	this.ingrimage15=ingrimage15;
    }
    public String ingrimage15;
    public String getIngrImage15() {
    	return ingrimage15;
    }
    public void setIngrImage16(String ingrimage16) {
    	this.ingrimage16=ingrimage16;
    }
    public String ingrimage16;
    public String getIngrImage16() {
    	return ingrimage16;
    }
    public void setIngrImage17(String ingrimage17) {
    	this.ingrimage17=ingrimage17;
    }
    public String ingrimage17;
    public String getIngrImage17() {
    	return ingrimage17;
    }
    public void setIngrImage18(String ingrimage18) {
    	this.ingrimage18=ingrimage18;
    }
    public String ingrimage18;
    public String getIngrImage18() {
    	return ingrimage18;
    }
    public void setIngrImage19(String ingrimage19) {
    	this.ingrimage19=ingrimage19;
    }
    public String ingrimage19;
    public String getIngrImage19() {
    	return ingrimage19;
    }
    public void setIngrImage20(String ingrimage20) {
    	this.ingrimage20=ingrimage20;
    }
    public String ingrimage20;
    public String getIngrImage20() {
    	return ingrimage20;
    }
    public void setIngrImage21(String ingrimage21) {
    	this.ingrimage21=ingrimage21;
    }
    public String ingrimage21;
    public String getIngrImage21() {
    	return ingrimage21;
    }
    public void setIngrImage22(String ingrimage22) {
    	this.ingrimage22=ingrimage22;
    }
    public String ingrimage22;
    public String getIngrImage22() {
    	return ingrimage22;
    }
    public void setIngrImage23(String ingrimage23) {
    	this.ingrimage23=ingrimage23;
    }
    public String ingrimage23;
    public String getIngrImage23() {
    	return ingrimage23;
    }
    public void setIngrImage24(String ingrimage24) {
    	this.ingrimage24=ingrimage24;
    }
    public String ingrimage24;
    public String getIngrImage24() {
    	return ingrimage24;
    }
    public void setIngrImage25(String ingrimage25) {
    	this.ingrimage25=ingrimage25;
    }
    public String ingrimage25;
    public String getIngrImage25() {
    	return ingrimage25;
    }
    public void setIngrImage26(String ingrimage26) {
    	this.ingrimage26=ingrimage26;
    }
    public String ingrimage26;
    public String getIngrImage26() {
    	return ingrimage26;
    }
    public void setIngrImage27(String ingrimage27) {
    	this.ingrimage27=ingrimage27;
    }
    public String ingrimage27;
    public String getIngrImage27() {
    	return ingrimage27;
    }
    public void setIngrImage28(String ingrimage28) {
    	this.ingrimage28=ingrimage28;
    }
    public String ingrimage28;
    public String getIngrImage28() {
    	return ingrimage28;
    }
    public void setIngrImage29(String ingrimage29) {
    	this.ingrimage29=ingrimage29;
    }
    public String ingrimage29;
    public String getIngrImage29() {
    	return ingrimage29;
    }
    public void setIngrImage30(String ingrimage30) {
    	this.ingrimage30=ingrimage30;
    }
    public String ingrimage30;
    public String getIngrImage30() {
    	return ingrimage30;
    }
    public void setIngrImage31(String ingrimage31) {
    	this.ingrimage31=ingrimage31;
    }
    public String ingrimage31;
    public String getIngrImage31() {
    	return ingrimage31;
    }
    public void setIngrImage32(String ingrimage32) {
    	this.ingrimage32=ingrimage32;
    }
    public String ingrimage32;
    public String getIngrImage32() {
    	return ingrimage32;
    }
	//få info om recept
    public void execute(int id) throws IOException { 

        System.setProperty("http.agent", "Firefox");
        URL url = new URL("http://localhost:8081/RecipeGeneratorServer/rest/RecipeService/recipesinfo?id="+id);
        
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
   	           JSONObject jsono = new JSONObject();
   	           jsono = jsonobject;
   	           
   	           
  	           	String title = new String();
  	           	String rim = new String();
  	           	String serv = new String();
  	           	String rimage = new String();
  	           	String sum = new String();
  	           	String pairwine = new String();
  	           	String pairtext = new String();
  	           	String winetitle = new String();
  	           	String desc = new String();
  	           	String imageurl = new String();
  	           	String am = new String();
  	           	String unit = new String();
  	           	
   	           	String name0 = new String();
   	           	String name1 = new String();
   	           	String name2 = new String();
   	           	String name3 = new String();
   	           	String name4 = new String();
   	           	String name5 = new String();
   	           	String name6 = new String();
   	           	String name7 = new String();
   	           	String name8 = new String();
   	           	String name9 = new String();
   	           	String name10 = new String();
   	           	String name11 = new String();
   	           	
   	           	String image0 = new String();
   	           	String image1 = new String();
   	           	String image2 = new String();
   	           	String image3 = new String();
   	           	String image4 = new String();
   	           	String image5 = new String();
   	           	String image6 = new String();
   	           	String image7 = new String();
   	           	String image8 = new String();
   	           	String image9 = new String();
   	           	String image10 = new String();
   	           	String image11 = new String();
   	           	
   	           	String ingrname0 = new String();
   	           	String ingrname1 = new String();
   	           	String ingrname2 = new String();
   	           	String ingrname3 = new String();
   	           	String ingrname4 = new String();
   	           	String ingrname5 = new String();
   	           	String ingrname6 = new String();
   	           	String ingrname7 = new String();
   	           	String ingrname8 = new String();
   	           	String ingrname9 = new String();
   	           	String ingrname10 = new String();
   	           	String ingrname11 = new String();
   	           	String ingrname12 = new String();
   	           	String ingrname13 = new String();
   	           	String ingrname14 = new String();
   	           	String ingrname15 = new String();
   	           	String ingrname16 = new String();
   	           	String ingrname17 = new String();
   	           	String ingrname18 = new String();
   	           	String ingrname19 = new String();
   	           	String ingrname20 = new String();
   	           	String ingrname21 = new String();
   	           	String ingrname22 = new String();
   	           	String ingrname23 = new String();
   	           	String ingrname24 = new String();
   	           	String ingrname25 = new String();
   	           	String ingrname26 = new String();
   	           	String ingrname27 = new String();
   	           	String ingrname28 = new String();
   	           	String ingrname29 = new String();
   	           	String ingrname30 = new String();
   	           	String ingrname31 = new String();
   	           	String ingrname32 = new String();
   	           	
   	           	String ingrimage0 = new String();
   	           	String ingrimage1 = new String();
   	           	String ingrimage2 = new String();
   	           	String ingrimage3 = new String();
   	           	String ingrimage4 = new String();
   	           	String ingrimage5 = new String();
   	           	String ingrimage6 = new String();
   	           	String ingrimage7 = new String();
   	           	String ingrimage8 = new String();
   	           	String ingrimage9 = new String();
   	           	String ingrimage10 = new String();
   	           	String ingrimage11 = new String();
   	           	String ingrimage12 = new String();
   	           	String ingrimage13 = new String();
   	           	String ingrimage14 = new String();
   	           	String ingrimage15 = new String();
   	           	String ingrimage16 = new String();
   	           	String ingrimage17 = new String();
   	           	String ingrimage18 = new String();
   	           	String ingrimage19 = new String();
   	           	String ingrimage20 = new String();
   	           	String ingrimage21 = new String();
   	           	String ingrimage22 = new String();
   	           	String ingrimage23 = new String();
   	           	String ingrimage24 = new String();
   	           	String ingrimage25 = new String();
   	           	String ingrimage26 = new String();
   	           	String ingrimage27 = new String();
   	           	String ingrimage28 = new String();
   	           	String ingrimage29 = new String();
   	           	String ingrimage30 = new String();
   	           	String ingrimage31 = new String();
   	           	String ingrimage32 = new String();
   	           	
   	           	
   	         jsono = jsonarray.getJSONObject(jsonarray.length()-1);

   	           		title = jsono.getString("title");
   	           		rim = jsono.getString("rim");
   	           		serv = jsono.getString("serv");
   	           		rimage = jsono.getString("rimage");
   	           		sum = jsono.getString("sum");
   	           		pairwine = jsono.getString("pairwine");
   	           		pairtext = jsono.getString("pairtext");
   	           		winetitle = jsono.getString("winetitle");
   	           		desc = jsono.getString("desc");
   	           		imageurl = jsono.getString("imageurl");
   	           		am = jsono.getString("amount");
   	           		unit = jsono.getString("unit");
   	           		
   	           	this.title=title;
   	           	this.rim=rim;
   	           	this.serv=serv;
   	           	this.rimage=rimage;
   	           	this.sum=sum;
   	           	this.pairwine=pairwine;
   	           	this.pairtext=pairtext;
   	           	this.winetitle=winetitle;
   	           	this.desc=desc;
   	           	this.imageurl=imageurl;
   	           	this.am=am;
   	           	this.unit=unit;
   	           	
   	           	//få fram bilder
   	         
			    jsono = jsonarray.getJSONObject(0);
			    if(jsono.getString("image").equals("")){}
			    else {image0 = jsono.getString("image");image0="https://spoonacular.com/cdn/equipment_100x100/"+image0;}	
			    this.image0=image0;
			    try {
			    jsono = jsonarray.getJSONObject(1);
			    if(jsono.getString("image").equals("")){}
			    else {image1 = jsono.getString("image");image1="https://spoonacular.com/cdn/equipment_100x100/"+image1;
			    	if(image1.equals(image0)) {image1="";};}	
			    this.image1=image1;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(2);
			    if(jsono.getString("image").equals("")){}
			    else {image2 = jsono.getString("image");image2="https://spoonacular.com/cdn/equipment_100x100/"+image2;
			    if(image2.equals(image0)||image2.equals(image1)) {image2="";}}	
			    this.image2=image2;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(3);
			    if(jsono.getString("image").equals("")){}
			    else {image3 = jsono.getString("image");
			    if(image3.contains("http")) {
			    	System.out.println(image3);
			    	image3=image3.replace("ingredients", "equipment");}
			    else {
			    image3="https://spoonacular.com/cdn/equipment_100x100/"+image3;}
			    if(image3.equals(image0)||image3.equals(image1)||image3.equals(image2)) {image3="";}}	
			    
			    this.image3=image3;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(4);
			    if(jsono.getString("image").equals("")){}
			    else {image4 = jsono.getString("image");image4="https://spoonacular.com/cdn/equipment_100x100/"+image4;
			    if(image4.equals(image0)||image4.equals(image1)||image4.equals(image2)||image4.equals(image3)) {image4="";}}	
			    this.image4=image4;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(5);
			    if(jsono.getString("image").equals("")){}
			    else {image5 = jsono.getString("image");image5="https://spoonacular.com/cdn/equipment_100x100/"+image5;
			    if(image5.equals(image0)||image5.equals(image1)||image5.equals(image2)||image5.equals(image3)||image5.equals(image4)) {image5="";}}	
			    this.image5=image5;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(6);
			    if(jsono.getString("image").equals("")){}
			    else {image6 = jsono.getString("image");image6="https://spoonacular.com/cdn/equipment_100x100/"+image6;
			    if(image6.equals(image0)||image6.equals(image1)||image6.equals(image2)||image6.equals(image3)||image6.equals(image4)||image6.equals(image5)) {image6="";}}	
			    this.image6=image6;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(7);
			    if(jsono.getString("image").equals("")){}
			    else {image7 = jsono.getString("image");image7="https://spoonacular.com/cdn/equipment_100x100/"+image7;
			    if(image7.equals(image0)||image7.equals(image1)||image7.equals(image2)||image7.equals(image3)||image7.equals(image4)||image7.equals(image5)||image7.equals(image6)) {image7="";}}	
			    this.image7=image7;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(8);
			    if(jsono.getString("image").equals("")){}
			    else {image8 = jsono.getString("image");image8="https://spoonacular.com/cdn/equipment_100x100/"+image8;
			    if(image8.equals(image0)||image8.equals(image1)||image8.equals(image2)||image8.equals(image3)||image8.equals(image4)||image8.equals(image5)||image8.equals(image6)||image8.equals(image7)) {image8="";}}	
			    this.image8=image8;
			    
			    jsono = jsonarray.getJSONObject(9);
			    if(jsono.getString("image").equals("")){}
			    else {image9 = jsono.getString("image");image9="https://spoonacular.com/cdn/equipment_100x100/"+image9;
			    if(image9.equals(image0)||image9.equals(image1)||image9.equals(image2)||image9.equals(image3)||image9.equals(image4)||image9.equals(image5)||image9.equals(image6)||image9.equals(image7)||image9.equals(image8)) {image9="";}}	
			    this.image9=image9;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(10);
			    if(jsono.getString("image").equals("")){}
			    else {image10 = jsono.getString("image");image10="https://spoonacular.com/cdn/equipment_100x100/"+image10;
			    if(image10.equals(image0)||image10.equals(image1)||image10.equals(image2)||image10.equals(image3)||image10.equals(image4)||image10.equals(image5)||image10.equals(image6)||image10.equals(image7)||image10.equals(image8)||image10.equals(image9)) {image10="";}}	
			    this.image10=image10;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(11);
			    if(jsono.getString("image").equals("")){}
			    else {image11 = jsono.getString("image");image11="https://spoonacular.com/cdn/equipment_100x100/"+image11;
			    if(image11.equals(image0)||image11.equals(image1)||image11.equals(image2)||image11.equals(image3)||image11.equals(image4)||image11.equals(image5)||image11.equals(image6)||image11.equals(image7)||image11.equals(image8)||image11.equals(image9)||image11.equals(image10)) {image11="";}}	
			    this.image11=image11;
			    }
			    catch(Exception e){	
			    }
			    
	        	   
			    jsono = jsonarray.getJSONObject(0);
			    if(jsono.getString("name").equals("")){}
			    else {name0 = jsono.getString("name");name0=" "+name0.substring(0,1).toUpperCase()+ name0.substring(1).toLowerCase();}	
			    this.name0=name0;
			    try {
			    jsono = jsonarray.getJSONObject(1);
			    if(jsono.getString("name").equals("")){}
			    else {name1 = jsono.getString("name");name1=" "+name1.substring(0,1).toUpperCase()+ name1.substring(1).toLowerCase();
			    	if(name1.equals(name0)) {name1="";};}	
			    this.name1=name1;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(2);
			    if(jsono.getString("name").equals("")){}
			    else {name2 = jsono.getString("name");name2=" "+name2.substring(0,1).toUpperCase()+ name2.substring(1).toLowerCase();
			    if(name2.equals(name0)||name2.equals(name1)) {name2="";}}	
			    this.name2=name2;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(3);
			    if(jsono.getString("name").equals("")){}
			    else {name3 = jsono.getString("name");name3=" "+name3.substring(0,1).toUpperCase()+ name3.substring(1).toLowerCase();
			    if(name3.equals(name0)||name3.equals(name1)||name3.equals(name2)) {name3="";}}	
			    this.name3=name3;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(4);
			    if(jsono.getString("name").equals("")){}
			    else {name4 = jsono.getString("name");name4=" "+name4.substring(0,1).toUpperCase()+ name4.substring(1).toLowerCase();
			    if(name4.equals(name0)||name4.equals(name1)||name4.equals(name2)||name4.equals(name3)) {name4="";}}	
			    this.name4=name4;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(5);
			    if(jsono.getString("name").equals("")){}
			    else {name5 = jsono.getString("name");name5=" "+name5.substring(0,1).toUpperCase()+ name5.substring(1).toLowerCase();
			    if(name5.equals(name0)||name5.equals(name1)||name5.equals(name2)||name5.equals(name3)||name5.equals(name4)) {name5="";}}	
			    this.name5=name5;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(6);
			    if(jsono.getString("name").equals("")){}
			    else {name6 = jsono.getString("name");name6=" "+name6.substring(0,1).toUpperCase()+ name6.substring(1).toLowerCase();
			    if(name6.equals(name0)||name6.equals(name1)||name6.equals(name2)||name6.equals(name3)||name6.equals(name4)||name6.equals(name5)) {name6="";}}	
			    this.name6=name6;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(7);
			    if(jsono.getString("name").equals("")){}
			    else {name7 = jsono.getString("name");name7=" "+name7.substring(0,1).toUpperCase()+ name7.substring(1).toLowerCase();
			    if(name7.equals(name0)||name7.equals(name1)||name7.equals(name2)||name7.equals(name3)||name7.equals(name4)||name7.equals(name5)||name7.equals(name6)) {name7="";}}	
			    this.name7=name7;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(8);
			    if(jsono.getString("name").equals("")){}
			    else {name8 = jsono.getString("name");name8=" "+name8.substring(0,1).toUpperCase()+ name8.substring(1).toLowerCase();
			    if(name8.equals(name0)||name8.equals(name1)||name8.equals(name2)||name8.equals(name3)||name8.equals(name4)||name8.equals(name5)||name8.equals(name6)||name8.equals(name7)) {name8="";}}	
			    this.name8=name8;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(9);
			    if(jsono.getString("name").equals("")){}
			    else {name9 = jsono.getString("name");name9=" "+name9.substring(0,1).toUpperCase()+ name9.substring(1).toLowerCase();
			    if(name9.equals(name0)||name9.equals(name1)||name9.equals(name2)||name9.equals(name3)||name9.equals(name4)||name9.equals(name5)||name9.equals(name6)||name9.equals(name7)||name9.equals(name8)) {name9="";}}	
			    this.name9=name9;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(10);
			    if(jsono.getString("name").equals("")){}
			    else {name10 = jsono.getString("name");name10=" "+name10.substring(0,1).toUpperCase()+ name10.substring(1).toLowerCase();
			    if(name10.equals(name0)||name10.equals(name1)||name10.equals(name2)||name10.equals(name3)||name10.equals(name4)||name10.equals(name5)||name10.equals(name6)||name10.equals(name7)||name10.equals(name8)||name10.equals(name9)) {name10="";}}	
			    this.name10=name10;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(11);
			    if(jsono.getString("name").equals("")){}
			    else {name11 = jsono.getString("name");name11=" "+name11.substring(0,1).toUpperCase()+ name11.substring(1).toLowerCase();
			    if(name11.equals(name0)||name11.equals(name1)||name11.equals(name2)||name11.equals(name3)||name11.equals(name4)||name11.equals(name5)||name11.equals(name6)||name11.equals(name7)||name11.equals(name8)||name11.equals(name9)||name11.equals(name10)) {name11="";}}	
			    this.name11=name11;
			    }
			    catch(Exception e){	
			    }
			    
			    
			    jsono = jsonarray.getJSONObject(0);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage0 = jsono.getString("ingrimage");ingrimage0="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage0;}	
			    this.ingrimage0=ingrimage0;
			    
			    try {
			    jsono = jsonarray.getJSONObject(1);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage1 = jsono.getString("ingrimage");ingrimage1="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage1;
			    	if(ingrimage1.equals(ingrimage0)) {ingrimage1="";};}	
			    this.ingrimage1=ingrimage1;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(2);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage2 = jsono.getString("ingrimage");ingrimage2="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage2;
			    if(ingrimage2.equals(ingrimage0)||ingrimage2.equals(ingrimage1)) {ingrimage2="";}}	
			    this.ingrimage2=ingrimage2;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(3);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage3 = jsono.getString("ingrimage");ingrimage3="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage3;
			    if(ingrimage3.equals(ingrimage0)||ingrimage3.equals(ingrimage1)||ingrimage3.equals(ingrimage2)) {ingrimage3="";}}	
			    this.ingrimage3=ingrimage3;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(4);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage4 = jsono.getString("ingrimage");ingrimage4="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage4;
			    if(ingrimage4.equals(ingrimage0)||ingrimage4.equals(ingrimage1)||ingrimage4.equals(ingrimage2)||ingrimage4.equals(ingrimage3)) {ingrimage4="";}}	
			    this.ingrimage4=ingrimage4;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(5);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage5 = jsono.getString("ingrimage");ingrimage5="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage5;
			    if(ingrimage5.equals(ingrimage0)||ingrimage5.equals(ingrimage1)||ingrimage5.equals(ingrimage2)||ingrimage5.equals(ingrimage3)||ingrimage5.equals(ingrimage4)) {ingrimage5="";}}	
			    this.ingrimage5=ingrimage5;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(6);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage6 = jsono.getString("ingrimage");ingrimage6="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage6;
			    if(ingrimage6.equals(ingrimage0)||ingrimage6.equals(ingrimage1)||ingrimage6.equals(ingrimage2)||ingrimage6.equals(ingrimage3)||ingrimage6.equals(ingrimage4)||ingrimage6.equals(ingrimage5)) {ingrimage6="";}}	
			    this.ingrimage6=ingrimage6;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(7);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage7 = jsono.getString("ingrimage");ingrimage7="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage7;
			    if(ingrimage7.equals(ingrimage0)||ingrimage7.equals(ingrimage1)||ingrimage7.equals(ingrimage2)||ingrimage7.equals(ingrimage3)||ingrimage7.equals(ingrimage4)||ingrimage7.equals(ingrimage5)||ingrimage7.equals(ingrimage6)) {ingrimage7="";}}	
			    this.ingrimage7=ingrimage7;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(8);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage8 = jsono.getString("ingrimage");ingrimage8="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage8;
			    if(ingrimage8.equals(ingrimage0)||ingrimage8.equals(ingrimage1)||ingrimage8.equals(ingrimage2)||ingrimage8.equals(ingrimage3)||ingrimage8.equals(ingrimage4)||ingrimage8.equals(ingrimage5)||ingrimage8.equals(ingrimage6)||ingrimage8.equals(ingrimage7)) {ingrimage8="";}}	
			    this.ingrimage8=ingrimage8;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(9);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage9 = jsono.getString("ingrimage");ingrimage9="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage9;
			    if(ingrimage9.equals(ingrimage0)||ingrimage9.equals(ingrimage1)||ingrimage9.equals(ingrimage2)||ingrimage9.equals(ingrimage3)||ingrimage9.equals(ingrimage4)||ingrimage9.equals(ingrimage5)||ingrimage9.equals(ingrimage6)||ingrimage9.equals(ingrimage7)||ingrimage9.equals(ingrimage8)) {ingrimage9="";}}	
			    this.ingrimage9=ingrimage9;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(10);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage10 = jsono.getString("ingrimage");ingrimage10="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage10;
			    if(ingrimage10.equals(ingrimage0)||ingrimage10.equals(ingrimage1)||ingrimage10.equals(ingrimage2)||ingrimage10.equals(ingrimage3)||ingrimage10.equals(ingrimage4)||ingrimage10.equals(ingrimage5)||ingrimage10.equals(ingrimage6)||ingrimage10.equals(ingrimage7)||ingrimage10.equals(ingrimage8)||ingrimage10.equals(ingrimage9)) {ingrimage10="";}}	
			    this.ingrimage10=ingrimage10;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(11);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage11 = jsono.getString("ingrimage");ingrimage11="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage11;
			    if(ingrimage11.equals(ingrimage0)||ingrimage11.equals(ingrimage1)||ingrimage11.equals(ingrimage2)||ingrimage11.equals(ingrimage3)||ingrimage11.equals(ingrimage4)||ingrimage11.equals(ingrimage5)||ingrimage11.equals(ingrimage6)||ingrimage11.equals(ingrimage7)||ingrimage11.equals(ingrimage8)||ingrimage11.equals(ingrimage9)||ingrimage11.equals(ingrimage10)) {ingrimage11="";}}	
			    this.ingrimage11=ingrimage11;
			    
			    try {
			    jsono = jsonarray.getJSONObject(12);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage12 = jsono.getString("ingrimage");ingrimage12="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage12;
			    if(ingrimage12.equals(ingrimage0)||ingrimage12.equals(ingrimage1)||ingrimage12.equals(ingrimage2)||ingrimage12.equals(ingrimage3)||ingrimage12.equals(ingrimage4)||ingrimage12.equals(ingrimage5)||ingrimage12.equals(ingrimage6)||ingrimage12.equals(ingrimage7)||ingrimage12.equals(ingrimage8)||ingrimage12.equals(ingrimage9)||ingrimage12.equals(ingrimage10)||ingrimage12.equals(ingrimage11)) {ingrimage12="";}}	
			    this.ingrimage12=ingrimage12;
			    }
			    catch(Exception e){	
			    }
			    
			    jsono = jsonarray.getJSONObject(13);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage13 = jsono.getString("ingrimage");ingrimage13="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage13;
			    if(ingrimage13.equals(ingrimage0)||ingrimage13.equals(ingrimage1)||ingrimage13.equals(ingrimage2)||ingrimage13.equals(ingrimage3)||ingrimage13.equals(ingrimage4)||ingrimage13.equals(ingrimage5)||ingrimage13.equals(ingrimage6)||ingrimage13.equals(ingrimage7)||ingrimage13.equals(ingrimage8)||ingrimage13.equals(ingrimage9)||ingrimage13.equals(ingrimage10)||ingrimage13.equals(ingrimage11)||ingrimage13.equals(ingrimage12)) {ingrimage13="";}}	
			    this.ingrimage13=ingrimage13;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(14);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage14 = jsono.getString("ingrimage");ingrimage14="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage14;
			    if(ingrimage14.equals(ingrimage0)||ingrimage14.equals(ingrimage1)||ingrimage14.equals(ingrimage2)||ingrimage14.equals(ingrimage3)||ingrimage14.equals(ingrimage4)||ingrimage14.equals(ingrimage5)||ingrimage14.equals(ingrimage6)||ingrimage14.equals(ingrimage7)||ingrimage14.equals(ingrimage8)||ingrimage14.equals(ingrimage9)||ingrimage14.equals(ingrimage10)||ingrimage14.equals(ingrimage11)||ingrimage14.equals(ingrimage12)||ingrimage14.equals(ingrimage13)) {ingrimage14="";}}	
			    this.ingrimage14=ingrimage14;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(15);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage15 = jsono.getString("ingrimage");ingrimage15="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage15;
			    if(ingrimage15.equals(ingrimage0)||ingrimage15.equals(ingrimage1)||ingrimage15.equals(ingrimage2)||ingrimage15.equals(ingrimage3)||ingrimage15.equals(ingrimage4)||ingrimage15.equals(ingrimage5)||ingrimage15.equals(ingrimage6)||ingrimage15.equals(ingrimage7)||ingrimage15.equals(ingrimage8)||ingrimage15.equals(ingrimage9)||ingrimage15.equals(ingrimage10)||ingrimage15.equals(ingrimage11)||ingrimage15.equals(ingrimage12)||ingrimage15.equals(ingrimage13)||ingrimage15.equals(ingrimage14)) {ingrimage15="";}}		
			    this.ingrimage15=ingrimage15;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(16);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage16 = jsono.getString("ingrimage");ingrimage16="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage16;
			    if(ingrimage16.equals(ingrimage0)||ingrimage16.equals(ingrimage1)||ingrimage16.equals(ingrimage2)||ingrimage16.equals(ingrimage3)||ingrimage16.equals(ingrimage4)||ingrimage16.equals(ingrimage5)||ingrimage16.equals(ingrimage6)||ingrimage16.equals(ingrimage7)||ingrimage16.equals(ingrimage8)||ingrimage16.equals(ingrimage9)||ingrimage16.equals(ingrimage10)||ingrimage16.equals(ingrimage11)||ingrimage16.equals(ingrimage12)||ingrimage16.equals(ingrimage13)||ingrimage16.equals(ingrimage14)||ingrimage16.equals(ingrimage15)) {ingrimage16="";}}	
			    this.ingrimage16=ingrimage16;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(17);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage17 = jsono.getString("ingrimage");ingrimage17="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage17;
			    if(ingrimage17.equals(ingrimage0)||ingrimage17.equals(ingrimage1)||ingrimage17.equals(ingrimage2)||ingrimage17.equals(ingrimage3)||ingrimage17.equals(ingrimage4)||ingrimage17.equals(ingrimage5)||ingrimage17.equals(ingrimage6)||ingrimage17.equals(ingrimage7)||ingrimage17.equals(ingrimage8)||ingrimage17.equals(ingrimage9)||ingrimage17.equals(ingrimage10)||ingrimage17.equals(ingrimage11)||ingrimage17.equals(ingrimage12)||ingrimage17.equals(ingrimage13)||ingrimage17.equals(ingrimage14)||ingrimage17.equals(ingrimage15)||ingrimage17.equals(ingrimage16)) {ingrimage17="";}}	
			    this.ingrimage17=ingrimage17;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(18);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage18 = jsono.getString("ingrimage");ingrimage18="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage18;
			    if(ingrimage18.equals(ingrimage0)||ingrimage18.equals(ingrimage1)||ingrimage18.equals(ingrimage2)||ingrimage18.equals(ingrimage3)||ingrimage18.equals(ingrimage4)||ingrimage18.equals(ingrimage5)||ingrimage18.equals(ingrimage6)||ingrimage18.equals(ingrimage7)||ingrimage18.equals(ingrimage8)||ingrimage18.equals(ingrimage9)||ingrimage18.equals(ingrimage10)||ingrimage18.equals(ingrimage11)||ingrimage18.equals(ingrimage12)||ingrimage18.equals(ingrimage13)||ingrimage18.equals(ingrimage14)||ingrimage18.equals(ingrimage15)||ingrimage18.equals(ingrimage16)||ingrimage18.equals(ingrimage17)) {ingrimage18="";}}	
			    this.ingrimage18=ingrimage18;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(19);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage19 = jsono.getString("ingrimage");ingrimage19="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage19;
			    if(ingrimage19.equals(ingrimage0)||ingrimage19.equals(ingrimage1)||ingrimage19.equals(ingrimage2)||ingrimage19.equals(ingrimage3)||ingrimage19.equals(ingrimage4)||ingrimage19.equals(ingrimage5)||ingrimage19.equals(ingrimage6)||ingrimage19.equals(ingrimage7)||ingrimage19.equals(ingrimage8)||ingrimage19.equals(ingrimage9)||ingrimage19.equals(ingrimage10)||ingrimage19.equals(ingrimage11)||ingrimage19.equals(ingrimage12)||ingrimage19.equals(ingrimage13)||ingrimage19.equals(ingrimage14)||ingrimage19.equals(ingrimage15)||ingrimage19.equals(ingrimage16)||ingrimage19.equals(ingrimage17)||ingrimage19.equals(ingrimage18)) {ingrimage19="";}}		
			    this.ingrimage19=ingrimage19;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(20);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage20 = jsono.getString("ingrimage");ingrimage20="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage20;
			    if(ingrimage20.equals(ingrimage0)||ingrimage20.equals(ingrimage1)||ingrimage20.equals(ingrimage2)||ingrimage20.equals(ingrimage3)||ingrimage20.equals(ingrimage4)||ingrimage20.equals(ingrimage5)||ingrimage20.equals(ingrimage6)||ingrimage20.equals(ingrimage7)||ingrimage20.equals(ingrimage8)||ingrimage20.equals(ingrimage9)||ingrimage20.equals(ingrimage10)||ingrimage20.equals(ingrimage11)||ingrimage20.equals(ingrimage12)||ingrimage20.equals(ingrimage13)||ingrimage20.equals(ingrimage14)||ingrimage20.equals(ingrimage15)||ingrimage20.equals(ingrimage16)||ingrimage20.equals(ingrimage17)||ingrimage20.equals(ingrimage18)||ingrimage20.equals(ingrimage19)) {ingrimage20="";}}			
			    this.ingrimage20=ingrimage20;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(21);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage21 = jsono.getString("ingrimage");ingrimage21="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage21;
			    if(ingrimage21.equals(ingrimage0)||ingrimage21.equals(ingrimage1)||ingrimage21.equals(ingrimage2)||ingrimage21.equals(ingrimage3)||ingrimage21.equals(ingrimage4)||ingrimage21.equals(ingrimage5)||ingrimage21.equals(ingrimage6)||ingrimage21.equals(ingrimage7)||ingrimage21.equals(ingrimage8)||ingrimage21.equals(ingrimage9)||ingrimage21.equals(ingrimage10)||ingrimage21.equals(ingrimage11)||ingrimage21.equals(ingrimage12)||ingrimage21.equals(ingrimage13)||ingrimage21.equals(ingrimage14)||ingrimage21.equals(ingrimage15)||ingrimage21.equals(ingrimage16)||ingrimage21.equals(ingrimage17)||ingrimage21.equals(ingrimage18)||ingrimage21.equals(ingrimage19)||ingrimage21.equals(ingrimage20)) {ingrimage21="";}}				
			    this.ingrimage21=ingrimage21;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(22);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage22 = jsono.getString("ingrimage");ingrimage22="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage22;
			    if(ingrimage22.equals(ingrimage0)||ingrimage22.equals(ingrimage1)||ingrimage22.equals(ingrimage2)||ingrimage22.equals(ingrimage3)||ingrimage22.equals(ingrimage4)||ingrimage22.equals(ingrimage5)||ingrimage22.equals(ingrimage6)||ingrimage22.equals(ingrimage7)||ingrimage22.equals(ingrimage8)||ingrimage22.equals(ingrimage9)||ingrimage22.equals(ingrimage10)||ingrimage22.equals(ingrimage11)||ingrimage22.equals(ingrimage12)||ingrimage22.equals(ingrimage13)||ingrimage22.equals(ingrimage14)||ingrimage22.equals(ingrimage15)||ingrimage22.equals(ingrimage16)||ingrimage22.equals(ingrimage17)||ingrimage22.equals(ingrimage18)||ingrimage22.equals(ingrimage19)||ingrimage22.equals(ingrimage20)||ingrimage22.equals(ingrimage21)) {ingrimage22="";}}					
			    this.ingrimage22=ingrimage22;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(23);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage23 = jsono.getString("ingrimage");ingrimage23="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage23;
			    if(ingrimage23.equals(ingrimage0)||ingrimage23.equals(ingrimage1)||ingrimage23.equals(ingrimage2)||ingrimage23.equals(ingrimage3)||ingrimage23.equals(ingrimage4)||ingrimage23.equals(ingrimage5)||ingrimage23.equals(ingrimage6)||ingrimage23.equals(ingrimage7)||ingrimage23.equals(ingrimage8)||ingrimage23.equals(ingrimage9)||ingrimage23.equals(ingrimage10)||ingrimage23.equals(ingrimage11)||ingrimage23.equals(ingrimage12)||ingrimage23.equals(ingrimage13)||ingrimage23.equals(ingrimage14)||ingrimage23.equals(ingrimage15)||ingrimage23.equals(ingrimage16)||ingrimage23.equals(ingrimage17)||ingrimage23.equals(ingrimage18)||ingrimage23.equals(ingrimage19)||ingrimage23.equals(ingrimage20)||ingrimage23.equals(ingrimage21)||ingrimage23.equals(ingrimage22)) {ingrimage23="";}}						
			    this.ingrimage23=ingrimage23;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(24);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage24 = jsono.getString("ingrimage");ingrimage24="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage24;
			    if(ingrimage24.equals(ingrimage0)||ingrimage24.equals(ingrimage1)||ingrimage24.equals(ingrimage2)||ingrimage24.equals(ingrimage3)||ingrimage24.equals(ingrimage4)||ingrimage24.equals(ingrimage5)||ingrimage24.equals(ingrimage6)||ingrimage24.equals(ingrimage7)||ingrimage24.equals(ingrimage8)||ingrimage24.equals(ingrimage9)||ingrimage24.equals(ingrimage10)||ingrimage24.equals(ingrimage11)||ingrimage24.equals(ingrimage12)||ingrimage24.equals(ingrimage13)||ingrimage24.equals(ingrimage14)||ingrimage24.equals(ingrimage15)||ingrimage24.equals(ingrimage16)||ingrimage24.equals(ingrimage17)||ingrimage24.equals(ingrimage18)||ingrimage24.equals(ingrimage19)||ingrimage24.equals(ingrimage20)||ingrimage24.equals(ingrimage21)||ingrimage24.equals(ingrimage22)||ingrimage24.equals(ingrimage23)) {ingrimage24="";}}							
			    this.ingrimage24=ingrimage24;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(25);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage25 = jsono.getString("ingrimage");ingrimage25="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage25;
			    if(ingrimage25.equals(ingrimage0)||ingrimage25.equals(ingrimage1)||ingrimage25.equals(ingrimage2)||ingrimage25.equals(ingrimage3)||ingrimage25.equals(ingrimage4)||ingrimage25.equals(ingrimage5)||ingrimage25.equals(ingrimage6)||ingrimage25.equals(ingrimage7)||ingrimage25.equals(ingrimage8)||ingrimage25.equals(ingrimage9)||ingrimage25.equals(ingrimage10)||ingrimage25.equals(ingrimage11)||ingrimage25.equals(ingrimage12)||ingrimage25.equals(ingrimage13)||ingrimage25.equals(ingrimage14)||ingrimage25.equals(ingrimage15)||ingrimage25.equals(ingrimage16)||ingrimage25.equals(ingrimage17)||ingrimage25.equals(ingrimage18)||ingrimage25.equals(ingrimage19)||ingrimage25.equals(ingrimage20)||ingrimage25.equals(ingrimage21)||ingrimage25.equals(ingrimage22)||ingrimage25.equals(ingrimage23)||ingrimage25.equals(ingrimage24)) {ingrimage25="";}}								
			    this.ingrimage25=ingrimage25;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(26);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage26 = jsono.getString("ingrimage");ingrimage26="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage26;
			    if(ingrimage26.equals(ingrimage0)||ingrimage26.equals(ingrimage1)||ingrimage26.equals(ingrimage2)||ingrimage26.equals(ingrimage3)||ingrimage26.equals(ingrimage4)||ingrimage26.equals(ingrimage5)||ingrimage26.equals(ingrimage6)||ingrimage26.equals(ingrimage7)||ingrimage26.equals(ingrimage8)||ingrimage26.equals(ingrimage9)||ingrimage26.equals(ingrimage10)||ingrimage26.equals(ingrimage11)||ingrimage26.equals(ingrimage12)||ingrimage26.equals(ingrimage13)||ingrimage26.equals(ingrimage14)||ingrimage26.equals(ingrimage15)||ingrimage26.equals(ingrimage16)||ingrimage26.equals(ingrimage17)||ingrimage26.equals(ingrimage18)||ingrimage26.equals(ingrimage19)||ingrimage26.equals(ingrimage20)||ingrimage26.equals(ingrimage21)||ingrimage26.equals(ingrimage22)||ingrimage26.equals(ingrimage23)||ingrimage26.equals(ingrimage24)||ingrimage26.equals(ingrimage25)) {ingrimage26="";}}									
			    this.ingrimage26=ingrimage26;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(27);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage27 = jsono.getString("ingrimage");ingrimage27="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage27;
			    if(ingrimage27.equals(ingrimage0)||ingrimage27.equals(ingrimage1)||ingrimage27.equals(ingrimage2)||ingrimage27.equals(ingrimage3)||ingrimage27.equals(ingrimage4)||ingrimage27.equals(ingrimage5)||ingrimage27.equals(ingrimage6)||ingrimage27.equals(ingrimage7)||ingrimage27.equals(ingrimage8)||ingrimage27.equals(ingrimage9)||ingrimage27.equals(ingrimage10)||ingrimage27.equals(ingrimage11)||ingrimage27.equals(ingrimage12)||ingrimage27.equals(ingrimage13)||ingrimage27.equals(ingrimage14)||ingrimage27.equals(ingrimage15)||ingrimage27.equals(ingrimage16)||ingrimage27.equals(ingrimage17)||ingrimage27.equals(ingrimage18)||ingrimage27.equals(ingrimage19)||ingrimage27.equals(ingrimage20)||ingrimage27.equals(ingrimage21)||ingrimage27.equals(ingrimage22)||ingrimage27.equals(ingrimage23)||ingrimage27.equals(ingrimage24)||ingrimage27.equals(ingrimage25)||ingrimage27.equals(ingrimage26)) {ingrimage27="";}}	
			    this.ingrimage27=ingrimage27;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(28);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage28 = jsono.getString("ingrimage");ingrimage28="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage28;
			    if(ingrimage28.equals(ingrimage0)||ingrimage28.equals(ingrimage1)||ingrimage28.equals(ingrimage2)||ingrimage28.equals(ingrimage3)||ingrimage28.equals(ingrimage4)||ingrimage28.equals(ingrimage5)||ingrimage28.equals(ingrimage6)||ingrimage28.equals(ingrimage7)||ingrimage28.equals(ingrimage8)||ingrimage28.equals(ingrimage9)||ingrimage28.equals(ingrimage10)||ingrimage28.equals(ingrimage11)||ingrimage28.equals(ingrimage12)||ingrimage28.equals(ingrimage13)||ingrimage28.equals(ingrimage14)||ingrimage28.equals(ingrimage15)||ingrimage28.equals(ingrimage16)||ingrimage28.equals(ingrimage17)||ingrimage28.equals(ingrimage18)||ingrimage28.equals(ingrimage19)||ingrimage28.equals(ingrimage20)||ingrimage28.equals(ingrimage21)||ingrimage28.equals(ingrimage22)||ingrimage28.equals(ingrimage23)||ingrimage28.equals(ingrimage24)||ingrimage28.equals(ingrimage25)||ingrimage28.equals(ingrimage26)||ingrimage28.equals(ingrimage27)) {ingrimage28="";}}	
			    this.ingrimage28=ingrimage28;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(29);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage29 = jsono.getString("ingrimage");ingrimage29="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage29;
			    if(ingrimage29.equals(ingrimage0)||ingrimage29.equals(ingrimage1)||ingrimage29.equals(ingrimage2)||ingrimage29.equals(ingrimage3)||ingrimage29.equals(ingrimage4)||ingrimage29.equals(ingrimage5)||ingrimage29.equals(ingrimage6)||ingrimage29.equals(ingrimage7)||ingrimage29.equals(ingrimage8)||ingrimage29.equals(ingrimage9)||ingrimage29.equals(ingrimage10)||ingrimage29.equals(ingrimage11)||ingrimage29.equals(ingrimage12)||ingrimage29.equals(ingrimage13)||ingrimage29.equals(ingrimage14)||ingrimage29.equals(ingrimage15)||ingrimage29.equals(ingrimage16)||ingrimage29.equals(ingrimage17)||ingrimage29.equals(ingrimage18)||ingrimage29.equals(ingrimage19)||ingrimage29.equals(ingrimage20)||ingrimage29.equals(ingrimage21)||ingrimage29.equals(ingrimage22)||ingrimage29.equals(ingrimage23)||ingrimage29.equals(ingrimage24)||ingrimage29.equals(ingrimage25)||ingrimage29.equals(ingrimage26)||ingrimage29.equals(ingrimage27)||ingrimage29.equals(ingrimage28)) {ingrimage29="";}}	
			    this.ingrimage29=ingrimage29;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(30);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage30 = jsono.getString("ingrimage");ingrimage30="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage30;
			    if(ingrimage30.equals(ingrimage0)||ingrimage30.equals(ingrimage1)||ingrimage30.equals(ingrimage2)||ingrimage30.equals(ingrimage3)||ingrimage30.equals(ingrimage4)||ingrimage30.equals(ingrimage5)||ingrimage30.equals(ingrimage6)||ingrimage30.equals(ingrimage7)||ingrimage30.equals(ingrimage8)||ingrimage30.equals(ingrimage9)||ingrimage30.equals(ingrimage10)||ingrimage30.equals(ingrimage11)||ingrimage30.equals(ingrimage12)||ingrimage30.equals(ingrimage13)||ingrimage30.equals(ingrimage14)||ingrimage30.equals(ingrimage15)||ingrimage30.equals(ingrimage16)||ingrimage30.equals(ingrimage17)||ingrimage30.equals(ingrimage18)||ingrimage30.equals(ingrimage19)||ingrimage30.equals(ingrimage20)||ingrimage30.equals(ingrimage21)||ingrimage30.equals(ingrimage22)||ingrimage30.equals(ingrimage23)||ingrimage30.equals(ingrimage24)||ingrimage30.equals(ingrimage25)||ingrimage30.equals(ingrimage26)||ingrimage30.equals(ingrimage27)||ingrimage30.equals(ingrimage28)||ingrimage30.equals(ingrimage29)) {ingrimage30="";}}		
			    this.ingrimage30=ingrimage30;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(31);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage31 = jsono.getString("ingrimage");ingrimage31="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage31;
			    if(ingrimage31.equals(ingrimage0)||ingrimage31.equals(ingrimage1)||ingrimage31.equals(ingrimage2)||ingrimage31.equals(ingrimage3)||ingrimage31.equals(ingrimage4)||ingrimage31.equals(ingrimage5)||ingrimage31.equals(ingrimage6)||ingrimage31.equals(ingrimage7)||ingrimage31.equals(ingrimage8)||ingrimage31.equals(ingrimage9)||ingrimage31.equals(ingrimage10)||ingrimage31.equals(ingrimage11)||ingrimage31.equals(ingrimage12)||ingrimage31.equals(ingrimage13)||ingrimage31.equals(ingrimage14)||ingrimage31.equals(ingrimage15)||ingrimage31.equals(ingrimage16)||ingrimage31.equals(ingrimage17)||ingrimage31.equals(ingrimage18)||ingrimage31.equals(ingrimage19)||ingrimage31.equals(ingrimage20)||ingrimage31.equals(ingrimage21)||ingrimage31.equals(ingrimage22)||ingrimage31.equals(ingrimage23)||ingrimage31.equals(ingrimage24)||ingrimage31.equals(ingrimage25)||ingrimage31.equals(ingrimage26)||ingrimage31.equals(ingrimage27)||ingrimage31.equals(ingrimage28)||ingrimage31.equals(ingrimage29)||ingrimage31.equals(ingrimage30)) {ingrimage31="";}}			
			    this.ingrimage31=ingrimage31;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(32);
			    if(jsono.getString("ingrimage").equals("")){}
			    else {ingrimage32 = jsono.getString("ingrimage");ingrimage32="https://spoonacular.com/cdn/ingredients_100x100/"+ingrimage32;
			    if(ingrimage32.equals(ingrimage0)||ingrimage32.equals(ingrimage1)||ingrimage32.equals(ingrimage2)||ingrimage32.equals(ingrimage3)||ingrimage32.equals(ingrimage4)||ingrimage32.equals(ingrimage5)||ingrimage32.equals(ingrimage6)||ingrimage32.equals(ingrimage7)||ingrimage32.equals(ingrimage8)||ingrimage32.equals(ingrimage9)||ingrimage32.equals(ingrimage10)||ingrimage32.equals(ingrimage11)||ingrimage32.equals(ingrimage12)||ingrimage32.equals(ingrimage13)||ingrimage32.equals(ingrimage14)||ingrimage32.equals(ingrimage15)||ingrimage32.equals(ingrimage16)||ingrimage32.equals(ingrimage17)||ingrimage32.equals(ingrimage18)||ingrimage32.equals(ingrimage19)||ingrimage32.equals(ingrimage20)||ingrimage32.equals(ingrimage21)||ingrimage32.equals(ingrimage22)||ingrimage32.equals(ingrimage23)||ingrimage32.equals(ingrimage24)||ingrimage32.equals(ingrimage25)||ingrimage32.equals(ingrimage26)||ingrimage32.equals(ingrimage27)||ingrimage32.equals(ingrimage28)||ingrimage32.equals(ingrimage29)||ingrimage32.equals(ingrimage30)||ingrimage32.equals(ingrimage31)) {ingrimage32="";}}				
			    this.ingrimage32=ingrimage32;
			    }
			    catch(Exception e){	
			    }
			    
	        	   
			    jsono = jsonarray.getJSONObject(0);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname0 = jsono.getString("ingrname");ingrname0=" "+ingrname0.substring(0,1).toUpperCase()+ ingrname0.substring(1).toLowerCase();}	
			    this.ingrname0=ingrname0;

			    try {
			    jsono = jsonarray.getJSONObject(1);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname1 = jsono.getString("ingrname");ingrname1=" "+ingrname1.substring(0,1).toUpperCase()+ ingrname1.substring(1).toLowerCase();
			    	if(ingrname1.equals(ingrname0)) {ingrname1="";};}	
			    this.ingrname1=ingrname1;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(2);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname2 = jsono.getString("ingrname");ingrname2=" "+ingrname2.substring(0,1).toUpperCase()+ ingrname2.substring(1).toLowerCase();
			    if(ingrname2.equals(ingrname0)||ingrname2.equals(ingrname1)) {ingrname2="";}}	
			    this.ingrname2=ingrname2;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(3);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname3 = jsono.getString("ingrname");ingrname3=" "+ingrname3.substring(0,1).toUpperCase()+ ingrname3.substring(1).toLowerCase();
			    if(ingrname3.equals(ingrname0)||ingrname3.equals(ingrname1)||ingrname3.equals(ingrname2)) {ingrname3="";}}	
			    this.ingrname3=ingrname3;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(4);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname4 = jsono.getString("ingrname");ingrname4=" "+ingrname4.substring(0,1).toUpperCase()+ ingrname4.substring(1).toLowerCase();
			    if(ingrname4.equals(ingrname0)||ingrname4.equals(ingrname1)||ingrname4.equals(ingrname2)||ingrname4.equals(ingrname3)) {ingrname4="";}}	
			    this.ingrname4=ingrname4;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(5);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname5 = jsono.getString("ingrname");ingrname5=" "+ingrname5.substring(0,1).toUpperCase()+ ingrname5.substring(1).toLowerCase();
			    if(ingrname5.equals(ingrname0)||ingrname5.equals(ingrname1)||ingrname5.equals(ingrname2)||ingrname5.equals(ingrname3)||ingrname5.equals(ingrname4)) {ingrname5="";}}	
			    this.ingrname5=ingrname5;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(6);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname6 = jsono.getString("ingrname");ingrname6=" "+ingrname6.substring(0,1).toUpperCase()+ ingrname6.substring(1).toLowerCase();
			    if(ingrname6.equals(ingrname0)||ingrname6.equals(ingrname1)||ingrname6.equals(ingrname2)||ingrname6.equals(ingrname3)||ingrname6.equals(ingrname4)||ingrname6.equals(ingrname5)) {ingrname6="";}}	
			    this.ingrname6=ingrname6;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(7);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname7 = jsono.getString("ingrname");ingrname7=" "+ingrname7.substring(0,1).toUpperCase()+ ingrname7.substring(1).toLowerCase();
			    if(ingrname7.equals(ingrname0)||ingrname7.equals(ingrname1)||ingrname7.equals(ingrname2)||ingrname7.equals(ingrname3)||ingrname7.equals(ingrname4)||ingrname7.equals(ingrname5)||ingrname7.equals(ingrname6)) {ingrname7="";}}	
			    this.ingrname7=ingrname7;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(8);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname8 = jsono.getString("ingrname");ingrname8=" "+ingrname8.substring(0,1).toUpperCase()+ ingrname8.substring(1).toLowerCase();
			    if(ingrname8.equals(ingrname0)||ingrname8.equals(ingrname1)||ingrname8.equals(ingrname2)||ingrname8.equals(ingrname3)||ingrname8.equals(ingrname4)||ingrname8.equals(ingrname5)||ingrname8.equals(ingrname6)||ingrname8.equals(ingrname7)) {ingrname8="";}}	
			    this.ingrname8=ingrname8;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(9);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname9 = jsono.getString("ingrname");ingrname9=" "+ingrname9.substring(0,1).toUpperCase()+ ingrname9.substring(1).toLowerCase();
			    if(ingrname9.equals(ingrname0)||ingrname9.equals(ingrname1)||ingrname9.equals(ingrname2)||ingrname9.equals(ingrname3)||ingrname9.equals(ingrname4)||ingrname9.equals(ingrname5)||ingrname9.equals(ingrname6)||ingrname9.equals(ingrname7)||ingrname9.equals(ingrname8)) {ingrname9="";}}	
			    this.ingrname9=ingrname9;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(10);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname10 = jsono.getString("ingrname");ingrname10=" "+ingrname10.substring(0,1).toUpperCase()+ ingrname10.substring(1).toLowerCase();
			    if(ingrname10.equals(ingrname0)||ingrname10.equals(ingrname1)||ingrname10.equals(ingrname2)||ingrname10.equals(ingrname3)||ingrname10.equals(ingrname4)||ingrname10.equals(ingrname5)||ingrname10.equals(ingrname6)||ingrname10.equals(ingrname7)||ingrname10.equals(ingrname8)||ingrname10.equals(ingrname9)) {ingrname10="";}}	
			    this.ingrname10=ingrname10;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(11);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname11 = jsono.getString("ingrname");ingrname11=" "+ingrname11.substring(0,1).toUpperCase()+ ingrname11.substring(1).toLowerCase();
			    if(ingrname11.equals(ingrname0)||ingrname11.equals(ingrname1)||ingrname11.equals(ingrname2)||ingrname11.equals(ingrname3)||ingrname11.equals(ingrname4)||ingrname11.equals(ingrname5)||ingrname11.equals(ingrname6)||ingrname11.equals(ingrname7)||ingrname11.equals(ingrname8)||ingrname11.equals(ingrname9)||ingrname11.equals(ingrname10)) {ingrname11="";}}	
			    this.ingrname11=ingrname11;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(12);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname12 = jsono.getString("ingrname");ingrname12=" "+ingrname12.substring(0,1).toUpperCase()+ ingrname12.substring(1).toLowerCase();
			    if(ingrname12.equals(ingrname0)||ingrname12.equals(ingrname1)||ingrname12.equals(ingrname2)||ingrname12.equals(ingrname3)||ingrname12.equals(ingrname4)||ingrname12.equals(ingrname5)||ingrname12.equals(ingrname6)||ingrname12.equals(ingrname7)||ingrname12.equals(ingrname8)||ingrname12.equals(ingrname9)||ingrname12.equals(ingrname10)||ingrname12.equals(ingrname11)) {ingrname12="";}}	
			    this.ingrname12=ingrname12;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(13);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname13 = jsono.getString("ingrname");ingrname13=" "+ingrname13.substring(0,1).toUpperCase()+ ingrname13.substring(1).toLowerCase();
			    if(ingrname13.equals(ingrname0)||ingrname13.equals(ingrname1)||ingrname13.equals(ingrname2)||ingrname13.equals(ingrname3)||ingrname13.equals(ingrname4)||ingrname13.equals(ingrname5)||ingrname13.equals(ingrname6)||ingrname13.equals(ingrname7)||ingrname13.equals(ingrname8)||ingrname13.equals(ingrname9)||ingrname13.equals(ingrname10)||ingrname13.equals(ingrname11)||ingrname13.equals(ingrname12)) {ingrname13="";}}	
			    this.ingrname13=ingrname13;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(14);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname14 = jsono.getString("ingrname");ingrname14=" "+ingrname14.substring(0,1).toUpperCase()+ ingrname14.substring(1).toLowerCase();
			    if(ingrname14.equals(ingrname0)||ingrname14.equals(ingrname1)||ingrname14.equals(ingrname2)||ingrname14.equals(ingrname3)||ingrname14.equals(ingrname4)||ingrname14.equals(ingrname5)||ingrname14.equals(ingrname6)||ingrname14.equals(ingrname7)||ingrname14.equals(ingrname8)||ingrname14.equals(ingrname9)||ingrname14.equals(ingrname10)||ingrname14.equals(ingrname11)||ingrname14.equals(ingrname12)||ingrname14.equals(ingrname13)) {ingrname14="";}}		
			    this.ingrname14=ingrname14;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(15);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname15 = jsono.getString("ingrname");ingrname15=" "+ingrname15.substring(0,1).toUpperCase()+ ingrname15.substring(1).toLowerCase();
			    if(ingrname15.equals(ingrname0)||ingrname15.equals(ingrname1)||ingrname15.equals(ingrname2)||ingrname15.equals(ingrname3)||ingrname15.equals(ingrname4)||ingrname15.equals(ingrname5)||ingrname15.equals(ingrname6)||ingrname15.equals(ingrname7)||ingrname15.equals(ingrname8)||ingrname15.equals(ingrname9)||ingrname15.equals(ingrname10)||ingrname15.equals(ingrname11)||ingrname15.equals(ingrname12)||ingrname15.equals(ingrname13)||ingrname15.equals(ingrname14)) {ingrname15="";}}			
			    this.ingrname15=ingrname15;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(16);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname16 = jsono.getString("ingrname");ingrname16=" "+ingrname16.substring(0,1).toUpperCase()+ ingrname16.substring(1).toLowerCase();
			    if(ingrname16.equals(ingrname0)||ingrname16.equals(ingrname1)||ingrname16.equals(ingrname2)||ingrname16.equals(ingrname3)||ingrname16.equals(ingrname4)||ingrname16.equals(ingrname5)||ingrname16.equals(ingrname6)||ingrname16.equals(ingrname7)||ingrname16.equals(ingrname8)||ingrname16.equals(ingrname9)||ingrname16.equals(ingrname10)||ingrname16.equals(ingrname11)||ingrname16.equals(ingrname12)||ingrname16.equals(ingrname13)||ingrname16.equals(ingrname14)||ingrname16.equals(ingrname15)) {ingrname16="";}}				
			    this.ingrname16=ingrname16;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(17);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname17 = jsono.getString("ingrname");ingrname17=" "+ingrname17.substring(0,1).toUpperCase()+ ingrname17.substring(1).toLowerCase();
			    if(ingrname17.equals(ingrname0)||ingrname17.equals(ingrname1)||ingrname17.equals(ingrname2)||ingrname17.equals(ingrname3)||ingrname17.equals(ingrname4)||ingrname17.equals(ingrname5)||ingrname17.equals(ingrname6)||ingrname17.equals(ingrname7)||ingrname17.equals(ingrname8)||ingrname17.equals(ingrname9)||ingrname17.equals(ingrname10)||ingrname17.equals(ingrname11)||ingrname17.equals(ingrname12)||ingrname17.equals(ingrname13)||ingrname17.equals(ingrname14)||ingrname17.equals(ingrname15)||ingrname17.equals(ingrname16)) {ingrname17="";}}					
			    this.ingrname17=ingrname17;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(18);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname18 = jsono.getString("ingrname");ingrname18=" "+ingrname18.substring(0,1).toUpperCase()+ ingrname18.substring(1).toLowerCase();
			    if(ingrname18.equals(ingrname0)||ingrname18.equals(ingrname1)||ingrname18.equals(ingrname2)||ingrname18.equals(ingrname3)||ingrname18.equals(ingrname4)||ingrname18.equals(ingrname5)||ingrname18.equals(ingrname6)||ingrname18.equals(ingrname7)||ingrname18.equals(ingrname8)||ingrname18.equals(ingrname9)||ingrname18.equals(ingrname10)||ingrname18.equals(ingrname11)||ingrname18.equals(ingrname12)||ingrname18.equals(ingrname13)||ingrname18.equals(ingrname14)||ingrname18.equals(ingrname15)||ingrname18.equals(ingrname16)||ingrname18.equals(ingrname17)) {ingrname18="";}}						
			    this.ingrname18=ingrname18;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(19);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname19 = jsono.getString("ingrname");ingrname19=" "+ingrname19.substring(0,1).toUpperCase()+ ingrname19.substring(1).toLowerCase();
			    if(ingrname19.equals(ingrname0)||ingrname19.equals(ingrname1)||ingrname19.equals(ingrname2)||ingrname19.equals(ingrname3)||ingrname19.equals(ingrname4)||ingrname19.equals(ingrname5)||ingrname19.equals(ingrname6)||ingrname19.equals(ingrname7)||ingrname19.equals(ingrname8)||ingrname19.equals(ingrname9)||ingrname19.equals(ingrname10)||ingrname19.equals(ingrname11)||ingrname19.equals(ingrname12)||ingrname19.equals(ingrname13)||ingrname19.equals(ingrname14)||ingrname19.equals(ingrname15)||ingrname19.equals(ingrname16)||ingrname19.equals(ingrname17)||ingrname19.equals(ingrname18)) {ingrname19="";}}							
			    this.ingrname19=ingrname19;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(20);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname20 = jsono.getString("ingrname");ingrname20=" "+ingrname20.substring(0,1).toUpperCase()+ ingrname20.substring(1).toLowerCase();
			    if(ingrname20.equals(ingrname0)||ingrname20.equals(ingrname1)||ingrname20.equals(ingrname2)||ingrname20.equals(ingrname3)||ingrname20.equals(ingrname4)||ingrname20.equals(ingrname5)||ingrname20.equals(ingrname6)||ingrname20.equals(ingrname7)||ingrname20.equals(ingrname8)||ingrname20.equals(ingrname9)||ingrname20.equals(ingrname10)||ingrname20.equals(ingrname11)||ingrname20.equals(ingrname12)||ingrname20.equals(ingrname13)||ingrname20.equals(ingrname14)||ingrname20.equals(ingrname15)||ingrname20.equals(ingrname16)||ingrname20.equals(ingrname17)||ingrname20.equals(ingrname18)||ingrname20.equals(ingrname19)) {ingrname20="";}}								
			    this.ingrname20=ingrname20;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(21);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname21 = jsono.getString("ingrname");ingrname21=" "+ingrname21.substring(0,1).toUpperCase()+ ingrname21.substring(1).toLowerCase();
			    if(ingrname21.equals(ingrname0)||ingrname21.equals(ingrname1)||ingrname21.equals(ingrname2)||ingrname21.equals(ingrname3)||ingrname21.equals(ingrname4)||ingrname21.equals(ingrname5)||ingrname21.equals(ingrname6)||ingrname21.equals(ingrname7)||ingrname21.equals(ingrname8)||ingrname21.equals(ingrname9)||ingrname21.equals(ingrname10)||ingrname21.equals(ingrname11)||ingrname21.equals(ingrname12)||ingrname21.equals(ingrname13)||ingrname21.equals(ingrname14)||ingrname21.equals(ingrname15)||ingrname21.equals(ingrname16)||ingrname21.equals(ingrname17)||ingrname21.equals(ingrname18)||ingrname21.equals(ingrname19)||ingrname21.equals(ingrname20)) {ingrname21="";}}									
			    this.ingrname21=ingrname21;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(22);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname22 = jsono.getString("ingrname");ingrname22=" "+ingrname22.substring(0,1).toUpperCase()+ ingrname22.substring(1).toLowerCase();
			    if(ingrname22.equals(ingrname0)||ingrname22.equals(ingrname1)||ingrname22.equals(ingrname2)||ingrname22.equals(ingrname3)||ingrname22.equals(ingrname4)||ingrname22.equals(ingrname5)||ingrname22.equals(ingrname6)||ingrname22.equals(ingrname7)||ingrname22.equals(ingrname8)||ingrname22.equals(ingrname9)||ingrname22.equals(ingrname10)||ingrname22.equals(ingrname11)||ingrname22.equals(ingrname12)||ingrname22.equals(ingrname13)||ingrname22.equals(ingrname14)||ingrname22.equals(ingrname15)||ingrname22.equals(ingrname16)||ingrname22.equals(ingrname17)||ingrname22.equals(ingrname18)||ingrname22.equals(ingrname19)||ingrname22.equals(ingrname20)||ingrname22.equals(ingrname21)) {ingrname22="";}}										
			    this.ingrname22=ingrname22;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(23);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname23 = jsono.getString("ingrname");ingrname23=" "+ingrname23.substring(0,1).toUpperCase()+ ingrname23.substring(1).toLowerCase();
			    if(ingrname23.equals(ingrname0)||ingrname23.equals(ingrname1)||ingrname23.equals(ingrname2)||ingrname23.equals(ingrname3)||ingrname23.equals(ingrname4)||ingrname23.equals(ingrname5)||ingrname23.equals(ingrname6)||ingrname23.equals(ingrname7)||ingrname23.equals(ingrname8)||ingrname23.equals(ingrname9)||ingrname23.equals(ingrname10)||ingrname23.equals(ingrname11)||ingrname23.equals(ingrname12)||ingrname23.equals(ingrname13)||ingrname23.equals(ingrname14)||ingrname23.equals(ingrname15)||ingrname23.equals(ingrname16)||ingrname23.equals(ingrname17)||ingrname23.equals(ingrname18)||ingrname23.equals(ingrname19)||ingrname23.equals(ingrname20)||ingrname23.equals(ingrname21)||ingrname23.equals(ingrname22)) {ingrname23="";}}											
			    this.ingrname23=ingrname23;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(24);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname24 = jsono.getString("ingrname");ingrname24=" "+ingrname24.substring(0,1).toUpperCase()+ ingrname24.substring(1).toLowerCase();
			    if(ingrname24.equals(ingrname0)||ingrname24.equals(ingrname1)||ingrname24.equals(ingrname2)||ingrname24.equals(ingrname3)||ingrname24.equals(ingrname4)||ingrname24.equals(ingrname5)||ingrname24.equals(ingrname6)||ingrname24.equals(ingrname7)||ingrname24.equals(ingrname8)||ingrname24.equals(ingrname9)||ingrname24.equals(ingrname10)||ingrname24.equals(ingrname11)||ingrname24.equals(ingrname12)||ingrname24.equals(ingrname13)||ingrname24.equals(ingrname14)||ingrname24.equals(ingrname15)||ingrname24.equals(ingrname16)||ingrname24.equals(ingrname17)||ingrname24.equals(ingrname18)||ingrname24.equals(ingrname19)||ingrname24.equals(ingrname20)||ingrname24.equals(ingrname21)||ingrname24.equals(ingrname22)||ingrname24.equals(ingrname23)) {ingrname24="";}}												
			    this.ingrname24=ingrname24;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(25);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname25 = jsono.getString("ingrname");ingrname25=" "+ingrname25.substring(0,1).toUpperCase()+ ingrname25.substring(1).toLowerCase();
			    if(ingrname25.equals(ingrname0)||ingrname25.equals(ingrname1)||ingrname25.equals(ingrname2)||ingrname25.equals(ingrname3)||ingrname25.equals(ingrname4)||ingrname25.equals(ingrname5)||ingrname25.equals(ingrname6)||ingrname25.equals(ingrname7)||ingrname25.equals(ingrname8)||ingrname25.equals(ingrname9)||ingrname25.equals(ingrname10)||ingrname25.equals(ingrname11)||ingrname25.equals(ingrname12)||ingrname25.equals(ingrname13)||ingrname25.equals(ingrname14)||ingrname25.equals(ingrname15)||ingrname25.equals(ingrname16)||ingrname25.equals(ingrname17)||ingrname25.equals(ingrname18)||ingrname25.equals(ingrname19)||ingrname25.equals(ingrname20)||ingrname25.equals(ingrname21)||ingrname25.equals(ingrname22)||ingrname25.equals(ingrname23)||ingrname25.equals(ingrname25)) {ingrname25="";}}													
			    this.ingrname25=ingrname25;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(26);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname26 = jsono.getString("ingrname");ingrname26=" "+ingrname26.substring(0,1).toUpperCase()+ ingrname26.substring(1).toLowerCase();
			    if(ingrname26.equals(ingrname0)||ingrname26.equals(ingrname1)||ingrname26.equals(ingrname2)||ingrname26.equals(ingrname3)||ingrname26.equals(ingrname4)||ingrname26.equals(ingrname5)||ingrname26.equals(ingrname6)||ingrname26.equals(ingrname7)||ingrname26.equals(ingrname8)||ingrname26.equals(ingrname9)||ingrname26.equals(ingrname10)||ingrname26.equals(ingrname11)||ingrname26.equals(ingrname12)||ingrname26.equals(ingrname13)||ingrname26.equals(ingrname14)||ingrname26.equals(ingrname15)||ingrname26.equals(ingrname16)||ingrname26.equals(ingrname17)||ingrname26.equals(ingrname18)||ingrname26.equals(ingrname19)||ingrname26.equals(ingrname20)||ingrname26.equals(ingrname21)||ingrname26.equals(ingrname22)||ingrname26.equals(ingrname23)||ingrname26.equals(ingrname24)||ingrname26.equals(ingrname25)) {ingrname26="";}}														
			    this.ingrname26=ingrname26;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(27);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname27 = jsono.getString("ingrname");ingrname27=" "+ingrname27.substring(0,1).toUpperCase()+ ingrname27.substring(1).toLowerCase();
			    if(ingrname27.equals(ingrname0)||ingrname27.equals(ingrname1)||ingrname27.equals(ingrname2)||ingrname27.equals(ingrname3)||ingrname27.equals(ingrname4)||ingrname27.equals(ingrname5)||ingrname27.equals(ingrname6)||ingrname27.equals(ingrname7)||ingrname27.equals(ingrname8)||ingrname27.equals(ingrname9)||ingrname27.equals(ingrname10)||ingrname27.equals(ingrname11)||ingrname27.equals(ingrname12)||ingrname27.equals(ingrname13)||ingrname27.equals(ingrname14)||ingrname27.equals(ingrname15)||ingrname27.equals(ingrname16)||ingrname27.equals(ingrname17)||ingrname27.equals(ingrname18)||ingrname27.equals(ingrname19)||ingrname27.equals(ingrname20)||ingrname27.equals(ingrname21)||ingrname27.equals(ingrname22)||ingrname27.equals(ingrname23)||ingrname27.equals(ingrname24)||ingrname27.equals(ingrname25)||ingrname27.equals(ingrname26)) {ingrname27="";}}															
			    this.ingrname27=ingrname27;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(28);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname28 = jsono.getString("ingrname");ingrname28=" "+ingrname28.substring(0,1).toUpperCase()+ ingrname28.substring(1).toLowerCase();
			    if(ingrname28.equals(ingrname0)||ingrname28.equals(ingrname1)||ingrname28.equals(ingrname2)||ingrname28.equals(ingrname3)||ingrname28.equals(ingrname4)||ingrname28.equals(ingrname5)||ingrname28.equals(ingrname6)||ingrname28.equals(ingrname7)||ingrname28.equals(ingrname8)||ingrname28.equals(ingrname9)||ingrname28.equals(ingrname10)||ingrname28.equals(ingrname11)||ingrname28.equals(ingrname12)||ingrname28.equals(ingrname13)||ingrname28.equals(ingrname14)||ingrname28.equals(ingrname15)||ingrname28.equals(ingrname16)||ingrname28.equals(ingrname17)||ingrname28.equals(ingrname18)||ingrname28.equals(ingrname19)||ingrname28.equals(ingrname20)||ingrname28.equals(ingrname21)||ingrname28.equals(ingrname22)||ingrname28.equals(ingrname23)||ingrname28.equals(ingrname24)||ingrname28.equals(ingrname25)||ingrname28.equals(ingrname26)||ingrname28.equals(ingrname27)) {ingrname28="";}}																
			    this.ingrname28=ingrname28;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(29);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname29 = jsono.getString("ingrname");ingrname29=" "+ingrname29.substring(0,1).toUpperCase()+ ingrname29.substring(1).toLowerCase();
			    if(ingrname29.equals(ingrname0)||ingrname29.equals(ingrname1)||ingrname29.equals(ingrname2)||ingrname29.equals(ingrname3)||ingrname29.equals(ingrname4)||ingrname29.equals(ingrname5)||ingrname29.equals(ingrname6)||ingrname29.equals(ingrname7)||ingrname29.equals(ingrname8)||ingrname29.equals(ingrname9)||ingrname29.equals(ingrname10)||ingrname29.equals(ingrname11)||ingrname29.equals(ingrname12)||ingrname29.equals(ingrname13)||ingrname29.equals(ingrname14)||ingrname29.equals(ingrname15)||ingrname29.equals(ingrname16)||ingrname29.equals(ingrname17)||ingrname29.equals(ingrname18)||ingrname29.equals(ingrname19)||ingrname29.equals(ingrname20)||ingrname29.equals(ingrname21)||ingrname29.equals(ingrname22)||ingrname29.equals(ingrname23)||ingrname29.equals(ingrname24)||ingrname29.equals(ingrname25)||ingrname29.equals(ingrname26)||ingrname29.equals(ingrname27)||ingrname29.equals(ingrname28)) {ingrname29="";}}																	
			    this.ingrname29=ingrname29;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(30);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname30 = jsono.getString("ingrname");ingrname30=" "+ingrname30.substring(0,1).toUpperCase()+ ingrname30.substring(1).toLowerCase();
			    if(ingrname30.equals(ingrname0)||ingrname30.equals(ingrname1)||ingrname30.equals(ingrname2)||ingrname30.equals(ingrname3)||ingrname30.equals(ingrname4)||ingrname30.equals(ingrname5)||ingrname30.equals(ingrname6)||ingrname30.equals(ingrname7)||ingrname30.equals(ingrname8)||ingrname30.equals(ingrname9)||ingrname30.equals(ingrname10)||ingrname30.equals(ingrname11)||ingrname30.equals(ingrname12)||ingrname30.equals(ingrname13)||ingrname30.equals(ingrname14)||ingrname30.equals(ingrname15)||ingrname30.equals(ingrname16)||ingrname30.equals(ingrname17)||ingrname30.equals(ingrname18)||ingrname30.equals(ingrname19)||ingrname30.equals(ingrname20)||ingrname30.equals(ingrname21)||ingrname30.equals(ingrname22)||ingrname30.equals(ingrname23)||ingrname30.equals(ingrname24)||ingrname30.equals(ingrname25)||ingrname30.equals(ingrname26)||ingrname30.equals(ingrname27)||ingrname30.equals(ingrname28)||ingrname30.equals(ingrname29)) {ingrname30="";}}																		
			    this.ingrname30=ingrname30;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(31);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname31 = jsono.getString("ingrname");ingrname31=" "+ingrname31.substring(0,1).toUpperCase()+ ingrname31.substring(1).toLowerCase();
			    if(ingrname31.equals(ingrname0)||ingrname31.equals(ingrname1)||ingrname31.equals(ingrname2)||ingrname31.equals(ingrname3)||ingrname31.equals(ingrname4)||ingrname31.equals(ingrname5)||ingrname31.equals(ingrname6)||ingrname31.equals(ingrname7)||ingrname31.equals(ingrname8)||ingrname31.equals(ingrname9)||ingrname31.equals(ingrname10)||ingrname31.equals(ingrname11)||ingrname31.equals(ingrname12)||ingrname31.equals(ingrname13)||ingrname31.equals(ingrname14)||ingrname31.equals(ingrname15)||ingrname31.equals(ingrname16)||ingrname31.equals(ingrname17)||ingrname31.equals(ingrname18)||ingrname31.equals(ingrname19)||ingrname31.equals(ingrname20)||ingrname31.equals(ingrname21)||ingrname31.equals(ingrname22)||ingrname31.equals(ingrname23)||ingrname31.equals(ingrname24)||ingrname31.equals(ingrname25)||ingrname31.equals(ingrname26)||ingrname31.equals(ingrname27)||ingrname31.equals(ingrname28)||ingrname31.equals(ingrname29)||ingrname31.equals(ingrname30)) {ingrname31="";}}																			
			    this.ingrname31=ingrname31;
			    }
			    catch(Exception e){	
			    }
			    try {
			    jsono = jsonarray.getJSONObject(32);
			    if(jsono.getString("ingrname").equals("")){}
			    else {ingrname32 = jsono.getString("ingrname");ingrname32=" "+ingrname32.substring(0,1).toUpperCase()+ ingrname32.substring(1).toLowerCase();
			    if(ingrname32.equals(ingrname0)||ingrname32.equals(ingrname1)||ingrname32.equals(ingrname2)||ingrname32.equals(ingrname3)||ingrname32.equals(ingrname4)||ingrname32.equals(ingrname5)||ingrname32.equals(ingrname6)||ingrname32.equals(ingrname7)||ingrname32.equals(ingrname8)||ingrname32.equals(ingrname9)||ingrname32.equals(ingrname10)||ingrname32.equals(ingrname11)||ingrname32.equals(ingrname12)||ingrname32.equals(ingrname13)||ingrname32.equals(ingrname14)||ingrname32.equals(ingrname15)||ingrname32.equals(ingrname16)||ingrname32.equals(ingrname17)||ingrname32.equals(ingrname18)||ingrname32.equals(ingrname19)||ingrname32.equals(ingrname20)||ingrname32.equals(ingrname21)||ingrname32.equals(ingrname22)||ingrname32.equals(ingrname23)||ingrname32.equals(ingrname24)||ingrname32.equals(ingrname25)||ingrname32.equals(ingrname26)||ingrname32.equals(ingrname27)||ingrname32.equals(ingrname28)||ingrname32.equals(ingrname29)||ingrname32.equals(ingrname30)||ingrname32.equals(ingrname31)) {ingrname32="";}}																				
			    this.ingrname32=ingrname32;
			    }
			    catch(Exception e){	
			    }
	        	   
			    this.id=id;
			    
			    //ersätter tecken och tar bort märkliga tecken som kommer från API
			    
			    title=title.replaceAll(" ", "_");
			    title=title.replaceAll("&", "@");
			    title=title.replaceAll("Ã", "");
              	title=title.replaceAll("©", "");
              	title=title.replaceAll("â", "");
              	title=title.replaceAll("€", "");
              	title=title.replaceAll("œ", "");
              	title=title.replaceAll("�", "");
			    title=title.replaceAll("\\{", "");
			    title=title.replaceAll("\\}", "");
			    title=title.replaceAll("“", "");


			    this.title=title;
			    
	        	   String step = new String();
	        	   int i = 1;
	        	   try {
   	        	   for (int j = 0; j <=jsonarray.length()-1; j++) {
   			        	jsono = jsonarray.getJSONObject(j);
   			        	if(jsono.getString("step").equals("")) {
   			        	}
   			        	else {
   			        		String s = jsono.getString("step");
   			        		String g = s.replace(". ", ".\n");
   	   			        	if(g.contains(".\n")) {
   	   			        		step = step+i+"."+g+"\n\n";
   	   			        	}
   	   			        	else {
   	   			        	step = step+i+". "+jsono.getString("step")+"\n\n";
   	   			        	}
   	   			        	i++;
   			        	}
   			       }
	        	   } catch(Exception e) {}
   	        	   this.step=step;

    
      }
    }
    


