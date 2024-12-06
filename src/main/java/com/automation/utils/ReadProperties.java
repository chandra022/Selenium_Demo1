package com.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.automation.constants.FrameworkConstants;

public class ReadProperties {
	private ReadProperties() {	}
	
	private static Properties prop = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap();

//  >>> Eager Initilization - initializing before using	
	static {
		try {
			FileInputStream fil = new FileInputStream( FrameworkConstants.getTestConfigPath() );
			prop.load( fil );
//			for( Object key: prop.keySet() ) {
//				CONFIGMAP.put( String.valueOf( key ), prop.getProperty( String.valueOf( key ) ) );
//			}
			for( Map.Entry<Object, Object> entry: prop.entrySet() ) {
				CONFIGMAP.put( String.valueOf( entry.getKey() ), 
								prop.getProperty( String.valueOf( entry.getValue() ) ) 
							);
			}
			
//			prop.entrySet().forEach(  entry -> CONFIGMAP.put( entry.getKey() , entry.getValue() ) );
		}
		catch( FileNotFoundException e) {
			e.printStackTrace();
		}
		catch( IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static String getValue( String key ) throws Exception{
		if( Objects.isNull(key) || Objects.isNull( CONFIGMAP.get( key )) ) {
			throw new Exception("Property name "+ key +" is not found. Please check config.properties" );
		}
		return CONFIGMAP.get( key );
	}
	
	

//	public static String getValue( String keyVal) 
//			throws Exception {
////	>>> Lazy initialization		--	creating instance and initializing them when its needed		
//		FileInputStream fil = new FileInputStream( FrameworkConstants.getTestConfigPath() );
//		Properties prop = new Properties();
//		prop.load(fil);
		
//		if( Objects.isNull( keyVal) || Objects.isNull( prop.getProperty( keyVal ) )) {
//			throw new Exception( "Property name "+ keyVal +" is not found. Please check config.properties" );
//		}	
//		return prop.getProperty(keyVal);
//	}
}
