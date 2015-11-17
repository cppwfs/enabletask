package org.springframework.cloud.task.repository;

/**
 *TaskRepository interface offers methods that create and update task execution
 *information.  The interface will support the following methods:
 * @author Glenn Renfro
 */
public interface TaskRepository {

	/**
	 * Notifies the repository that a taskExecution needs to be updated.
	 * @param taskExecution taskExecution to be updated
	 */
	public void update(TaskExecution taskExecution) ;

	/**
	 * Notifies the repository that a taskExecution needs to be created.
	 * @param taskExecution taskExecution to be recorded
	 */
	public void createTaskExecution(TaskExecution taskExecution) ;
}
