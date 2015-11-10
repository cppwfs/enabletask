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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.annotation.Task;
import org.springframework.cloud.task.config.TaskStatus;
import org.springframework.context.ApplicationContext;

/**
 * Executes a batch job that logs a timestamp
 *
 * @author Glenn Renfro
 */
@SpringBootApplication
@Task
public class SampleTaskApplication implements CommandLineRunner {

	@Autowired
	TimestampLogger mylog;

	@Autowired
	TaskStatus taskStatus;

	private static ApplicationContext myContext= null;
	
	public static void main(String[] args) throws Exception {
		myContext = SpringApplication.run(SampleTaskApplication.class, args);
 		System.exit(SpringApplication.exit(myContext));
	}

	@Override
	public void run(String... args) {
		taskStatus.setExitCode(22);
		taskStatus.setExitMessage("WOW THIS WAS A GREAT RUN!");
		mylog.logTimestamp();
	}

}