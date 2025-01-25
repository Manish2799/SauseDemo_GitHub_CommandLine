package UtilityLayer;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String getProperty(String keyname) throws IOException
	{
		Properties prop=new Properties();
		
		String path=System.getProperty("user.dir")+ "/src/main/java/ConfigurationLayer/congig.property";
		
		FileReader file=new FileReader(path);
		
		prop.load(file);
		
		return prop.getProperty(keyname);
		
		
	}

}
