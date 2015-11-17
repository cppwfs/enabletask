package org.springframework.cloud.task.repository;

/**
 * Created by glennrenfro on 11/12/15.
 */

public class SimpleTaskRepository implements TaskRepository {
	public void update(TaskExecution taskExecution) {
		System.out.println("THE CODE FOR TASK: " + taskExecution.getExecutionId() + " IS " + taskExecution.getExitCode());
	}

	public void createTaskExecution(TaskExecution taskExecution) {
		System.out.println("Storing " + taskExecution.getTaskName() + " for executionID "+ taskExecution.getExecutionId());
	}
}
