package org.openmrs.module.patientdata.task;

import java.util.Date;

import org.openmrs.scheduler.tasks.AbstractTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlagPatientTask extends AbstractTask {
	
	private static final Logger log = LoggerFactory.getLogger(FlagPatientTask.class);
	
	/**
	 * Public constructor.
	 */
	public FlagPatientTask() {
		log.debug("Flag patient task created at " + new Date());
	}
	
	@Override
	public void execute() {
		log.debug("executing Flag Patient task");
		super.startExecuting();
		// TO DO
	}
	
	@Override
	public void shutdown() {
		log.debug("shutting down hello world task");
		this.stopExecuting();
	}
}
