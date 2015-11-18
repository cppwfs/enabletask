package org.springframework.cloud.task.repository;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 Represents the state of the Task for each execution
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
public @Data class  TaskExecution {

	/**
	 * 	The unique id  associated with the task execution
	 */
	private String executionId;

	/**
	 * The recorded exit code for the task
	 */
	private int exitCode;

	/**
	 * User defined name for the task
	 */
	private String taskName;

	/**
	 * Time of when the task was started
	 */
	private Date startTime;

	/**
	 * Timestamp of when the task was completed/terminated
	 */
	private Date endTime;

	/**
	 * TBD
	 */
	private String statusCode;

	/**
	 * Message returned from the task or stacktrace.parameters
	 */
	private String exitMessage;

	/**
	 * The parameters that were used for this task execution
	 */
	private List<String> parameters;

}
