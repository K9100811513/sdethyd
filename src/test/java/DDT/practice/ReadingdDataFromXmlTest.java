package DDT.practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadingdDataFromXmlTest {
@Test
public void readingDataFromXmlTest(XmlTest xml)
{
	System.out.println(xml.getParameter("url"));
}

}
