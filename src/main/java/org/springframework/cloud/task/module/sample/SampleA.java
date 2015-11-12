package org.springframework.cloud.task.module.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Represents a component that is not marked as a task.  It should run but not be picked
 * up by the aspect.
 */
@Component
public class SampleA implements CommandLineRunner{

	@Autowired
	TimestampLogger mylog;

	@Override
	public void run(String... args) {
//		if (true){
//			throw new RuntimeException("wooho");
//		}
		mylog.logTimestamp();
	}

}
