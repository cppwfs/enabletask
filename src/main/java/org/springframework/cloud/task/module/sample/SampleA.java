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
import org.springframework.cloud.task.annotation.Task;
import org.springframework.stereotype.Component;

/**
 * Represents a component that is not marked as a task.  It should run but not be picked
 * up by the aspect.
 */
@Task
@Component
public class SampleA implements CommandLineRunner {

	@Autowired
	TimestampLogger mylog;

	@Override
	public void run(String... args) {
		mylog.logTimestamp();
	}

}
