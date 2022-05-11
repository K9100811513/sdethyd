package DDT.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingDataFromPropertyFileTest {

	@Test
	public void ReadingDataFromPropertyTest() throws Throwable{
		//step1=1 covert physical file into java object 
		FileInputStream fis=new FileInputStream("./commonData.properties");
		//step=2 load the java object

		Properties p=new Properties();
		p.load(fis);
		//step=3 read the data
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("un"));
		System.out.println(p.getProperty("pwd"));

	}
}

