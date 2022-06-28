package log4jproject;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jex {
	static Logger log=Logger.getLogger(Log4jex.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Logging info");
		log.debug("Logging debug");
		log.fatal("Logging fatal");
		log.error("Logging Error");
		log.warn("Logging Warn");
	}
	

}
