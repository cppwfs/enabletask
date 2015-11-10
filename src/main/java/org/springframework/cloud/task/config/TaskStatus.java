package org.springframework.cloud.task.config;

/**
 * Created by glennrenfro on 11/10/15.
 */
public class TaskStatus  {

	private int exitCode = 0;

	private String exitMessage = "";

	public int getExitCode() {
		return exitCode;
	}

	public void setExitCode(int exitCode) {
		this.exitCode = exitCode;
	}

	public String getExitMessage() {
		return exitMessage;
	}

	public void setExitMessage(String exitMessage) {
		this.exitMessage = exitMessage;
	}

}
