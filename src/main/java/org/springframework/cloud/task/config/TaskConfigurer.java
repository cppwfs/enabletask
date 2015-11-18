package org.springframework.cloud.task.config;

import org.springframework.cloud.task.repository.TaskExplorer;
import org.springframework.cloud.task.repository.TaskRepository;

/**
 * Provides a strategy interface for providing configuration
 * customization to the task system.
 *
 * @author Glenn Renfro
 */
public interface TaskConfigurer {
	/**
	 * Factory method for a {@link TaskRepository}
	 * @return A TaskRepository
	 */
	public TaskHandler getTaskHandler();

	/**
	 * Factory method for a {@link TaskExplorer}
	 * @return A TaskExplorer
	 */
	public TaskRepository getTaskRepository();

}
