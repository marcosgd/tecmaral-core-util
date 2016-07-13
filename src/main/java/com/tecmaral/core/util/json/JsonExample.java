package com.tecmaral.core.util.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonExample
{

	public static final ObjectMapper JSON_MAPPER = new ObjectMapper();

	public static Persona jsonToJava(){
		Persona objeto = null;
		try {
			 objeto = JSON_MAPPER.readValue(new File("./src/main/resources/mijson.json"), Persona.class);
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objeto;
	}
	


	
	public static void javaToJson(){
		
		try {
			
			Persona objeto = Persona.getMock();			
			JSON_MAPPER.writeValue(new File("./src/main/resources/mijsonFronJava.json"), objeto);
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
   
}
