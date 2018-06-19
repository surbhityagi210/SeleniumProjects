package operation;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadObject {
	Properties prop = new Properties();

	public Properties getObjectRepository(){
	try {
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\tyagi.s\\eclipse-workspace\\TestNG\\Object.properties");
		prop = new Properties();
		prop.load(fs); 
		 

	} catch (Exception e) {
		// TODO: handle exception
	}
	return prop;
}
}
