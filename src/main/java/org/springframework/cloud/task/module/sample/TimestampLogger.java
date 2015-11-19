/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.task.module.sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Glenn Renfro
 */
public class TimestampLogger {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private String format;

	TimestampLogger(String format) {
		this.format = format;
	}

	void logTimestamp() {
		DateFormat formatter = new SimpleDateFormat(format);
		logger.info(formatter.format(new Date()));

	}

}
