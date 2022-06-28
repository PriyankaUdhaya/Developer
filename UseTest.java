package log4jproject;

import org.apache.log4j.BasicConfigurator;

public class UseTest {
	public static void main(String[] args) {
		
		Test t=new Test();
		BasicConfigurator.configure();
		t.add();
	}

}
