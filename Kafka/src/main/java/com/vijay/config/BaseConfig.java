package com.vijay.config;

import java.io.File;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseConfig {
	private static Configuration config = null;
	private static Logger logger = null;

	static {
		try {
			logger = LogManager.getLogger();
			config = new Configurations().properties(new File("configuration.properties"));
		} catch (ConfigurationException cex) {
			// Something went wrong
		}
	}

	/**
	 * @return the logger
	 */
	public static final Logger getLogger() {
		return logger;
	}

	/**
	 * @param logger the logger to set
	 */
	public static void setLogger(Logger logger) {
		BaseConfig.logger = logger;
	}

	/**
	 * @return the config
	 */
	public static final Configuration getConfig() {
		return config;
	}
}
