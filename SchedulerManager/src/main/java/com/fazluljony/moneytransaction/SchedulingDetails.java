package com.fazluljony.moneytransaction;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



@Component
public class SchedulingDetails {
	
	private static Logger logger = LoggerFactory.getLogger(SchedulingDetails.class);
	
	
	@Scheduled(initialDelay=30000, fixedDelay= 30000)
	public void timebaseScheduled()
	{
		logger.info("Scheduler is working: {}", new Date());
	}
	
	
	/*
	 0 "*"/5 * * * *-> Every Five Minutes("" is used as special key)

     0 0 10 * * * * -> Everyday 10 AM

     0 0 10  * * SUN -> Every Sunday 10AM

     0 0 10 * * MON-FRI -> Monday to Friday 10AM
     0 0 10 1 * * -> Every 1st day for month 10 AM 
	 */
	
	@Scheduled(cron="0 30 12 * * *")
	public void timebaseScheduledonAtime()
	{
		logger.info("Scheduler is working at every second: {}", new Date());
	}
	
	

}
