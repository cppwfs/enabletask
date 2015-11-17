package org.springframework.cloud.task.repository;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by glennrenfro on 11/12/15.
 */
@AllArgsConstructor
public @Data class  TaskExecution {
	private String executionId;
	private int exitCode;
	private String taskName;
}
