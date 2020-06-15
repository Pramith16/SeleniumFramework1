package demoLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_demo {

	private static Logger logger = LogManager.getLogger(Log4j_demo.class);
	
	public static void main(String[] args) {
	
		System.out.println("Heloo Log4j world...!!!!\n");
		
		logger.info("This is information msg");
		
		logger.error("This is an Error msg");

		logger.warn("Warning message");
		
		logger.fatal("Fatal message");
		
		System.out.println("Completed");
	}

}
