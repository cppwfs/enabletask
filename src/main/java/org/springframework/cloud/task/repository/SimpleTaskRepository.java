package org.springframework.cloud.task.repository;

/**
 * Created by glennrenfro on 11/12/15.
 */

public class SimpleTaskRepository implements TaskRepository {
	public void update(String uuId, int code) {
		System.out.println("THE CODE FOR TASK: " + uuId + " IS " + code);
	}

	public void createTaskInstance(TaskExecution taskExecution) {
		System.out.println("Storing " + taskExecution.getTaskName() + " for executionID "+ taskExecution.getExecutionId());
	}
}
