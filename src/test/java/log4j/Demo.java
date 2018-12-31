package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Demo {
	
	@Test()
	public void Demo()
	{
		BasicConfigurator.configure();
		Logger Log = LogManager.getLogger(Demo.class.getName());
		Log.debug("debug");
		Log.error("error");
		Log.fatal("fatel");
		Log.info("Info");
		
		
	}

}
 