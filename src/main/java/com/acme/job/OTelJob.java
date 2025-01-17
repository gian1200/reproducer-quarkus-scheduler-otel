package com.acme.job;

import io.quarkus.logging.Log;
import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OTelJob {

	@Scheduled(cron = "0 * * ? * *")
	void runSchedulerWithCron() {
		Log.info("This log should have traceid");
	}

}