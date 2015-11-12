package org.springframework.cloud.task.repository;

import java.util.List;
import java.util.Set;

/**
 * @author Glenn Renfro
 */
public interface TaskExplorer {

	/**
	 * Retrieve a {@link TaskExecution} by its id.
	 *
	 * @param executionId the task execution id
	 * @return the {@link TaskExecution} with this id, or null if not found
	 */
	TaskExecution getTaskExecution(Long executionId);


	/**
	 * @param taskName the name of the task
	 * @return the set of running executions for tasks with the specified name
	 */
	Set<TaskExecution> findRunningTaskExecutions(String taskName);

	/**
	 * Query the repository for all unique {@link TaskExecution} names (sorted
	 * alphabetically).
	 *
	 * @return the set of task names that have been executed
	 */
	List<String> getTaskNames();

}
