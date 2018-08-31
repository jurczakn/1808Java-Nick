package com.revature.util;

import org.apache.log4j.Logger;

public class LoggingUtil {
	
	private static Logger log = Logger.getRootLogger();
	
	public static void logFatal(String message){
		log.fatal(message);
	}
	
	public static void logError(String message){
		log.error(message);
	}
	
	public static void logWarn(String message){
		log.warn(message);
	}
	
	public static void logInfo(String message){
		log.info(message);
	}
	
	public static void logDebug(String message){
		log.debug(message);
	}
	
	public static void logTrace(String message){
		log.trace(message);
	}

}
