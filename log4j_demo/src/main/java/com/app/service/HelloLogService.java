package com.app.service;

import org.apache.log4j.Logger;

import com.app.main.HelloLog4j;

public class HelloLogService {
	private static Logger log = Logger.getLogger(HelloLogService.class);
	
	public void helloLog() {
		log.info("Hello from log service helloLog()");
		log.info("Bye from log service helloLog()");
	}

}
