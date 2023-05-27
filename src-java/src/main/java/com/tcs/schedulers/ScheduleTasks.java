package com.tcs.schedulers;

import com.tcs.Application;
import com.tcs.lists.Lists;
import com.tcs.services.AsyncExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.Future;

@Component
@EnableAsync
@Profile({"ALL", "ENG"})
public class ScheduleTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Autowired
    AsyncExecutorService asyncService;

    @Scheduled(fixedRate = 300000, initialDelay = 5000)
    @Async    //The two schedulers have to be run together, hence mentioned as async
    public void getQSOAData() throws InterruptedException {
        Application.logger.info("We have reached the scheduling class");
        Future<String> queryData = null;
        Future<String> flights;
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        LocalTime local = LocalTime.now(Clock.systemUTC());
        LocalDateTime localDateTime = LocalDateTime.now(Clock.systemUTC());

        if (local.getMinute() % 5 != 0 && local.getSecond() != 0) {
            int offset = local.getSecond();
            Application.logger.info("The local time is:" + local.plusSeconds(60 - offset).format(formatter));
            Application.logger.info("The future time is:" + local.plusSeconds(60 - offset).plusMinutes(5).format(formatter));
            Lists.currentRun = local.plusSeconds(60 - offset).format(formatter);
            Lists.nextRun = local.plusSeconds(60 - offset).plusMinutes(5).format(formatter);
            Lists.localDateTime = localDateTime.plusSeconds(60 - offset).plusMinutes(5);
        } else if (local.getMinute() % 5 == 0 && local.getSecond() != 0) {
            int offset = local.getSecond();
            Application.logger.info("The local time is:" + local.minusSeconds(offset).format(formatter));
            Application.logger.info("The future time is:" + local.minusSeconds(offset).plusMinutes(5).format(formatter));
            Lists.currentRun = local.minusSeconds(offset).format(formatter);
            Lists.nextRun = local.minusSeconds(offset).plusMinutes(5).format(formatter);
            Lists.localDateTime = localDateTime.minusSeconds(offset).plusMinutes(5);
        } else {
            Application.logger.info("The local time is:" + local.format(formatter));
            Application.logger.info("The future time is:" + local.plusMinutes(5).format(formatter));
            Lists.currentRun = local.format(formatter);
            Lists.nextRun = local.plusMinutes(5).format(formatter);
            Lists.localDateTime = localDateTime.plusMinutes(5);
        }

        flights = asyncService.getFlights();
        try {
            queryData = asyncService.getQueryData();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            String comQueryData = queryData.get();
            String comFlights = flights.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String locations[] = "SYD,MEL,BNE,PER,ADL,ASP,DRW,TSV,CNS,CBR,LAX,AKL,CHC,WLG,SIN,ZQN".split(",");
            for (String location : locations) {
                asyncService.getReconciledData(location);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Application.logger.info("Job Completed Entirely " + dateFormat.format(new Date()));
        }

    }

}
