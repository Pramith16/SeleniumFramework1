package configProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Properties_demo {
	
	static Properties prop  = new Properties();
	
	static String dir =System.getProperty("user.dir");
	
	static String browsername ;

	public static void main(String[] args) {

		getProperties();
		setProperties();
		getProperties();

	}

	public static String getProperties() {
		try {
			
			InputStream input = new FileInputStream(dir + "\\src\\test\\java\\configProperties\\config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			browsername = prop.getProperty("browser") ; 	
			System.out.println(browsername);


		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		return browsername;
	}
	
	
	public static void setProperties() {
		try {
			
			OutputStream output = new FileOutputStream(dir + "\\src\\test\\java\\configProperties\\config.properties");
			try {
				prop.setProperty("browser","firefox");
				prop.store(output,null);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}


		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
