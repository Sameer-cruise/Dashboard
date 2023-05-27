package com.tcs.services;

import com.tcs.Application;
import com.tcs.lists.Lists;
import com.tcs.model.MOUHours;
import com.tcs.model.MOUHoursAustralianPorts;
import com.tcs.model.SamMOUHours;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReadPropertyFile {
    public List<MOUHours> readMOUHours(String path) {
        Lists.appLogs.put("MOU FILE", "The MOU file has been read at Local Time:" + LocalTime.now());
        List<MOUHours> mouHoursList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("MOUHours.txt"));
            mouHoursList = br.lines()
                    .skip(1)
                    .map(line -> line.split(","))
                    .map(array -> new MOUHours(array[1], array[0], Integer.parseInt(array[2])))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mouHoursList;
    }

    public List<MOUHoursAustralianPorts> readMOUHoursAustralianPorts(String path) {
        Lists.appLogs.put("MOU FILE", "The MOU file has been read at Local Time:" + LocalTime.now());
        List<MOUHoursAustralianPorts> mouHoursListAustralianPorts = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("MOUHoursAustralianPorts.txt"));
            mouHoursListAustralianPorts = br.lines()
                    .skip(1)
                    .map(line -> line.split(","))
                    .map(array -> new MOUHoursAustralianPorts(array[1], array[0], array[2], Integer.parseInt(array[3])))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mouHoursListAustralianPorts;
    }

    public List<SamMOUHours> readSamMOUHours(String path) {
        Lists.appLogs.put("SAM MOU FILE", "The SAM MOU file has been read at Local Time:" + LocalTime.now());
        List<SamMOUHours> samMouHoursList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("MOUHoursSAM.txt"));
            samMouHoursList = br.lines().skip(1).map(line -> line.split(","))
                    .map(array -> new SamMOUHours(array[0], array[1], array[2], array[3], Integer.parseInt(array[4])))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return samMouHoursList;
    }
}