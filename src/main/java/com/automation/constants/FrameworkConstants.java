package com.automation.constants;

public final class FrameworkConstants {			// by making it final you can avoid extending this class
	private FrameworkConstants() {}				// by creating private constructor you can avoid creating instance of the class
	
	private static final String TESTRESOURCEPATH = System.getProperty( "user.dir" )+ "/src/test/resources";
	private static final String CHROMEDRIVER = TESTRESOURCEPATH + "/executables/chromedriver.exe";
	private static final String TESTCONFIGPATH = TESTRESOURCEPATH + "/config/config.properties";
	
	public static String getChromeDriver() { 	return CHROMEDRIVER; }
	public static String getTestConfigPath() { return TESTCONFIGPATH; }
}
