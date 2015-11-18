package org.springframework.cloud.task.repository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by glennrenfro on 11/18/15.
 */
@Component
public class LoggerTaskRepository  implements TaskRepository{
	Logger logger = LoggerFactory.getLogger(LoggerTaskRepository.class);
	@Override
	public void update(TaskExecution taskExecution) {
		logger.info("Updating: " + taskExecution.toString());
	}

	@Override
	public void createTaskExecution(TaskExecution taskExecution) {
		logger.info("Creating: " + taskExecution.toString());
	}
}
