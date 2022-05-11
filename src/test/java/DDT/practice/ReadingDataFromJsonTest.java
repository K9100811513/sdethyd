package DDT.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadingDataFromJsonTest {
	
	@Test
	public void ReadingDataFromJsonTest() throws Throwable
	{
//step=1 convert physical file into java object
	FileReader fr = new FileReader("./commonData.json");
	//step=2 convert json object into java object
	JSONParser jp=new JSONParser();
	Object jobj=jp.parse(fr);
	//step=3 reading the data
	HashMap hp =(HashMap)jobj;
	String URL=(String)hp.get("url");
	System.out.println(URL);
	}
		
	}

