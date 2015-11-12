/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.task.config;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Glenn Renfro
 */
@Aspect
@Component
public class TaskHandler  {

	@Autowired
	private ApplicationContext context;

	@Autowired
	private TaskRepository repository;


	int resultCode = -1;
	//TODO: Add method for initializing entry in Task Repo


//	@AfterReturning("execution(* org..Sample*.*(..))")
//	public void logServiceAccess(JoinPoint joinPoint) {
//		System.out.println("			All Methods: " + joinPoint);
//	}

	@AfterReturning("execution(* org.springframework.boot.CommandLineRunner.run(..))")
	public void anotherPointCut(JoinPoint joinPoint) {

		System.out.println("CommandLineRunnerCaught: " + joinPoint);
	}

	@AfterReturning("execution(* run(..))")
	public void logExit(JoinPoint joinPoint) {
		System.out.println("		All Runs: " + joinPoint);
	}

	@AfterReturning("within( @org.springframework.cloud.task.annotation.Task *) && execution(* org.springframework.boot.CommandLineRunner.run(..))")
	public void annotationMe(JoinPoint joinPoint) {
		int result = 0;
		try {
			List<ExitCodeGenerator> generators = new ArrayList<ExitCodeGenerator>();
			generators
					.addAll(context.getBeansOfType(ExitCodeGenerator.class).values());
			for (ExitCodeGenerator generator : generators) {
				result = generator.getExitCode();
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		repository.storeCode(result);
		System.out.println("****Annotated Runs: " + joinPoint);
	}

		@AfterThrowing("execution(* run(..))")
	public void logException(JoinPoint joinPoint) {
		System.out.println("Exception Run: " + joinPoint);
		repository.storeCode(1);
	}
}
