package com.tcs.services;

import com.tcs.Application;
import com.tcs.lists.Lists;
import com.tcs.lists.PopulateQueryLists;
import com.tcs.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class DatabaseService {

    @Autowired
    PopulateQueryLists query;
    private JdbcTemplate jdbcTemplate;

    public static String inputStreamToString(InputStream is) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            return br.lines().collect(Collectors.joining(System.lineSeparator()));
        }
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void getData() throws InterruptedException {
        try {
            jdbcTemplate.queryForObject("SELECT COUNT(*) FROM DUAL", Integer.class);
        } catch (Exception e) {
            TimeUnit.SECONDS.sleep(5);
        }
        String content = "";
        ClassPathResource classPathResource = new ClassPathResource("/WPQUERY.txt");
        try {
            InputStream is = classPathResource.getInputStream();
            content = inputStreamToString(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(content);
        query.querylists(rows);
    }

    public void getElogBookAircrafts() throws InterruptedException {
        try {
            jdbcTemplate.queryForObject("SELECT COUNT(*) FROM DUAL", Integer.class);
        } catch (Exception e) {
            TimeUnit.SECONDS.sleep(5);
        }
        String content = "";
        ClassPathResource classPathResource = new ClassPathResource("/FetchELogbookAircrafts.txt");
        try{
            InputStream is = classPathResource.getInputStream();
            content = inputStreamToString(is);
        }catch (IOException e){
            e.printStackTrace();
        }
        List<ElogBookRego> rows = jdbcTemplate.query(content, new BeanPropertyRowMapper(ElogBookRego.class));
        Lists.eLogBookRegos.clear();
        rows.forEach(row -> {
            Lists.eLogBookRegos.add(row);
        });
        Lists.eLogBookRegosString.clear();
        for(ElogBookRego row : Lists.eLogBookRegos){
            Lists.eLogBookRegosString.add(row.getRego());
        }

//        Collections.addAll(Lists.eLogBookRegos, "VXK","VXB","VXP","VXE","VXT","VXA","VXL","VXG","VXU","VXD","VXM","VXF","VXN","VXR","VXJ","VXO","VXC","VXS");
        Application.logger.info("List Of Elogbook Aircrafts has been updated.");
    }

    public void getGraphDataForNonAustralianPorts() throws InterruptedException {
        Application.logger.info("Getting Graph data for Non-Australian Ports");
        try {
            jdbcTemplate.queryForObject("SELECT COUNT(*) FROM DUAL", Integer.class);
        } catch (Exception e) {
            Application.logger.error(e.toString());
            TimeUnit.SECONDS.sleep(5);
        }
        String content = "";
        ClassPathResource classPathResource = new ClassPathResource("/GraphData.txt");
        try (InputStream is = classPathResource.getInputStream()) {
            content = inputStreamToString(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<CommitWP> rows = jdbcTemplate.query(content, new BeanPropertyRowMapper(CommitWP.class));
        Lists.commitWPList.clear();
        rows.forEach(row -> {
            setMOUHrsForNonAustralianPorts(row);
            Lists.commitWPList.add(row);
        });
        Application.logger.info("WP Data fetched for Non-Australian Ports");
    }

    public void setMOUHrsForNonAustralianPorts(CommitWP commitWP) {
        String location = commitWP.getWpLocation();
        String dayOfWeek = commitWP.getDayOfWeek();
        Optional<MOUHours> mou = Lists.mouHoursArrayList.stream()
                .filter(mouHours -> mouHours.getLocation().trim().equalsIgnoreCase(location) && mouHours.getDay().equalsIgnoreCase(dayOfWeek))
                .findFirst();
        mou.ifPresent(mouHours -> commitWP.setMouHR(mouHours.getHrs()));
    }

    public void getGraphDataForAustralianPorts() throws InterruptedException {
        Application.logger.info("Getting Graph data for Australian Ports");
        try {
            jdbcTemplate.queryForObject("SELECT COUNT(*) FROM DUAL", Integer.class); //test the connection
        } catch (Exception e) {
            TimeUnit.SECONDS.sleep(5);
        }
        String content = "";
        ClassPathResource classPathResource = new ClassPathResource("/GraphDataAustralianPorts.txt");
        try (InputStream is = classPathResource.getInputStream()) {
            content = inputStreamToString(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<CommitWPAustralianPorts> rows = jdbcTemplate.query(content, new BeanPropertyRowMapper(CommitWPAustralianPorts.class));
        Lists.commitWPListAustralianPorts.clear();
        rows.forEach(row -> {
            setMOUHrsForAustralianPorts(row);
            Lists.commitWPListAustralianPorts.add(row);
        });
        Application.logger.info("WP Data fetched for Australian Ports");
    }

    public void setMOUHrsForAustralianPorts(CommitWPAustralianPorts commitWPAustralianPorts) {
        String location = commitWPAustralianPorts.getWpLocation();  
        String dayOfWeek = commitWPAustralianPorts.getDayOfWeek();
        String slot = commitWPAustralianPorts.getSlot();
        Optional<MOUHoursAustralianPorts> mou = Lists.mouHoursArrayListAustralianPorts.stream()
                .filter(mouHours -> mouHours.getLocation().trim().equalsIgnoreCase(location) && mouHours.getDay().trim().equalsIgnoreCase(dayOfWeek) && mouHours.getSlot().trim().equalsIgnoreCase(slot))
                .findFirst();
        mou.ifPresent(mouHours -> commitWPAustralianPorts.setMouHR(mouHours.getHrs()));
    }

    public void getGraphDrillData() {
        Application.logger.info("Getting Graph drilled down data for both Australian and Non-Australian Ports");
        String content = "";
        ClassPathResource classPathResource = new ClassPathResource("/GraphDataDrill.txt");
        try (InputStream is = classPathResource.getInputStream()) {
            content = inputStreamToString(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<CommitWPDrill> rows = jdbcTemplate.query(content, new BeanPropertyRowMapper(CommitWPDrill.class));
        Lists.commitWPDrillList.clear();
        rows.forEach(row -> {
            Lists.commitWPDrillList.add(row);
        });
        Application.logger.info("WP Drill down data fetched");
    }
    public void getGraphDataSam() {
        Application.logger.info("Getting Graph data for SAM Dashboard");
        String content = "";
        ClassPathResource classPathResource = new ClassPathResource("/GraphDataSam.txt");
        try (InputStream is = classPathResource.getInputStream()) {
            content = inputStreamToString(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<CommitWPSam> rows = jdbcTemplate.query(content, new BeanPropertyRowMapper(CommitWPSam.class));
        Lists.commitWPSamList.clear();
        rows.forEach(row -> {
            setSamMOUHrs(row);
            Lists.commitWPSamList.add(row);
        });
        Application.logger.info("WP SAM data fetched");
    }

    public void getGraphDataSamDetail() {
        Application.logger.info("Getting Graph drilled down data for SAM Dashboard");
        String content = "";
        ClassPathResource classPathResource = new ClassPathResource("/GraphDataSamDetail.txt");
        try (InputStream is = classPathResource.getInputStream()) {
            content = inputStreamToString(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<CommitWPSamDetail> rows = jdbcTemplate.query(content, new BeanPropertyRowMapper(CommitWPSamDetail.class));
        Lists.commitWPSamListDetail.clear();
        rows.forEach(row -> {
            Lists.commitWPSamListDetail.add(row);
        });
        Application.logger.info("WP SAM drill down data fetched");
    }

    public void setSamMOUHrs(CommitWPSam commitWPSam) {
        String chkGroup = commitWPSam.getCheckGroup();
        String assembly = commitWPSam.getAssembly();
        String day = commitWPSam.getDayOfWeek();
        String location = commitWPSam.getLoc();
        Optional<SamMOUHours> samMou = Lists.samMouHrsArrayList.stream()
                .filter(mouHours -> mouHours.getCheckGroup().trim().equalsIgnoreCase(chkGroup) && mouHours.getAssembly().equalsIgnoreCase(assembly)
                        && mouHours.getLocation().equalsIgnoreCase(location) && mouHours.getDay().equalsIgnoreCase(day))
                .findFirst();
        samMou.ifPresent(mouHours -> commitWPSam.setMouHR(mouHours.getHrs()));
        samMou.ifPresent(mouHours -> commitWPSam.setDaymou(commitWPSam.getOverHR() - commitWPSam.getMouHR()));
    }

}
