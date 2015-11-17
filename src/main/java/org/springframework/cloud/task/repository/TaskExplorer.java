package org.springframework.cloud.task.repository;

import java.util.List;
import java.util.Set;

/**
 * Offers methods that allow users to query the task executions that are available.
 * @author Glenn Renfro
 */
public interface TaskExplorer {

	/**
	 * Retrieve a {@link TaskExecution} by its id.
	 *
	 * @param executionId the task execution id
	 * @return the {@link TaskExecution} with this id, or null if not found
	 */
	public TaskExecution getTaskExecution(Long executionId);


	/**
	 * retrieve a collection of taskExecutions that have the task name provided.
	 * @param taskName the name of the task
	 * @return the set of running executions for tasks with the specified name
	 */
	public Set<TaskExecution> findRunningTaskExecutions(String taskName);

	/**
	 * Retrieve a list of available task names.
	 *
	 * @return the set of task names that have been executed
	 */
	public List<String> getTaskNames();

	/**
	 * Get number of executions for a taskName.
	 * @param taskName the name of the task to be searched
	 * @return the number of running tasks that have the taskname specified
	 */
	public long getTaskExecutionCount(String taskName);

	/**
	 * Get a collection/page of executions
 	 * @param taskName the name of the task to be searched
	 * @param start the position of the first execution to return
	 * @param count the number of executions to return
	 * @return list of task executions
	 */
	public List<TaskExecution> getTaskExecutionsByName(String taskName, int start, int count);


}
