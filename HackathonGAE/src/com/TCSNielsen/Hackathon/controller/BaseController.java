package com.TCSNielsen.Hackathon.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BaseController {

	/**
	 * Variable to hold the LOGGER instance to be used across all the controller
	 * classes.
	 */
	protected final Log LOGGER = LogFactory.getLog(getClass());
}