package com.ecommerce.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtils {

	private LoggerUtils() {
	}

	public static Logger getLogger(Class<?> clazz) {
		return LogManager.getLogger(clazz);
	}
}