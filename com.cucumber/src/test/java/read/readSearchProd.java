package read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readSearchProd {

	static JSONObject obj;
	
	String text;
	String email;
	String pass;
	
	public readSearchProd()  {
		searchPrdt();
	}
	public static void searchPrdt()  {
		
		JSONParser jp =new JSONParser();
		try {
			obj=(JSONObject)jp.parse(new FileReader("json\\searchProd.json") );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getSearchText() {
		text=(String)obj.get("search");
		return text;
	}
	public String getMail() {
		email=(String)obj.get("mail");
		return email;
	}
	
	public String getPassW() {
		pass=(String)obj.get("password");
		return pass;
	}
	

	
	
}
