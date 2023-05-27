package com.tcs.services;

import com.tcs.lists.Lists;
import com.tcs.commons.CommonFunctions;
import com.tcs.model.AtlasBoardView;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 547885 on 12/12/2016.
 */
@Service
public class ExcelService {

    @Autowired
    FtpService ftpservice;

    public void generateBCPReport() {

        String locations[] = "SYD,SYDD,MELD,BNED,PERD,ADLD,ASPD,DRWD,TSVD,CNSD,CBRD,LAXD".split(",");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy HH:mm:ss");

        String wpHeader = "LAST FLIGHT~ARRIVAL TIME~CURRENT PORT~NEXT FLIGHT~DEPARTURE TIME~NEXT PORT~BARCODE~AIRCRAFT~STATUS~PRINTED~EMAILED~CONFIRMED RECEIPT OF PACKAGE~MOC RECEIVED~UPDATED IN BCSE~UPDATED IN PROD";
        String flHeader = "LAST FLIGHT~ARRIVAL TIME~CURRENT PORT~NEXT FLIGHT~DEPARTURE TIME~NEXT PORT~AIRCRAFT";
        List<String> dataDump = new ArrayList<String>();
        List<String> flightDump = new ArrayList<String>();
        dataDump.add(wpHeader);
        flightDump.add(flHeader);

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("WORK_PACKAGE");
        XSSFSheet flightsheet = workbook.createSheet("FLIGHTS");

        CellStyle style = workbook.createCellStyle();
        style.setFillBackgroundColor(IndexedColors.BLUE.getIndex());
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);

        Font font = workbook.createFont();
        font.setColor(IndexedColors.WHITE.getIndex());
        style.setFont(font);

        int rownum = 0;
        int srownum = 0; //second sheet

        for (String location : locations) {
            List<AtlasBoardView> localList = new ArrayList<>(Lists.AtlasBoardViewList.get(location));
            List<String> localDump = new ArrayList<String>();
            List<String> flightLocalDump = new ArrayList<String>();

            for (AtlasBoardView atlas : localList) {
                if (!atlas.getWorkpack().split(",")[0].equalsIgnoreCase(" ")) {
                    localDump.add(atlas.getOwner() + atlas.getArrfltno() + "~" + sdf.format(atlas.getArrivalDateUTC()).toUpperCase() + "~" + atlas.getPort() + "~" + atlas.getOwner() + atlas.getDepfltno() + "~" +
                            sdf.format(atlas.getDeptDateUTC()).toUpperCase() + "~" + atlas.getNxtport() + "~" + atlas.getWorkpack().split(",")[0] + "~" + atlas.getRego()
                            + "~" + atlas.getWorkpack().split(",")[1] + "~" + "" + "~" + "" + "~" + "" + "~" + "" + "~" + "" + "~" + "");
                }

                if (!(atlas.getArrstatus().equalsIgnoreCase("ARRIVED") && atlas.getDeptstatus().equalsIgnoreCase("DEPARTED")) &&
                        (CommonFunctions.displaylogic(atlas).equals("YES")) || (!(atlas.getWorkpack().split(",")[0].equals(" ")) )) {
                    flightLocalDump.add(atlas.getOwner() + atlas.getArrfltno() + "~" + sdf.format(atlas.getArrivalDateUTC()).toUpperCase() + "~" + atlas.getPort() + "~" + atlas.getOwner() + atlas.getDepfltno() + "~" +
                            sdf.format(atlas.getDeptDateUTC()).toUpperCase() + "~" + atlas.getNxtport()+"~"+atlas.getRego());
                }
            }

            dataDump.addAll(localDump);
            flightDump.addAll(flightLocalDump);
        }

            for (String dump : dataDump) {

                Row rows = sheet.createRow(rownum++);
                String extractData[] = dump.split("~");

                int cellcnt = 0;

                for (String cellData : extractData) {
                    Cell cell = rows.createCell(cellcnt++);
                    if (rownum == 1) {
                        cell.setCellValue(cellData);
                        cell.setCellStyle(style);
                    } else {
                        cell.setCellValue(cellData);
                    }
                }

            }

            for (String dump : flightDump) {

                Row rows = flightsheet.createRow(srownum++);
                String extractData[] = dump.split("~");

                int cellcnt = 0;

                for (String cellData : extractData) {
                    Cell cell = rows.createCell(cellcnt++);
                    if (srownum == 1) {
                        cell.setCellValue(cellData);
                        cell.setCellStyle(style);
                    } else {
                        cell.setCellValue(cellData);
                    }
                }

            }
        String dateAppend = LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyy")).toUpperCase();
        excelWriter("BCP_Flight_Report_" + dateAppend + ".xlsx", workbook);
    }

    private void excelWriter(String filename, XSSFWorkbook workbook) {

        FileOutputStream fos = null;
        String result = null;
        try {
            fos = new FileOutputStream(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        result = ftpservice.sendFile(filename);
        if (result.equalsIgnoreCase("true")) {
            deletefile(filename);  //delete the file after creation
            
        }
    }

    private void deletefile(String filename) {
        try{

            File file = new File(filename);

            file.delete();

        }catch(Exception e){

            e.printStackTrace();

        }
    }
}

