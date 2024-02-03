package Log4jFramework;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.Logger;

public class Log4jSelenium {

	public static void main(String[] args) {
		Logger log = (Logger) LogManager.getLogger("Log4jSelenium");
		System.out.println("this is logger demo.");
		
		log.info("for info only");
		log.fatal("fatal msg");

		log.debug("for debug");
		log.error("error message");
		log.warn("warning message");
	}
}
