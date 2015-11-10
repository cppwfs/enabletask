package org.springframework.cloud.task.module.sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by glennrenfro on 9/3/15.
 */
public class TimestampLogger{
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private String format;

	TimestampLogger(String format){
		this.format = format;
	}
	void logTimestamp(){
		DateFormat formatter = new SimpleDateFormat(format);
		logger.info(formatter.format(new Date()));

	}

}
