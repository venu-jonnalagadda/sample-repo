package com.step.definitions;


import java.io.*;
import java.util.*;

import org.json.simple.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Testinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONParser parser = new JSONParser();
	      try {
	         Object obj = parser.parse(new FileReader("C:\\Users\\venu.jonnalagadda\\eclipse-workspace\\GSPANNWEB\\src\\main\\resources\\testData.json"));
	         JSONObject jsonObject = (JSONObject)obj;
	         String OurPeople = (String)jsonObject.get("Our People");
	     
	       
	         System.out.println("Our People: " + OurPeople);
	         
	         
	      } catch(Exception e) {
	         e.printStackTrace();
	      }

	}

}
