package log4jproject;

import org.apache.log4j.Logger;

public class Test {
	Logger log=Logger.getLogger(Test.class);
	public void add() {
		log.info(10+20);
}

}
