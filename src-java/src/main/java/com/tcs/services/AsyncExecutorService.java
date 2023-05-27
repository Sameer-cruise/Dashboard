package com.tcs.services;

import com.tcs.Application;
import com.tcs.components.GenReconcile;
import com.tcs.components.QSOAFlights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.concurrent.Future;

@Service
public class AsyncExecutorService {

    @Autowired
    QSOAFlights qsoaFlights;
    @Autowired
    DatabaseService databaseService;
    @Autowired
    GenReconcile reconcile;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Async
    public Future<String> getFlights() throws InterruptedException {

        Application.logger.info("Getting the Flights fron QSOA");
        qsoaFlights.getFlightResponse();
        Application.logger.info("QSOA Data has been retrieved");
        return new AsyncResult<String>("Flight Success");
    }

    @Async
    public Future<String> getQueryData() throws InterruptedException {
        Application.logger.info("Getting the WP fron MX");
        databaseService.getData();
        Application.logger.info("Mx Data has been retrieved");
        return new AsyncResult<String>("WP Success");
    }

    public Future<String> getReconciledData(String loc) throws InterruptedException {
        Application.logger.info("Reconciling data for " + loc);
        reconcile.reconcileforloc(loc);
        return new AsyncResult<String>("WP Success");
    }
}
