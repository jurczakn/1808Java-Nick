package com.revature.driver;

import com.revature.util.LoggingUtil;

public class Driver {
	
	public static void main(String[] args) {
		LoggingUtil.logFatal("Fatal");
		LoggingUtil.logError("Error");
		LoggingUtil.logWarn("Warn");
		LoggingUtil.logInfo("Info");
		LoggingUtil.logDebug("Debug");
		LoggingUtil.logTrace("trace");
	}

}
