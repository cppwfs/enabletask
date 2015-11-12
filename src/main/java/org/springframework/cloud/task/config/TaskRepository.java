package org.springframework.cloud.task.config;

/**
 * Created by glennrenfro on 11/10/15.
 */
public class TaskRepository {

	public void taskExit(String uuId, int code) {
		System.out.println("THE CODE FOR TASK: " + uuId + " IS " + code);
	}

	public void createTaskInstance(String uuId) {
		System.out.println("Storing " + uuId);
	}
}
