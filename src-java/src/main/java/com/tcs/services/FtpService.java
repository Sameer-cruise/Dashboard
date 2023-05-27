package com.tcs.services;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 547885 on 12/12/2016.
 */
@Service
public class FtpService {

    public String  sendFile(String filename)
    {
        FTPClient ftpClient = new FTPClient();

        FileInputStream fis = null;

        Boolean data=null;

        try {
            ftpClient.connect("10.153.255.225");

            ftpClient.login("moc-bcp", "mainteix1");

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            fis = new FileInputStream(filename);

            data=ftpClient.storeFile("BCP_Testing_Flights/"+filename, fis);

            ftpClient.logout();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (fis != null) {

                    fis.close();

                }

                ftpClient.disconnect();

            } catch (IOException e) {

                e.printStackTrace();

            }


        }
        return data.toString();

    }
}
