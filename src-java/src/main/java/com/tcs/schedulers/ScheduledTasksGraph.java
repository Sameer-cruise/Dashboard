package com.tcs.schedulers;

import com.tcs.Application;
import com.tcs.lists.Lists;
import com.tcs.services.DatabaseService;
import com.tcs.services.ReadPropertyFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@Profile({"ALL", "WORKLOAD"})
public class ScheduledTasksGraph {
    @Autowired
    DatabaseService databaseService;

    @Autowired
    ReadPropertyFile readPropertyFile;

    @Scheduled(fixedRate = 600000, initialDelay = 10000)
    @Async  //The two schedulers have to be run together, hence mentioned as async
    public void getWorkpackageGraphData() throws InterruptedException {
        updateMOUHoursFileForNonAustralianPorts();
        updateMOUHoursFileForAustralianPorts();
        updateSAMMOUHoursFile();
        databaseService.getElogBookAircrafts();
        databaseService.getGraphDataForNonAustralianPorts();
        databaseService.getGraphDataForAustralianPorts();
        databaseService.getGraphDrillData();
        databaseService.getGraphDataSam();
        databaseService.getGraphDataSamDetail();

    }

    public void updateMOUHoursFileForNonAustralianPorts() {
        Application.logger.info("Updating the MOU Hours File for Non-Australian Ports");
        Lists.mouHoursArrayList.clear();
        Lists.mouHoursArrayList = readPropertyFile.readMOUHours("");
    }

    public void updateMOUHoursFileForAustralianPorts() {
        Application.logger.info("Updating the MOU Hours File for Australian Ports");
        Lists.mouHoursArrayListAustralianPorts.clear();
        Lists.mouHoursArrayListAustralianPorts = readPropertyFile.readMOUHoursAustralianPorts("");
    }

    public void updateSAMMOUHoursFile() {
        Application.logger.info("Updating the SAM MOU Hours File");
        Lists.samMouHrsArrayList.clear();
        Lists.samMouHrsArrayList = readPropertyFile.readSamMOUHours("");
    }


}
