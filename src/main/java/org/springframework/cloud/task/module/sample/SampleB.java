package org.springframework.cloud.task.module.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.annotation.Task;

/**
 * Represents a Task and its status will be recorded to a Task Repository.
 */
@Task
public class SampleB implements CommandLineRunner {

	@Autowired
	TimestampLogger mylog;

	@Override
	public void run(String... args) {
		mylog.logTimestamp();
	}

}
