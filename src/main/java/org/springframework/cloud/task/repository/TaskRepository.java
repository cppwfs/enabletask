package org.springframework.cloud.task.repository;

/**
 * Created by glennrenfro on 11/10/15.
 */
public interface TaskRepository {

	public void update(String uuId, int code) ;

	public void createTaskInstance(String uuId) ;
}
