package com.gmail.libra.learn;


import java.util.Properties;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.JobExecution;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BatchTest {
	@Test
	public void run() throws Exception {
		JobOperator operator = BatchRuntime.getJobOperator();
		long id = operator.start("job", new Properties());
		JobExecution execution = operator.getJobExecution(id);
		while (execution.getExitStatus() == null)
			Thread.sleep(1000);
	}
}
