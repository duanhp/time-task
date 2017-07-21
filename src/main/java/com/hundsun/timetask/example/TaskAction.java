/**
 * 
 */
package com.hundsun.timetask.example;

import org.apache.log4j.Logger;

/**
 * @author hspcadmin
 *
 */
public class TaskAction {
	
	private static Logger logger = Logger.getLogger(TaskAction.class);
	
	private int iCount=0;
	
	public void doSomething(){
		logger.info("testing task."+iCount);
		iCount++;
	}

}
